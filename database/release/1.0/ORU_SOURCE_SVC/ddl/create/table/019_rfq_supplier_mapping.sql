USE ORU_SOURCE_SVC;

CREATE TABLE rfq_supplier_mapping (
	rfq_id					BIGINT			NOT NULL,
	supplier_code			VARCHAR(6)		NOT NULL,
	notification_sent		VARCHAR(1)		NOT NULL,
    create_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE rfq_supplier_mapping COMMENT = 'If supplier is assigned in rfq level, the mapping details will be stored in this table. Some flag needs to be handled in front end to determine whether the supplier assignment is against RFQ or RFQ Line item.';

ALTER TABLE rfq_supplier_mapping
ADD CONSTRAINT xunique_rfq_supplier_mapping
UNIQUE KEY (rfq_id, supplier_code);

ALTER TABLE rfq_supplier_mapping
ADD CHECK (notification_sent IN ('Y', 'N'));
