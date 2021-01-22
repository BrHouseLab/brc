create table BRC_STATUS_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STATUS varchar(50) not null,
    USER_ID uuid not null,
    DOCUMENT_ID uuid not null,
    MEASURING_DEVICE_ID uuid not null,
    --
    primary key (ID)
);