-- alter table BRC_TASK add column FROM_ID uuid ^
-- update BRC_TASK set FROM_ID = <default_value> ;
-- alter table BRC_TASK alter column FROM_ID set not null ;
alter table BRC_TASK add column FROM_ID uuid not null ;
