USE ORU_SOURCE_CFG;

CREATE TABLE dim_approval_flow (
    approval_flow_name     		VARCHAR(64)		NOT NULL,
    approval_flow_description   VARCHAR(128),
    default_flag   			    VARCHAR(1)		NOT NULL,
    create_timestamp            TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp            TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_approval_flow COMMENT = 'This table holds different type of approval flows.';

ALTER TABLE dim_approval_flow
ADD CONSTRAINT xpk_dim_approval_flow
PRIMARY KEY (approval_flow_name);

ALTER TABLE dim_approval_flow
ADD CHECK (default_flag IN ('Y', 'N'));
