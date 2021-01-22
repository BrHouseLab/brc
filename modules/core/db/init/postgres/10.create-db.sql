-- begin BRC_ORDER
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
)^
-- end BRC_ORDER
-- begin BRC_REQUEST_ITEM
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
)^
-- end BRC_REQUEST_ITEM
-- begin BRC_REQUEST_TYPE
create table BRC_REQUEST_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SHORT_NAME varchar(255) not null,
    PERIOD_ integer,
    --
    primary key (ID)
)^
-- end BRC_REQUEST_TYPE
-- begin BRC_REQUEST
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
)^
-- end BRC_REQUEST
-- begin BRC_ITEM
create table BRC_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(500) not null,
    CODE integer,
    SPECIFIC_ integer,
    CATEGORY_ID uuid not null,
    COST double precision not null,
    UNIT_ID uuid not null,
    TECH_SPECIFICATION varchar(1000),
    --
    primary key (ID)
)^
-- end BRC_ITEM
-- begin BRC_CATEGORY
create table BRC_CATEGORY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    ARTICLE varchar(255),
    --
    primary key (ID)
)^
-- end BRC_CATEGORY
-- begin BRC_TASK
create table BRC_TASK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION varchar(500) not null,
    EXECUTOR_ID uuid,
    DATE_TO timestamp,
    RESULTS varchar(1000),
    DONE_DATE timestamp,
    FROM_ID uuid not null,
    --
    primary key (ID)
)^
-- end BRC_TASK
-- begin BRC_MEASURING_DEVICE
create table BRC_MEASURING_DEVICE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BARCODE bigint not null,
    NAME_ID uuid not null,
    SERIES varchar(255) not null,
    FACTORY_NUMBER varchar(255) not null,
    MEASURE_TYPE_ID uuid not null,
    LOW_LEVEL double precision,
    HIGHT_LEVEL double precision,
    UNIT_ID uuid,
    CALI_UP_INTERVAL_ID uuid not null,
    CALI_UP_ID uuid,
    ACCURANCY varchar(255) not null,
    PASSPORT_ID uuid,
    ACCOUNTING_ID uuid,
    ATTACHMENT_ID uuid not null,
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end BRC_MEASURING_DEVICE
-- begin BRC_MEASURE_TYPE
create table BRC_MEASURE_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE integer not null,
    DESCRIPTION varchar(255) not null,
    --
    primary key (ID)
)^
-- end BRC_MEASURE_TYPE
-- begin BRC_UNIT
create table BRC_UNIT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BRC_UNIT
-- begin BRC_CALI_UP_INTERVAL
create table BRC_CALI_UP_INTERVAL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PERIOD_ integer not null,
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end BRC_CALI_UP_INTERVAL
-- begin BRC_CALI_UP
create table BRC_CALI_UP (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CALI_UP_TYPE_ID uuid not null,
    DATE_ date not null,
    NUMBER_ varchar(255),
    DOCUMENT_ID uuid,
    --
    primary key (ID)
)^
-- end BRC_CALI_UP
-- begin BRC_PASSPORT
create table BRC_PASSPORT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ integer not null,
    --
    primary key (ID)
)^
-- end BRC_PASSPORT
-- begin BRC_SERVICE
create table BRC_SERVICE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRM_ID uuid not null,
    NAME varchar(255) not null,
    COST double precision not null,
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end BRC_SERVICE
-- begin BRC_ACCOUNTING
create table BRC_ACCOUNTING (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(50) not null,
    NUMBER_ varchar(255) not null,
    DATE_ date not null,
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end BRC_ACCOUNTING
-- begin BRC_ATTACHMENT
create table BRC_ATTACHMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ATTACHMENT_NODE_ID uuid,
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BRC_ATTACHMENT

-- begin BRC_MEASURE
create table BRC_MEASURE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    POSITION_ID uuid not null,
    NAME varchar(255) not null,
    CALI_UP_TYPE_ID uuid not null,
    MEASURE_TYPE_ID uuid not null,
    RED_VALUE double precision,
    RED_VALUE_UNIT_ID uuid,
    SCHEME varchar(255),
    ATTACHMENT_ID uuid not null,
    ACCURACY varchar(255),
    NOTE varchar(255),
    KKS varchar(255),
    --
    primary key (ID)
)^
-- end BRC_MEASURE
-- begin BRC_CONTRACT
create table BRC_CONTRACT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRM_ID uuid not null,
    NUMBER_ varchar(255) not null,
    CONTRACT_DATE date not null,
    COST double precision not null,
    WITH_VAT boolean not null,
    VALUE_OF_VAT_ID uuid,
    EXPIRED_DATE date not null,
    DESCRIPTION varchar(500) not null,
    WORKS_TYPE_ID uuid not null,
    PAY_TYPE_ID uuid not null,
    PAY_ATTACHMENT_ID uuid not null,
    NOTE varchar(500),
    STATUS_ID uuid not null,
    --
    primary key (ID)
)^
-- end BRC_CONTRACT
-- begin BRC_CONTRACT_ORDER
create table BRC_CONTRACT_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ date not null,
    CONTRACT_ID uuid not null,
    NUMBER_ varchar(255) not null,
    COST double precision not null,
    STATUS varchar(255) not null,
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end BRC_CONTRACT_ORDER
-- begin BRC_VAT
create table BRC_VAT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VALUE_ double precision not null,
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end BRC_VAT
-- begin BRC_WORKS_TYPE
create table BRC_WORKS_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BRC_WORKS_TYPE
-- begin BRC_PAY_TYPE
create table BRC_PAY_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BRC_PAY_TYPE
-- begin BRC_PAY_ATTACHMENT
create table BRC_PAY_ATTACHMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BRC_PAY_ATTACHMENT
-- begin BRC_CONTRACT_STATUS
create table BRC_CONTRACT_STATUS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BRC_CONTRACT_STATUS
-- begin BRC_ITEM_UNIT
create table BRC_ITEM_UNIT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BRC_ITEM_UNIT
-- begin BRC_MEASURE_DEVICE_PACKAGE
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
)^
-- end BRC_MEASURE_DEVICE_PACKAGE

