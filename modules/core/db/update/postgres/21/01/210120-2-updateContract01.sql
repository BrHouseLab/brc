alter table BRC_CONTRACT add constraint FK_BRC_CONTRACT_ON_FIRM foreign key (FIRM_ID) references BRC_FIRM(ID);
create index IDX_BRC_CONTRACT_ON_FIRM on BRC_CONTRACT (FIRM_ID);
