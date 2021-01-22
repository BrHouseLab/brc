create table BRC_POSITION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    POSITION_NODE_ID uuid not null,
    NAME varchar(255) not null,
    SHORT_NAME varchar(255) not null,
    DESCRIPTION varchar(255),
    ATTACHMENT_ID uuid not null,
    --
    primary key (ID)
);