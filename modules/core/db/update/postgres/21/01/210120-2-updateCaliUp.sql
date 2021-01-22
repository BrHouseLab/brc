alter table BRC_CALI_UP add column DOCUMENT_ID uuid ;
-- alter table BRC_CALI_UP add column CALI_UP_TYPE_ID uuid ^
-- update BRC_CALI_UP set CALI_UP_TYPE_ID = <default_value> ;
-- alter table BRC_CALI_UP alter column CALI_UP_TYPE_ID set not null ;
alter table BRC_CALI_UP add column CALI_UP_TYPE_ID uuid not null ;
alter table BRC_CALI_UP add column DATE_ date ^
update BRC_CALI_UP set DATE_ = current_date where DATE_ is null ;
alter table BRC_CALI_UP alter column DATE_ set not null ;
alter table BRC_CALI_UP add column NUMBER_ varchar(255) ;
