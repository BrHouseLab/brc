alter table BRC_ATTACHMENT add column ATTACHMENT_NODE_ID uuid ;
alter table BRC_ATTACHMENT add column NAME varchar(255) ^
update BRC_ATTACHMENT set NAME = '' where NAME is null ;
alter table BRC_ATTACHMENT alter column NAME set not null ;
