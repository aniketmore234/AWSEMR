source = LOAD '/home/hadoop/AWSEMR/raw-data/' USING PigStorage(',');

source_filter = FILTER source by ($4 matches '^[0-9.]+$') AND ($5 matches '^[0-9.]+$') AND ($6 matches '^[0-9.]+$') AND ($7 matches '^[0-9.]+$') AND ($8 matches '^[0-9.]+$') AND ($9 matches '^[0-9.]+$') AND ($10 matches '^[0-9.]+$') AND ($12 matches '^[0-9.]+$') AND ($15 matches '^[0-9.]+$');

source_filter2 = FILTER source_filter by ($14 matches '^[0-9]+$') AND ($13 matches '^[0-9]+$') AND ($11 matches '^[0-9]+$');

master = RANK source_filter2;

STORE master into 'clean-data' USING PigStorage(',');
dump master;
