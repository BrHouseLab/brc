create table BRC_MEASURE_DEVICE_NAME (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MEASURE_DEVICE_NODE_ID uuid,
    NAME varchar(255) not null,
    --
    primary key (ID)
);