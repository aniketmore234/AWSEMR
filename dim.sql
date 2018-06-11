CREATE TABLE IF NOT EXISTS sms.dimName AS SELECT
ROW_NUMBER() OVER(ORDER BY Company_ID) as name_id,
Company_ID,
Symbol
FROM sms.master GROUP BY Company_ID, Symbol;

describe sms.dimName;

select * from sms.dimName;

CREATE TABLE IF NOT EXISTS sms.dimDate AS SELECT
ROW_NUMBER() OVER() as date_id,
Date_of_record
FROM sms.master GROUP BY Date_of_record;

describe sms.dimDate;

select * from sms.dimDate;

CREATE TABLE IF NOT EXISTS sms.dimEquity AS SELECT
ROW_NUMBER() OVER() as eqt_ID,
Equity_Series
FROM sms.master GROUP BY Equity_Series;

describe sms.dimEquity;

select * from sms.dimEquity;

