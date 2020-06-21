USE ORU_SOURCE_CFG;

CREATE TABLE dim_platform_user_job_title (
    job_title     				VARCHAR(32)		NOT NULL,
    job_title_description   	VARCHAR(128),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_platform_user_job_title COMMENT = 'This table holds the possible user job titles.';

ALTER TABLE dim_platform_user_job_title
ADD CONSTRAINT xpk_dim_platform_user_job_title 
PRIMARY KEY (job_title);
