CREATE DATABASE sms;
CREATE EXTERNAL TABLE sms.master(
Company_ID int,
Symbol string,
Equity_Series string,
Date_of_record date,
Prev_Close float,
Open_Price float,
High_Price float,
Low_Price float,
Last_Price float,
Close_Price float,
Average_Price float,
Total_Traded_Quantity bigint,
Turnover float,
No_of_Trades bigint,
Deliverable_Qty float,
Dly_Qt_to_Traded_Qty float)

ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\""
);

describe sms.master;

load data local inpath './raw-data' into table sms.master;

select * from sms.master;

