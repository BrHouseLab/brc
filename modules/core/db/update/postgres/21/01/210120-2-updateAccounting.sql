alter table BRC_ACCOUNTING add column TYPE_ varchar(50) ^
update BRC_ACCOUNTING set TYPE_ = 'nomenclature' where TYPE_ is null ;
alter table BRC_ACCOUNTING alter column TYPE_ set not null ;
alter table BRC_ACCOUNTING add column DESCRIPTION varchar(255) ;
alter table BRC_ACCOUNTING add column DATE_ date ^
update BRC_ACCOUNTING set DATE_ = current_date where DATE_ is null ;
alter table BRC_ACCOUNTING alter column DATE_ set not null ;
alter table BRC_ACCOUNTING add column NUMBER_ varchar(255) ^
update BRC_ACCOUNTING set NUMBER_ = '' where NUMBER_ is null ;
alter table BRC_ACCOUNTING alter column NUMBER_ set not null ;
