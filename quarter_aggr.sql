CREATE TABLE IF NOT EXISTS sms.quarterAggr AS SELECT
f.name_id as name_id,
add_months(trunc(current_date(),'MM'),-12) as dateofquery,
AVG(f.Prev_Close) as Prev_Close,
AVG(f.Open_Price) as Open_Price,
AVG(f.High_Price) as High_Price,
AVG(f.Low_Price) as Low_Price,
AVG(f.Last_Price) as Last_Price,
AVG(f.Close_Price) as Close_Price,
AVG(f.Average_Price) as Average_Price,
AVG(f.Total_Traded_Quantity) as Total_Traded_Quantity,
AVG(f.Turnover) as Turnover,
AVG(f.No_of_Trades) as No_of_Trades,
AVG(f.Deliverable_Qty) as Deliverable_Qty,
AVG(f.Dly_Qt_to_Traded_Qty) as Dly_Qt_to_Traded_Qty
FROM sms.fact f
LEFT JOIN sms.dimDate d ON f.date_id = d.date_id
WHERE d.Date_of_record between add_months(trunc(current_date(),'MM'),-15) AND add_months(trunc(current_date(),'MM'),-12) GROUP BY name_id;

describe sms.quarterAggr;

select * from sms.quarterAggr;

