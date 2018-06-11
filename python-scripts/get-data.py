from alpha_vantage.timeseries import TimeSeries
from pprint import pprint
import csv
import time

companies = open("companies.txt").read().splitlines()

for company in companies:
	try:
		ts = TimeSeries(key='DSLG7DI7YNTBELQV', output_format='pandas')
		data, meta_data = ts.get_daily(symbol=company, outputsize='full')
		with open(company+".csv",'w') as fout:
			data.to_csv(fout)
		print company
	except:
		print("Error")
	time.sleep(0.1)


#print(data)
