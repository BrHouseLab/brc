alter table BRC_CALI_UP add constraint FK_BRC_CALI_UP_ON_DOCUMENT foreign key (DOCUMENT_ID) references SYS_FILE(ID);
create index IDX_BRC_CALI_UP_ON_DOCUMENT on BRC_CALI_UP (DOCUMENT_ID);
