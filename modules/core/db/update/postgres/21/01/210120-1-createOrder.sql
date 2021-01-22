create table BRC_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REQUEST_ITEM_ID uuid not null,
    VALUE_ integer not null,
    DATE_ date not null,
    NUMBER_ integer,
    NOTE varchar(255),
    --
    primary key (ID)
);