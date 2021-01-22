alter table BRC_CONTRACT add constraint FK_BRC_CONTRACT_ON_PAY_TYPE foreign key (PAY_TYPE_ID) references BRC_PAY_TYPE(ID);
create index IDX_BRC_CONTRACT_ON_PAY_TYPE on BRC_CONTRACT (PAY_TYPE_ID);
