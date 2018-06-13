source = LOAD '/home/hadoop/AWSEMR/raw-data/' USING PigStorage(',') AS (Company_ID:int, Symbol:chararray, Equity_Series:chararray, Date_of_record:chararray, Prev_Close:float, Open_Price:float, High_Price:float, Low_Price:float, Last_Price:float, Close_Price:float, Average_Price:float, Total_Traded_Quantity:long, Turnover:float, No_of_Trades:long, Deliverable_Qty:float, Dly_Qt_to_Traded_Qty:float);

source_filter = FILTER source  by (ToString($4) matches '^[0-9.]+$') AND (ToString($5) matches '^[0-9.]+$') AND (ToString($6) matches '^[0-9.]+$') AND ($7 matches '^[0-9.]+$') AND ($8 matches '^[0-9.]+$') AND ($9 matches '^[0-9.]+$') AND ($10 matches '^[0-9.]+$') AND ($12 matches '^[0-9.]+$') AND ($15 matches '^[0-9.]+$');

source_filter2 = FILTER source_filter by ($14 matches '^[0-9]+$') AND ($13 matches '^[0-9]+$') AND ($11 matches '^[0-9]+$');

master = RANK source_filter2;

STORE master into 'clean-data' USING PigStorage(',', '-schema');
dump master;
