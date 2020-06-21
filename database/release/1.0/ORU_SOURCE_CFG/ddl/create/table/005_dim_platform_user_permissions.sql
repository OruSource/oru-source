USE ORU_SOURCE_CFG;

CREATE TABLE dim_platform_user_permissions (
    permission_code     		VARCHAR(16)		NOT NULL,
    permission_description   	VARCHAR(128),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_platform_user_permissions COMMENT = 'This table holds user possible allowed actions/permissions on each page.';

ALTER TABLE dim_platform_user_permissions
ADD CONSTRAINT xpk_dim_platform_user_permissions
PRIMARY KEY (permission_code);
