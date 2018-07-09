pig -x local dataflow.pig

hive -f master.sql

hive -f dim.sql

hive -f fact.sql

hive -f quarter_aggr.sql

hive --service hiveserver2
