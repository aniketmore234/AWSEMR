# coding: utf-8
from scrapy.spider import BaseSpider
from scrapy.selector import Selector
from crawler.items import StockItem
from lxml import html
import requests
from time import sleep
import json
import argparse
from collections import OrderedDict
from kafka import KafkaProducer

class StockSpider(BaseSpider):
	name = 'stock'
	allowed_domains = ['finance.yahoo.com']

	start_urls = open("urls.txt").read().splitlines()
	def parse(self, response):
		self.log('URL: %s' % response.url)
		ticker = response.url.split("=")[1]
		print ticker
		try:
			producer = KafkaProducer(bootstrap_servers='172.31.26.247:9092')
			hxs = Selector(response)
			item = StockItem()
			data = {}

 			data['CompanyName'] = hxs.xpath('//*[@id="quote-header-info"]/div[2]/div[1]/div[1]/h1/text()').extract()
			data['Price'] = hxs.xpath('//*[@id="quote-header-info"]/div[3]/div[1]/div/span[1]/text()').extract()
			data['PrevClose'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[1]/td[2]/span/text()').extract()
			data['Open'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[2]/td[2]/span/text()').extract()
			data['DayRange'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[5]/td[2]/text()').extract()
			data['YearRange'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[6]/td[2]/text()').extract()
			data['Volume'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[7]/td[2]/span/text()').extract()
			data['MarketCap'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[1]/td[2]/text()').extract()
			data['Beta'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[2]/td[2]/span/text()').extract()
			data['PERatioTTM'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[3]/td[2]/span/text()').extract()
			data['EPSTTM'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[4]/td[2]/span/text()').extract()
			data['ForwardDivYield'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[6]/td[2]/text()').extract()
			data['OneYearTragetEstimate'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[8]/td[2]/span/text()').extract()
 			data['PercentGain'] = hxs.xpath('//*[@id="quote-header-info"]/div[3]/div/div/span[2]/text()').extract()

			jd = json.dumps(data)
			producer.send('json', jd)
			print("##########################################################################################################################")
			return item
		except:
			print "Error"
