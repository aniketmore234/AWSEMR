#!/usr/bin/env bash

for f in raw-data/*
do
        mysql -e "USE sms;"
	mysql -e "GO"
	mysql -e "LOAD DATA LOCAL INFILE '"$f"'INTO TABLE sms.master FIELDS TERMINATED BY ',' ENCLOSED BY '\"' LINES TERMINATED BY '\n' (Company_ID,Symbol,Equity_Series,Date_of_record,Prev_Close,Open_Price,High_Price,Low_Price,Last_Price,Close_Price,Average_Price,Total_Traded_Quantity,Turnover,No_of_Trades,Deliverable_Qty,Dly_Qt_to_Traded_Qty);"
	mysql -e "GO"
done
