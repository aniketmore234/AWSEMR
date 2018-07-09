
# coding: utf-8

# In[72]:


#Import necessary libraries
import pandas as pd
import json
import colorbrewer

# In[73]:


#Read scrapped JSON file in pandas dataframe
df=pd.read_json('stocks.json')


# In[74]:


#Function to convert Million and Billion string values to proper floating values
powers = {'B': 10 ** 9, 'M': 10 ** 6}
def f(s):
    power=s[-1]
    return float(s[:-1])*powers[power]


# In[75]:


#Extract MarketCap values from list object as scrapped.
df['MarketCap'] = df['MarketCap'].str[0]


# In[76]:


#Filter NULL Values
df = df[df['MarketCap'] != 'N/A']


# In[77]:


#Extract Volume values from list object as scrapped.
df['Volume'] = df['Volume'].str[0]
df = df[df['Volume'] != 'N/A']


# In[78]:


# DRop null valued rows
df=df.dropna()


# In[79]:


#Function to convert 1,00,000 type string values to -> 100000 in integer form.
def remove_comma(x):
    return int(x.replace(',',''))
df['Volume']=df['Volume'].apply(remove_comma)


# In[80]:


#Filter Nan values
import numpy as np
df = df[df['PercentGain'] != float(np.nan)]


# In[81]:


#Extract PercentGain values from list objects
df['PercentGain'] = df['PercentGain'].str[0]


# In[82]:


#Function to slice Percent_Change values from scrapped string value
def prcntg(x):
    if (x!=np.NaN):
        return float(x[-6:-2])


# In[83]:


#Filter NULL values
df=df.dropna()


# In[84]:


df['PercentGain']=df['PercentGain'].apply(prcntg)


# In[85]:


df['MarketCap'] = df['MarketCap'].apply(f)


# In[86]:


#Function to put MarketCap,PercentGain and Volume values to list for clustering.
#df_test=df[df['PercentGain']<20]
#df_test=df_test[df_test['MarketCap']<5000000000]
x=df["MarketCap"].values
y=df["PercentGain"].values
z=df['Volume'].values


# In[87]:


#Preprocessing and normalization/standardization of raw data
from sklearn import preprocessing
x = preprocessing.scale(x)
y = preprocessing.scale(y)
z = preprocessing.scale(z)


# In[88]:


#Stack values to apply ML models
X=np.column_stack((x,y,z))


# In[89]:


#Applying Clustering algorithm to create 5 clusters
from sklearn.cluster import KMeans
kmeans = KMeans( n_clusters=5,random_state=0).fit(X)


# In[90]:


#Creating new prediction column to save cluster number
df['predictions']=pd.Series(kmeans.predict(X))


# In[91]:


#Filter NuLL values
df=df.dropna()
#df['predictions'].unique()


# In[92]:


#Plotting clusters in 3D space
import plotly
import plotly.plotly as py
import pandas as pd
#plotly.tools.set_config_file(plotly_domain='https://plotly.your-company.com',
#                             plotly_streaming_domain='https://stream-plotly.your-company.com')
#plotly.tools.set_credentials_file(username='aniketmore234', api_key='zmozxDLbRNY5d3AEf3uq')
#py.sign_in('fjulio12', 'VIBrvQ9Qy4KbasZEwVqQ')
#df.head()

'''scatter1 = dict(
    mode = "markers",
    name = "cluster 0",
    type = "scatter3d",    
     x=preprocessing.scale(df[df['predictions']==0].MarketCap.values),y=preprocessing.scale(df[df['predictions']==0].PercentGain.values),z=preprocessing.scale(df[df['predictions']==0].Volume.values),
    marker = dict( size=2, color="green" )
)
clusters1 = dict(
    alphahull = 7,
    name = "cluster 0",
    opacity = 0.1,
    type = "mesh3d",    
    x=preprocessing.scale(df[df['predictions']==0].MarketCap.values),y=preprocessing.scale(df[df['predictions']==0].PercentGain.values),z=preprocessing.scale(df[df['predictions']==0].Volume.values),color='green', showscale = True
)
scatter2 = dict(
    mode = "markers",
    name = "cluster 1",
    type = "scatter3d",    
    x=preprocessing.scale(df[df['predictions']==1].MarketCap.values),y=preprocessing.scale(df[df['predictions']==1].PercentGain.values),z=preprocessing.scale(df[df['predictions']==1].Volume.values),
    marker = dict( size=2, color="blue" )
)
clusters2 = dict(
    alphahull = 7,
    name = "cluster 1",
    opacity = 0.1,
    type = "mesh3d",    
    x=preprocessing.scale(df[df['predictions']==1].MarketCap.values),y=preprocessing.scale(df[df['predictions']==1].PercentGain.values),z=preprocessing.scale(df[df['predictions']==1].Volume.values),color='blue', showscale = True
)

scatter3 = dict(
    mode = "markers",
    name = "cluster 2",
    type = "scatter3d",    
    x=preprocessing.scale(df[df['predictions']==2].MarketCap.values),y=preprocessing.scale(df[df['predictions']==2].PercentGain.values),z=preprocessing.scale(df[df['predictions']==2].Volume.values),
    marker = dict( size=2, color="red" )
)
clusters3 = dict(
    alphahull = 7,
    name = "cluster 2",
    opacity = 0.1,
    type = "mesh3d",    
    x=preprocessing.scale(df[df['predictions']==2].MarketCap.values),y=preprocessing.scale(df[df['predictions']==2].PercentGain.values),z=preprocessing.scale(df[df['predictions']==2].Volume.values),color='red', showscale = True
)
scatter4 = dict(
    mode = "markers",
    name = "cluster 3",
    type = "scatter3d",    
    x=preprocessing.scale(df[df['predictions']==3].MarketCap.values),y=preprocessing.scale(df[df['predictions']==3].PercentGain.values),z=preprocessing.scale(df[df['predictions']==3].Volume.values),
    marker = dict( size=2, color="yellow" )
)
clusters4 = dict(
    alphahull = 7,
    name = "cluster 3",
    opacity = 0.1,
    type = "mesh3d",    
    x=preprocessing.scale(df[df['predictions']==3].MarketCap.values),y=preprocessing.scale(df[df['predictions']==3].PercentGain.values),z=preprocessing.scale(df[df['predictions']==3].Volume.values),color='yellow', showscale = True
)
scatter5 = dict(
    mode = "markers",
    name = "cluster 4",
    type = "scatter3d",    
    x=preprocessing.scale(df[df['predictions']==4].MarketCap.values),y=preprocessing.scale(df[df['predictions']==4].PercentGain.values),z=preprocessing.scale(df[df['predictions']==4].Volume.values),
    marker = dict( size=2, color="black" )
)
clusters5 = dict(
    alphahull = 7,
    name = "cluster 4",
    opacity = 0.1,
    type = "mesh3d",    
    x=preprocessing.scale(df[df['predictions']==4].MarketCap.values),y=preprocessing.scale(df[df['predictions']==4].PercentGain.values),z=preprocessing.scale(df[df['predictions']==4].Volume.values),color='black', showscale = True
)
layout = dict(
    title = '3d point clustering',
    scene = dict(
        xaxis = dict( zeroline=False ),
        yaxis = dict( zeroline=False ),
        zaxis = dict( zeroline=False ),
    )
)
fig = dict( data=[scatter1, scatter2, scatter3,scatter4,scatter5, clusters1, clusters2, clusters3,clusters4,clusters5], layout=layout )
# Use py.iplot() for IPython notebook
#py.iplot(fig, filename='3d point clustering')
'''


