alter table BRC_CONTRACT add constraint FK_BRC_CONTRACT_ON_VALUE_OF_VAT foreign key (VALUE_OF_VAT_ID) references BRC_VAT(ID);
create index IDX_BRC_CONTRACT_ON_VALUE_OF_VAT on BRC_CONTRACT (VALUE_OF_VAT_ID);
