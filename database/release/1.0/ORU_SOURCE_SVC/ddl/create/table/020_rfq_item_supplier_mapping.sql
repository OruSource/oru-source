USE ORU_SOURCE_SVC;

CREATE TABLE rfq_item_supplier_mapping (
	rfq_item_line_id		BIGINT			NOT NULL,
	supplier_code			VARCHAR(6)		NOT NULL,
	notification_sent		VARCHAR(1)		NOT NULL,
    create_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE rfq_item_supplier_mapping COMMENT = 'if supplier is assigned in rfq line item level, the mapping details will be stored in this table. Some flag needs to be handled in front end to determine whether the supplier assignment is against RFQ or RFQ Line item..';

ALTER TABLE rfq_item_supplier_mapping
ADD CONSTRAINT xunique_rfq_item_supplier_mapping
UNIQUE KEY (rfq_item_line_id, supplier_code);

ALTER TABLE rfq_item_supplier_mapping
ADD CHECK (notification_sent IN ('Y', 'N'));
