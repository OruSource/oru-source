USE ORU_SOURCE_CFG;

CREATE TABLE dim_approval_type (
    approval_type     			VARCHAR(64)		NOT NULL,
    approval_type_description   VARCHAR(128),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_approval_type COMMENT = 'This table holds different types of approval.';

ALTER TABLE dim_approval_type
ADD CONSTRAINT xpk_dim_approval_type 
PRIMARY KEY (approval_type);
