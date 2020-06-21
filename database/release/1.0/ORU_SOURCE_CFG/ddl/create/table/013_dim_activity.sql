USE ORU_SOURCE_CFG;

CREATE TABLE dim_activity (
    activity_code  			VARCHAR(64)			NOT NULL,
    activity_name			VARCHAR(128)		NOT NULL,
    activity_description	VARCHAR(256),
    create_timestamp        TIMESTAMP 			NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 			NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_activity COMMENT = 'This table holds the possible activities performed in OruSource platform.';

ALTER TABLE dim_activity
ADD CONSTRAINT xpk_dim_activity
PRIMARY KEY (activity_code);
