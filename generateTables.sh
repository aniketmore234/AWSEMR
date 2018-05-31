#!/usr/bin/env bash

mysql < master.sql

./loadDataToMaster.sh

mysql < dim.sql

mysql < fact.sql

mysql -e "grant all privileges on *.* to 'root'@'$1' IDENTIFIED BY 'password' WITH GRANT OPTION"

mysql -e  "grant all privileges on *.* to 'root'@'$2' IDENTIFIED BY 'password' WITH GRANT OPTION"

mysql -e  "grant all privileges on *.* to 'root'@'$3' IDENTIFIED BY 'password' WITH GRANT OPTION"

hive -e "CREATE DATABASE stockdata"

sqoop import --connect jdbc:mysql://"$1":3306/sms --username root --password password --split-by data_id --table master --target-dir hdfs:///user/hive/warehouse/stockdata --fields-terminated-by "," --hive-import --create-hive-table --hive-table stockdata.master

sqoop import --connect jdbc:mysql://"$1":3306/sms --username root --password password --split-by name_id --table nameDim --target-dir hdfs:///user/hive/warehouse/stockdata --fields-terminated-by "," --hive-import --create-hive-table --hive-table stockdata.nameDim

sqoop import --connect jdbc:mysql://"$1":3306/sms --username root --password password --split-by date_id --table dateDim --target-dir hdfs:///user/hive/warehouse/stockdata --fields-terminated-by "," --hive-import --create-hive-table --hive-table stockdata.dateDim

sqoop import --connect jdbc:mysql://"$1":3306/sms --username root --password password --split-by equity_id --table equityDim --target-dir hdfs:///user/hive/warehouse/stockdata --fields-terminated-by "," --hive-import --create-hive-table --hive-table stockdata.equityDim

sqoop import --connect jdbc:mysql://"$1":3306/sms --username root --password password --split-by fact_id --table fact --target-dir hdfs:///user/hive/warehouse/stockdata --fields-terminated-by "," --hive-import --create-hive-table --hive-table stockdata.fact
