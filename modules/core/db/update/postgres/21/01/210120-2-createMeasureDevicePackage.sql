alter table BRC_MEASURE_DEVICE_PACKAGE add constraint FK_BRC_MEASURE_DEVICE_PACKAGE_ON_FROM_POSITION foreign key (FROM_POSITION_ID) references BRC_POSITION(ID);
alter table BRC_MEASURE_DEVICE_PACKAGE add constraint FK_BRC_MEASURE_DEVICE_PACKAGE_ON_TO_DESTINATION foreign key (TO_DESTINATION_ID) references BRC_POSITION(ID);
alter table BRC_MEASURE_DEVICE_PACKAGE add constraint FK_BRC_MEASURE_DEVICE_PACKAGE_ON_CONTRACT foreign key (CONTRACT_ID) references BRC_CONTRACT(ID);
create index IDX_BRC_MEASURE_DEVICE_PACKAGE_ON_FROM_POSITION on BRC_MEASURE_DEVICE_PACKAGE (FROM_POSITION_ID);
create index IDX_BRC_MEASURE_DEVICE_PACKAGE_ON_TO_DESTINATION on BRC_MEASURE_DEVICE_PACKAGE (TO_DESTINATION_ID);
create index IDX_BRC_MEASURE_DEVICE_PACKAGE_ON_CONTRACT on BRC_MEASURE_DEVICE_PACKAGE (CONTRACT_ID);