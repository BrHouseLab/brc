alter table BRC_PASSPORT add column NUMBER_ integer ^
update BRC_PASSPORT set NUMBER_ = 0 where NUMBER_ is null ;
alter table BRC_PASSPORT alter column NUMBER_ set not null ;
