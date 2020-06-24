USE ORU_SOURCE_SVC;

CREATE TABLE platform_user_header (
    platform_user_id     	INT				NOT NULL  AUTO_INCREMENT  PRIMARY KEY  COMMENT  'Auto-generated, sequence value',
    salutation     			VARCHAR(10)		NOT NULL,
    first_name     			VARCHAR(64)		NOT NULL,
    last_name     			VARCHAR(64),
    mobile_number     		VARCHAR(16)		NOT NULL,
    landline_std_code     	VARCHAR(8),
    landline_number     	VARCHAR(16),
    email_address     		VARCHAR(128)	NOT NULL,
    job_title     			VARCHAR(32)		NOT NULL,
    company_name     		VARCHAR(128)	NOT NULL,
    user_category     		VARCHAR(32)		NOT NULL,
    create_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE platform_user_header COMMENT = 'This table holds platform user details, user who is onboarded into OruSource platform called as platform user.';
