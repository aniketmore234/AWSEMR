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
#from time import sleep


class StockSpider(BaseSpider):
	name = 'stock'
	allowed_domains = ['finance.yahoo.com']

	start_urls = open("urls.txt").read().splitlines()
	def parse(self, response):
		self.log('URL: %s' % response.url)
		ticker = response.url.split("=")[1]
		print ticker
		try:
			hxs = Selector(response)
			item = StockItem()
			print hxs
			item['CompanyName'] = hxs.xpath('//*[@id="quote-header-info"]/div[2]/div[1]/div[1]/h1/text()').extract()
			print hxs.xpath('//*[@id="quote-header-info"]/div[2]/div[1]/div[1]/h1/text()').extract()
			item['Price'] = hxs.xpath('//*[@id="quote-header-info"]/div[3]/div[1]/div/span[1]/text()').extract()
			item['PrevClose'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[1]/td[2]/span/text()').extract()
			item['Open'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[2]/td[2]/span/text()').extract()
			item['DayRange'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[5]/td[2]/text()').extract()
			item['YearRange'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[6]/td[2]/text()').extract()
			item['Volume'] = hxs.xpath('//*[@id="quote-summary"]/div[1]/table/tbody/tr[7]/td[2]/span/text()').extract()
			item['MarketCap'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[1]/td[2]/span/text()').extract()
			item['Beta'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[2]/td[2]/span/text()').extract()
			item['PERatioTTM'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[3]/td[2]/span/text()').extract()
			item['EPSTTM'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[4]/td[2]/span/text()').extract()
			item['ForwardDivYield'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[6]/td[2]/text()').extract()
			item['OneYearTragetEstimate'] = hxs.xpath('//*[@id="quote-summary"]/div[2]/table/tbody/tr[8]/td[2]/span/text()').extract()
			item['PercentGain'] = hxs.xpath('//*[@id="quote-header-info"]/div[3]/div/div[1]/span[2]/text()').extract()
			#item['Error']= "False"
			#with open("filter-urls.txt", 'a') as outfile:
			#	outfile.write(ticker+"\n")
			return item
		except:
			print "Error"
		#return item

