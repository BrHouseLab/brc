create table BRC_CONTRACT_ORDER_MEASURE_DEVICE_PACKAGE_LINK (
    CONTRACT_ORDER_ID uuid,
    MEASURE_DEVICE_PACKAGE_ID uuid,
    primary key (CONTRACT_ORDER_ID, MEASURE_DEVICE_PACKAGE_ID)
);