alter table BRC_CONTRACT rename column status to status__u66089 ;
alter table BRC_CONTRACT alter column status__u66089 drop not null ;
alter table BRC_CONTRACT rename column pay_attachment to pay_attachment__u69518 ;
alter table BRC_CONTRACT alter column pay_attachment__u69518 drop not null ;
alter table BRC_CONTRACT rename column pay_type to pay_type__u85358 ;
alter table BRC_CONTRACT alter column pay_type__u85358 drop not null ;
alter table BRC_CONTRACT rename column works_type to works_type__u33765 ;
alter table BRC_CONTRACT alter column works_type__u33765 drop not null ;
alter table BRC_CONTRACT rename column value_of_vat to value_of_vat__u35375 ;
alter table BRC_CONTRACT rename column name to name__u39971 ;
alter table BRC_CONTRACT alter column name__u39971 drop not null ;
-- alter table BRC_CONTRACT add column FIRM_ID uuid ^
-- update BRC_CONTRACT set FIRM_ID = <default_value> ;
-- alter table BRC_CONTRACT alter column FIRM_ID set not null ;
alter table BRC_CONTRACT add column FIRM_ID uuid not null ;
-- alter table BRC_CONTRACT add column STATUS_ID uuid ^
-- update BRC_CONTRACT set STATUS_ID = <default_value> ;
-- alter table BRC_CONTRACT alter column STATUS_ID set not null ;
alter table BRC_CONTRACT add column STATUS_ID uuid not null ;
-- alter table BRC_CONTRACT add column PAY_ATTACHMENT_ID uuid ^
-- update BRC_CONTRACT set PAY_ATTACHMENT_ID = <default_value> ;
-- alter table BRC_CONTRACT alter column PAY_ATTACHMENT_ID set not null ;
alter table BRC_CONTRACT add column PAY_ATTACHMENT_ID uuid not null ;
alter table BRC_CONTRACT add column VALUE_OF_VAT_ID uuid ;
-- alter table BRC_CONTRACT add column PAY_TYPE_ID uuid ^
-- update BRC_CONTRACT set PAY_TYPE_ID = <default_value> ;
-- alter table BRC_CONTRACT alter column PAY_TYPE_ID set not null ;
alter table BRC_CONTRACT add column PAY_TYPE_ID uuid not null ;
-- alter table BRC_CONTRACT add column WORKS_TYPE_ID uuid ^
-- update BRC_CONTRACT set WORKS_TYPE_ID = <default_value> ;
-- alter table BRC_CONTRACT alter column WORKS_TYPE_ID set not null ;
alter table BRC_CONTRACT add column WORKS_TYPE_ID uuid not null ;
