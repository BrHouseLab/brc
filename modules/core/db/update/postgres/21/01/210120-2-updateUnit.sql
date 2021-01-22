alter table BRC_UNIT add column NAME varchar(255) ^
update BRC_UNIT set NAME = '' where NAME is null ;
alter table BRC_UNIT alter column NAME set not null ;
