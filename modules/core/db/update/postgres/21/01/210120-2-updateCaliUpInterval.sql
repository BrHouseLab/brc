alter table BRC_CALI_UP_INTERVAL add column NOTE varchar(255) ;
alter table BRC_CALI_UP_INTERVAL add column NAME varchar(255) ^
update BRC_CALI_UP_INTERVAL set NAME = '' where NAME is null ;
alter table BRC_CALI_UP_INTERVAL alter column NAME set not null ;
alter table BRC_CALI_UP_INTERVAL add column PERIOD_ integer ^
update BRC_CALI_UP_INTERVAL set PERIOD_ = 0 where PERIOD_ is null ;
alter table BRC_CALI_UP_INTERVAL alter column PERIOD_ set not null ;
