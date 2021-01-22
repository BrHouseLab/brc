create table BRC_REQUEST (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REQUEST_TYPE_ID uuid not null,
    NOTE varchar(500),
    IS_CLOSE boolean not null,
    YEAR_ date not null,
    --
    primary key (ID)
);