-- begin BRC_POSITION
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
)^
-- end BRC_POSITION
-- begin BRC_MEASURE_DEVICE_PACKAGE_MEASURING_DEVICE_LINK
create table BRC_MEASURE_DEVICE_PACKAGE_MEASURING_DEVICE_LINK (
    MEASURE_DEVICE_PACKAGE_ID uuid,
    MEASURING_DEVICE_ID uuid,
    primary key (MEASURE_DEVICE_PACKAGE_ID, MEASURING_DEVICE_ID)
)^
-- end BRC_MEASURE_DEVICE_PACKAGE_MEASURING_DEVICE_LINK
-- begin BRC_CONTRACT_ORDER_MEASURE_DEVICE_PACKAGE_LINK
create table BRC_CONTRACT_ORDER_MEASURE_DEVICE_PACKAGE_LINK (
    CONTRACT_ORDER_ID uuid,
    MEASURE_DEVICE_PACKAGE_ID uuid,
    primary key (CONTRACT_ORDER_ID, MEASURE_DEVICE_PACKAGE_ID)
)^
-- end BRC_CONTRACT_ORDER_MEASURE_DEVICE_PACKAGE_LINK
-- begin BRC_CALI_UP_TYPE
create table BRC_CALI_UP_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SHORT_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BRC_CALI_UP_TYPE
-- begin BRC_MEASURE_DEVICE_NAME
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
)^
-- end BRC_MEASURE_DEVICE_NAME
-- begin BRC_FIRM
create table BRC_FIRM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SHORT_NAME varchar(255) not null,
    POSITION_ID uuid,
    --
    primary key (ID)
)^
-- end BRC_FIRM

-- begin BRC_PASSPORT_MEASURING_DEVICE_LINK
create table BRC_PASSPORT_MEASURING_DEVICE_LINK (
    PASSPORT_ID uuid,
    MEASURING_DEVICE_ID uuid,
    primary key (PASSPORT_ID, MEASURING_DEVICE_ID)
)^
-- end BRC_PASSPORT_MEASURING_DEVICE_LINK
-- begin BRC_SERVICE_MEASURE_DEVICE_NAME_LINK
create table BRC_SERVICE_MEASURE_DEVICE_NAME_LINK (
    SERVICE_ID uuid,
    MEASURE_DEVICE_NAME_ID uuid,
    primary key (SERVICE_ID, MEASURE_DEVICE_NAME_ID)
)^
-- end BRC_SERVICE_MEASURE_DEVICE_NAME_LINK
-- begin BRC_STATUS_ITEM
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
)^
-- end BRC_STATUS_ITEM
