CREATE TABLE IF NOT EXISTS sms.master AS SELECT
ROW_NUMBER() OVER() as data_id,
Company_ID,
Symbol,
Equity_Series,
Date_of_record,
Prev_Close,
Open_Price,
High_Price,
Low_Price,
Last_Price,
Close_Price,
Average_Price,
Total_Traded_Quantity,
Turnover,
No_of_Trades,
Deliverable_Qty,
Dly_Qt_to_Traded_Qty
FROM sms.mSource;

describe sms.master;

select * from sms.master;


