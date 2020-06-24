USE ORU_SOURCE_SVC;

CREATE TABLE platform_user_credentials (
    platform_user_id    	INT				NOT NULL	COMMENT 'Referenced from platform_user_header',
    username   				VARCHAR(32)		NOT NULL,
    password   				VARCHAR(256)	NOT NULL	COMMENT 'Password is stored as hashed/salted value',
    created_by   			INT				NOT NULL	COMMENT 'user who created credentials for the new user',
    updated_by   			INT							COMMENT 'user who updated the credentials, can be during password reset/internal reset request',
    create_timestamp    	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp    	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE platform_user_credentials COMMENT = 'This table holds platform holds user login credentials.';

ALTER TABLE platform_user_credentials
ADD CONSTRAINT xpk_platform_user_credentials 
PRIMARY KEY (platform_user_id);
