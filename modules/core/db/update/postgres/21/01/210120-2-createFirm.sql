alter table BRC_FIRM add constraint FK_BRC_FIRM_ON_POSITION foreign key (POSITION_ID) references BRC_POSITION(ID);
create index IDX_BRC_FIRM_ON_POSITION on BRC_FIRM (POSITION_ID);
