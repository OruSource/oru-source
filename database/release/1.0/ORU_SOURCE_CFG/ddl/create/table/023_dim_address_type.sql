USE ORU_SOURCE_CFG;

CREATE TABLE dim_address_type (
    address_type     		VARCHAR(64)		NOT NULL,
    address_description   	VARCHAR(128),
    default_flag   			VARCHAR(1)		NOT NULL DEFAULT 'N',
    create_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_address_type COMMENT = 'This table holds different address type that can be mapped against user addresses.';

ALTER TABLE dim_address_type
ADD CONSTRAINT xpk_dim_address_type 
PRIMARY KEY (address_type);

ALTER TABLE dim_address_type
ADD CHECK (default_flag IN ('Y', 'N'));
