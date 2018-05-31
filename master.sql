USE sms;
GO
DROP TABLE sms.master;
GO

CREATE TABLE sms.master(
data_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
Company_ID int,
Symbol varchar(15),
Equity_Series varchar(15),
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
Dly_Qt_to_Traded_Qty float);
GO
