USE ORU_SOURCE_SVC;

CREATE TABLE platform_user_address (
    address_id			INT				NOT NULL  AUTO_INCREMENT  PRIMARY KEY  COMMENT  'Auto-generated, sequence value.',
    platform_user_id   	INT				NOT NULL  COMMENT 'single user might have multiple address, address_id is sequence generated - get all the address using platform_user_id',
    address_type   		VARCHAR(64)		NOT NULL,
    address_line_1   	VARCHAR(128)	NOT NULL,
    address_line_2   	VARCHAR(128),
    city   				VARCHAR(95)		NOT NULL,
    state   			VARCHAR(128)	NOT NULL,
    iso_country_code   	VARCHAR(2)		NOT NULL,
    postal_code   		VARCHAR(15)		NOT NULL,
    create_timestamp    TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp    TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE platform_user_address COMMENT = 'This table holds user address, this is user company address - user has ability to store multiple addresess.';

CREATE INDEX xindx_platform_user_address
ON platform_user_address (platform_user_id);
