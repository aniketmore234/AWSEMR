pig -x local data-flow.pig

hive -f master.sql

hive -f dim.sql

hive -f fact.sql

hive -f quarter_aggr.sql
