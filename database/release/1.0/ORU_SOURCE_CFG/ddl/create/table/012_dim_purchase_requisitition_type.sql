USE ORU_SOURCE_CFG;

CREATE TABLE dim_purchase_requisitition_type (
    requisitition_type_code  	VARCHAR(64)		NOT NULL,
    requisitition_description	VARCHAR(256)	NOT NULL,
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_purchase_requisitition_type COMMENT = 'This table holds different request types - user can create purchase request, work contract, service request.';

ALTER TABLE dim_purchase_requisitition_type
ADD CONSTRAINT xpk_dim_purchase_requisitition_type
PRIMARY KEY (requisitition_type_code);
