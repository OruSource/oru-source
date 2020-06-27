USE ORU_SOURCE_SVC;

CREATE TABLE request_for_quote_header (
    rfq_id     				BIGINT			NOT NULL	AUTO_INCREMENT PRIMARY KEY 	COMMENT 'Auto-generated sequence value',
	rfq_owner_id			INT				NOT NULL,
	rfq_create_date			DATE			NOT NULL,
	bid_start_date			DATE			NOT NULL,
	bid_due_date			DATE			NOT NULL,
	bid_opening_date		DATE			NOT NULL,
	bid_part_type			VARCHAR(64)		NOT NULL,
	rfq_notes				VARCHAR(512)	NOT NULL,
	earnest_money_deposit	DECIMAL(32, 2)											COMMENT 'This column is only used for government tenders/requirements (refundable amount)',
	tender_fee				DECIMAL(32, 2)											COMMENT 'To participate the tender itself some amount will be required and non-refundable',
	approval_type			VARCHAR(64)		NOT NULL,
	rfq_status				VARCHAR(32)		NOT NULL,
	attachment_available	VARCHAR(1)		NOT NULL,
    create_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE request_for_quote_header COMMENT = 'This table holds rfq header details such as bid start date, bid end date, tender fee, etc.';

CREATE INDEX xindx_request_for_quote_header
ON request_for_quote_header (rfq_owner_id);

ALTER TABLE request_for_quote_header
ADD CHECK (attachment_available IN ('Y', 'N'));
