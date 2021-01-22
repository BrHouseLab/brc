alter table BRC_SERVICE add column CODE varchar(255) ;
-- alter table BRC_SERVICE add column FIRM_ID uuid ^
-- update BRC_SERVICE set FIRM_ID = <default_value> ;
-- alter table BRC_SERVICE alter column FIRM_ID set not null ;
alter table BRC_SERVICE add column FIRM_ID uuid not null ;
alter table BRC_SERVICE add column COST double precision ^
update BRC_SERVICE set COST = 0 where COST is null ;
alter table BRC_SERVICE alter column COST set not null ;
alter table BRC_SERVICE add column NAME varchar(255) ^
update BRC_SERVICE set NAME = '' where NAME is null ;
alter table BRC_SERVICE alter column NAME set not null ;
