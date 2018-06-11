CREATE TABLE IF NOT EXISTS sms.quarterAggr AS SELECT
ROW_NUMBER() OVER() as agg_quarter_id,
add_months(trunc(current_date(),'MM'),-12) as dateofquery,
AVG(Prev_Close) as Prev_Close,
AVG(Open_Price) as Open_Price,
AVG(High_Price) as High_Price,
AVG(Low_Price) as Low_Price,
AVG(Last_Price) as Last_Price,
AVG(Close_Price) as Close_Price,
AVG(Average_Price) as Average_Price,
AVG(Total_Traded_Quantity) as Total_Traded_Quantity,
AVG(Turnover) as Turnover,
AVG(No_of_Trades) as No_of_Trades,
AVG(Deliverable_Qty) as Deliverable_Qty,
AVG(Dly_Qt_to_Traded_Qty) as Dly_Qt_to_Traded_Qty
FROM sms.fact f
LEFT JOIN sms.dimDate d ON f.date_id = d.date_id
WHERE d.Date_of_record between add_months(trunc(current_date(),'MM'),-15) AND add_months(trunc(current_date(),'MM'),-12) GROUP BY f.name_id;

describe sms.quarterAggr;

select * from sms.quarterAggr;

