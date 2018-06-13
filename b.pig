source = LOAD '/home/hadoop/AWSEMR/raw-data/' USING PigStorage(',');

source_filter = FOREACH source GENERATE id, (cahra)  

source_filter2 = FILTER source_filter by (($14 matches '^[0-9]+$') AND ($13 matches '^[0-9]+$') AND ($11 matches '^[0-9]+$'));

master = RANK source_filter2;

STORE master into 'clean-data' USING PigStorage(',', '-noschema');
dump master;
