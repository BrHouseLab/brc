alter table BRC_TASK add constraint FK_BRC_TASK_ON_FROM foreign key (FROM_ID) references SEC_USER(ID);
create index IDX_BRC_TASK_ON_FROM on BRC_TASK (FROM_ID);
