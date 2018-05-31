USE sms;
GO

DROP TABLE sms.fact;
GO

CREATE TABLE sms.fact(
fact_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name_id int NOT NULL,
date_id int NOT NULL,
equity_id int NOT NULL,
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

INSERT INTO sms.fact(name_id,date_id,equity_id,Prev_Close,Open_Price,High_Price,Low_Price,Last_Price,Close_Price,Average_Price,Total_Traded_Quantity,Turnover,No_of_Trades,Deliverable_Qty,Dly_Qt_to_Traded_Qty)
SELECT d.date_id,n.name_id,e.equity_id,s.Prev_Close,s.Open_Price,s.High_Price,s.Low_Price,s.Last_Price,s.Close_Price,s.Average_Price,s.Total_Traded_Quantity,s.Turnover,s.No_of_Trades,s.Deliverable_Qty,s.Dly_Qt_to_Traded_Qty
FROM sms.master s
LEFT JOIN sms.equityDim e ON s.Equity_Series = e.equity_series
LEFT JOIN sms.dateDim d ON s.Date_of_record = d.Date_of_record
LEFT JOIN sms.nameDim n ON s.Company_ID = n.Company_ID
WHERE  s.Company_ID>0;
GO
