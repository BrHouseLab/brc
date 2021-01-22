-- alter table BRC_MEASURE add column CALI_UP_TYPE_ID uuid ^
-- update BRC_MEASURE set CALI_UP_TYPE_ID = <default_value> ;
-- alter table BRC_MEASURE alter column CALI_UP_TYPE_ID set not null ;
alter table BRC_MEASURE add column CALI_UP_TYPE_ID uuid not null ;
-- alter table BRC_MEASURE add column POSITION_ID uuid ^
-- update BRC_MEASURE set POSITION_ID = <default_value> ;
-- alter table BRC_MEASURE alter column POSITION_ID set not null ;
alter table BRC_MEASURE add column POSITION_ID uuid not null ;
