alter table BRC_SERVICE add constraint FK_BRC_SERVICE_ON_FIRM foreign key (FIRM_ID) references BRC_FIRM(ID);
create index IDX_BRC_SERVICE_ON_FIRM on BRC_SERVICE (FIRM_ID);
