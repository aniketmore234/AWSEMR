use sms;
GO

DROP TABLE IF EXISTS nameDim;
GO

CREATE TABLE nameDim(
name_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
Company_ID int,
Symbol varchar(15));
GO

INSERT INTO sms.nameDim (Company_ID, Symbol)
	SELECT Company_ID, Symbol
	FROM sms.master
	GROUP BY Company_ID
        ORDER BY Company_ID;
GO


DROP TABLE IF EXISTS dateDim;
GO

CREATE TABLE dateDim(
date_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
Date_of_record date);
GO

INSERT INTO sms.dateDim (Date_of_record)
        SELECT Date_of_record
        FROM sms.master
	GROUP BY Date_of_record
	ORDER BY Date_of_record;
GO

DROP TABLE IF EXISTS equityDim;
GO

CREATE TABLE equityDim(
equity_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
equity_series varchar(15),
equity_flag BOOLEAN DEFAULT TRUE);
GO

INSERT INTO sms.equityDim (equity_series)
        SELECT Equity_Series
	FROM sms.master
	GROUP BY equity_series
	ORDER BY equity_series;
GO
