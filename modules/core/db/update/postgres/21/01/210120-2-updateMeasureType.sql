alter table BRC_MEASURE_TYPE add column CODE integer ^
update BRC_MEASURE_TYPE set CODE = 0 where CODE is null ;
alter table BRC_MEASURE_TYPE alter column CODE set not null ;
alter table BRC_MEASURE_TYPE add column DESCRIPTION varchar(255) ^
update BRC_MEASURE_TYPE set DESCRIPTION = '' where DESCRIPTION is null ;
alter table BRC_MEASURE_TYPE alter column DESCRIPTION set not null ;
alter table BRC_MEASURE_TYPE add column NAME varchar(255) ^
update BRC_MEASURE_TYPE set NAME = '' where NAME is null ;
alter table BRC_MEASURE_TYPE alter column NAME set not null ;
