USE ORU_SOURCE_SVC;

CREATE TABLE rfq_pr_map (
	rfq_item_line_id			BIGINT			NOT NULL	AUTO_INCREMENT	PRIMARY KEY	COMMENT 'Auto-generated, sequence value.',
	rfq_id						BIGINT			NOT NULL,
	purchase_request_id			BIGINT			NOT NULL,
	pr_item_line_id				BIGINT			NOT NULL,
	pr_item_code_prefix			VARCHAR(8)		NOT NULL								COMMENT 'should be drop down from the associated PR - 04010001 | Pencil',
	pr_item_code				VARCHAR(64)		NOT NULL,
	pr_item_allocated_quantity	INT				NOT NULL,
	rfq_item_status				VARCHAR(32)		NOT NULL,
    create_timestamp        	TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE rfq_pr_map COMMENT = 'This table holds rfq and pr level mapping - RFQ creation can be aggregation of multiple PR or single PR will be segregated to multiple RFQ.';

ALTER TABLE rfq_pr_map
ADD CONSTRAINT xunique_rfq_pr_map
UNIQUE KEY (rfq_id, purchase_request_id, pr_item_line_id);
