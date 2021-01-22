create table BRC_MEASURE_DEVICE_PACKAGE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FROM_POSITION_ID uuid not null,
    TO_DESTINATION_ID uuid not null,
    CONTRACT_ID uuid,
    TO_STATUS varchar(50) not null,
    NOTE varchar(255),
    DONE_DATE timestamp,
    --
    primary key (ID)
);