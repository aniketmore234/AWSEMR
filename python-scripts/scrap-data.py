import requests
from bs4 import BeautifulSoup
import csv

companies = open("companies.txt").read().splitlines()
with open("output.csv", "wb") as csv_file:
	writer = csv.writer(csv_file, delimiter=',')
	for company in companies:

		#print("https://in.finance.yahoo.com/quote/"+company+"?p="+company)
		try:
			info=[]
			r = requests.get("https://in.finance.yahoo.com/quote/"+company+"?p="+company)
			soup = BeautifulSoup(r.content, "html.parser")
			info.append(company)
			for tr in soup.findAll("table", class_="W(100%)"):
                        	for td in tr.find_all("td", class_="C(black) W(51%)"):
					info.append(td.find_next_sibling("td").text.encode("utf-8"))
			if len(info) is 13:
				print info
				writer.writerow(info)
			else:
				pass
		except:
			print("Error")

