USE ORU_SOURCE_CFG;

CREATE TABLE dim_platform_department (
    department_code     		VARCHAR(16)		NOT NULL,
    department_description   	VARCHAR(64),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_platform_department COMMENT = 'This table holds possible user departments available in platform.';

ALTER TABLE dim_platform_department
ADD CONSTRAINT xpk_dim_platform_department 
PRIMARY KEY (department_code);
