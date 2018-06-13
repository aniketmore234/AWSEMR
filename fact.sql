CREATE TABLE IF NOT EXISTS sms.fact as SELECT
ROW_NUMBER() OVER() as fact_id,
n.name_id as name_id,
d.date_id as date_id,
e.eqt_ID as eqt_id,
s.Prev_Close as Prev_Close,
s.Open_Price as Open_Price,
s.High_Price as High_Price,
s.Low_Price as Low_Price,
s.Last_Price as Last_Price,
s.Close_Price as  Close_Price,
s.Average_Price as Average_Price,
s.Total_Traded_Quantity as Total_Traded_Quantity,
s.Turnover as Turnover,
s.No_of_Trades as No_of_Trades,
s.Deliverable_Qty as Deliverable_Qty,
s.Dly_Qt_to_Traded_Qty as Dly_Qt_to_Traded_Qty
FROM sms.master s
LEFT JOIN sms.dimEquity e ON s.Equity_Series = e.equity_series
LEFT JOIN sms.dimDate d ON s.Date_of_record = d.Date_of_record
LEFT JOIN sms.dimName n ON s.Company_ID = n.Company_ID
WHERE  s.Company_ID>0;

SELECT * FROM sms.fact;

