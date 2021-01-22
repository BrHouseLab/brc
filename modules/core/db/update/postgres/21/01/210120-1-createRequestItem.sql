create table BRC_REQUEST_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REQUEST_ID uuid not null,
    ITEM_ID uuid not null,
    VALUE_ integer not null,
    NOTE varchar(500),
    CONSUMER varchar(255),
    DELIVERY_DATE date,
    --
    primary key (ID)
);