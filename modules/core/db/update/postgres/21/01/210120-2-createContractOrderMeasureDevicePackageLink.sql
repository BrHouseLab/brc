alter table BRC_CONTRACT_ORDER_MEASURE_DEVICE_PACKAGE_LINK add constraint FK_CONORDMEADEVPAC_ON_CONTRACT_ORDER foreign key (CONTRACT_ORDER_ID) references BRC_CONTRACT_ORDER(ID);
alter table BRC_CONTRACT_ORDER_MEASURE_DEVICE_PACKAGE_LINK add constraint FK_CONORDMEADEVPAC_ON_MEASURE_DEVICE_PACKAGE foreign key (MEASURE_DEVICE_PACKAGE_ID) references BRC_MEASURE_DEVICE_PACKAGE(ID);