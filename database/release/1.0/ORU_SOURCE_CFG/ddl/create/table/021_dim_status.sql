USE ORU_SOURCE_CFG;

CREATE TABLE dim_status (
    status_code     			VARCHAR(32)		NOT NULL,
    status_description		    VARCHAR(64),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_status COMMENT = 'This table holds the different type of status that can happen during the process flow.';

ALTER TABLE dim_status
ADD CONSTRAINT xpk_dim_status 
PRIMARY KEY (status_code);
