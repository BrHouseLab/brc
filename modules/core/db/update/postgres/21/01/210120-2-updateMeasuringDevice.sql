alter table BRC_MEASURING_DEVICE rename column name to name__u29859 ;
alter table BRC_MEASURING_DEVICE alter column name__u29859 drop not null ;
-- alter table BRC_MEASURING_DEVICE add column NAME_ID uuid ^
-- update BRC_MEASURING_DEVICE set NAME_ID = <default_value> ;
-- alter table BRC_MEASURING_DEVICE alter column NAME_ID set not null ;
alter table BRC_MEASURING_DEVICE add column NAME_ID uuid not null ;
