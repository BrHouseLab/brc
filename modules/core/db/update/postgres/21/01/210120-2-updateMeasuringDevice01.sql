alter table BRC_MEASURING_DEVICE add constraint FK_BRC_MEASURING_DEVICE_ON_NAME foreign key (NAME_ID) references BRC_MEASURE_DEVICE_NAME(ID);
create index IDX_BRC_MEASURING_DEVICE_ON_NAME on BRC_MEASURING_DEVICE (NAME_ID);
