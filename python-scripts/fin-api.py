from alpha_vantage.timeseries import TimeSeries
from pprint import pprint
import csv

ts = TimeSeries(key='DSLG7DI7YNTBELQV', output_format='pandas')
data, meta_data = ts.get_daily(symbol='ABP', outputsize='full')


#pprint(data.head(100))
print(data)

with open('ABP','w') as fout:
	data.to_csv(fout)