# In[93]:


#Sorting Percent_change values to separate high and low valued companies
df_test=df.sort_values(by=['PercentGain'])


# In[94]:


#Creating heatmap for a selected cluster(here ==cluster3 and can be changed)
import numpy as np
z=np.array((df_test[df_test['predictions']==3.0].PercentGain).tolist())  
z_text=np.array((df_test[df_test['predictions']==3.0].CompanyName).tolist())


# In[95]:


z=z.reshape(1,len(z))
z_text=z_text.reshape(1,len(z_text))


# In[96]:
from colour import Color
red = Color("red")
colors = list(red.range_to(Color("green"),349))

#Plotly commands for creating heatmap
import plotly.plotly as py
import plotly.graph_objs as go
trace = go.Heatmap(z=z,text=z_text)
data=[trace]
layout=go.Layout(title="Stock Percent_Change Heatmap", xaxis={'title':'Company'}, yaxis={'title':'Percent_Change'})
fig = go.Figure(data=data, layout=layout)
#py.plot(fig, filename='basic-heatmap')
#import plotly as py
#py.offline.plot( fig, filename='d3-cloropleth-map')

import plotly.plotly as py
import plotly.graph_objs as go

import squarify

x = 0.
y = 0.
width = 100.
height = 100.

#print z
values = z[0]

#print values
#print values

#rects=values
values=-np.sort(-values)
#values.reverse()

#print type(values)

values = values.tolist()

print len(values)

#print type(values)
value1=[]
for i in values:
	if i > 0:
		value1.append(i)
values = value1
#values= values[i!=0.0 for i in range(len(values))]
#values = values*100
#print values

print len(values)

print values

normed = squarify.normalize_sizes(values, width, height)
rects = squarify.squarify(normed, x, y, width, height)

from colour import Color
red = Color("red")
colors = list(red.range_to(Color("green"),334))

color_brewer =[]

for color in colors:
        color_brewer.append(str(color))

#color_brewer=[]

# Choose colors from http://colorbrewer2.org/ under "Export"
'''for val in values:
    if (val>5):
        color_brewer.append('rgb(166,206,227)')
    else:
        color_brewer.append('rgb(227,26,28)')'''
#['rgb(166,206,227)','rgb(31,120,180)','rgb(178,223,138)',
#                'rgb(51,160,44)','rgb(251,154,153)','rgb(227,26,28)']
shapes = []
annotations = []
counter = 0

for r in rects:
    shapes.append( 
        dict(
            type = 'rect', 
            x0 = r['x'], 
            y0 = r['y'], 
            x1 = r['x']+r['dx'], 
            y1 = r['y']+r['dy'],
            line = dict( width = 2 ),
            fillcolor = color_brewer[counter]
        ) 
    )
    annotations.append(
        dict(
            x = r['x']+(r['dx']/2),
            y = r['y']+(r['dy']/2),
            text = values[counter],
            showarrow = False
        )
    )
    counter = counter + 1
    if counter >= len(color_brewer):
        counter = 0

# For hover text
trace0 = go.Scatter(
    x = [ r['x']+(r['dx']/2) for r in rects ],
    y = [ r['y']+(r['dy']/2) for r in rects ],
    text = [ str(v) for v in values ],
    mode = 'text',
)

layout = dict(
    height=700,
    width=700,
    xaxis=dict(showgrid=False,zeroline=False),
    yaxis=dict(showgrid=False,zeroline=False),
    shapes=shapes,
    annotations=annotations,
    hovermode='closest'
)

# With hovertext
figure = dict(data=[trace0], layout=layout)

# Without hovertext
# figure = dict(data=[Scatter()], layout=layout)

#py.iplot(figure, filename='squarify-treemap')
import plotly as py
py.offline.plot( figure, filename='d3-cloropleth-map')

