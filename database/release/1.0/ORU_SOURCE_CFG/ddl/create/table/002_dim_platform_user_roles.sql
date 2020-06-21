USE ORU_SOURCE_CFG;

CREATE TABLE dim_platform_user_roles (
    user_role_name     			VARCHAR(32)		NOT NULL,
    user_role_description   	VARCHAR(128),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_platform_user_roles COMMENT = 'This table holds the data for different type of roles to perform actions on the platform.';

ALTER TABLE dim_platform_user_roles
ADD CONSTRAINT xpk_dim_platform_user_roles 
PRIMARY KEY (user_role_name);
