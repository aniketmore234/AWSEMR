# coding: utf-8
from scrapy.item import Item, Field

class StockItem(Item):
	#title = Field()
	#value = Field()
	CompanyName = Field()
	Price = Field()
	PrevClose = Field()
	Open = Field()
	DayRange = Field()
	YearRange = Field()
	Volume = Field()
	MarketCap = Field()
	Beta = Field()
	PERatioTTM = Field()
	EPSTTM = Field()
	ForwardDivYield = Field()
	OneYearTragetEstimate = Field()
	Error = Field()
	PercentGain = Field()
