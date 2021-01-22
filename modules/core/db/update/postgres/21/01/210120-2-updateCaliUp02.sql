alter table BRC_CALI_UP add constraint FK_BRC_CALI_UP_ON_CALI_UP_TYPE foreign key (CALI_UP_TYPE_ID) references BRC_CALI_UP_TYPE(ID);
create index IDX_BRC_CALI_UP_ON_CALI_UP_TYPE on BRC_CALI_UP (CALI_UP_TYPE_ID);
