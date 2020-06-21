USE ORU_SOURCE_CFG;

CREATE TABLE dim_platform_user_category (
    user_category     			VARCHAR(32)		NOT NULL,
    user_category_description   VARCHAR(128),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_platform_user_category COMMENT = 'This table holds the data to identify the platform user is internal/external.';

ALTER TABLE dim_platform_user_category
ADD CONSTRAINT xpk_dim_platform_user_category 
PRIMARY KEY (user_category);
