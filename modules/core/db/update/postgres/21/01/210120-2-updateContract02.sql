alter table BRC_CONTRACT add constraint FK_BRC_CONTRACT_ON_STATUS foreign key (STATUS_ID) references BRC_CONTRACT_STATUS(ID);
create index IDX_BRC_CONTRACT_ON_STATUS on BRC_CONTRACT (STATUS_ID);
