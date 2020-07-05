USE ORU_SOURCE_SVC;

CREATE TABLE supplier_quote_header (
    supplier_quote_header_id	BIGINT		NOT NULL	AUTO_INCREMENT PRIMARY KEY	COMMENT 'Auto-generated.sequence value',
	quote_owner_id				INT			NOT NULL,
	quote_create_date			DATE		NOT NULL,
	rfq_id						BIGINT		NOT NULL,
	purchase_currency			VARCHAR(3)	NOT NULL,
	approval_type				VARCHAR(64)	NOT NULL,
	assigned_to                 INT         NOT NULL                                COMMENT 'used to identify the Supplier Quote assigned to which approver user',
    approval_flow               VARCHAR(64) NOT NULL,
    approved_by            		INT													COMMENT 'Person who approved/reviewed the Supplier Quote',
    quote_status				VARCHAR(32) NOT NULL,
	proxy_quote					VARCHAR(1)	NOT NULL								COMMENT 'Y/N - there some cases where the purchaser will create quote instead of supplier, in that case proxy quote should be marked as Y',
	attachment_available		VARCHAR(1)	NOT NULL,
    create_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE supplier_quote_header COMMENT = 'This table holds the quote data provided by the supplier - quote details against rfq.';

CREATE INDEX xindx_supplier_quote_header
ON supplier_quote_header (quote_owner_id);

ALTER TABLE supplier_quote_header
ADD CHECK (proxy_quote IN ('Y', 'N'));

ALTER TABLE supplier_quote_header
ADD CHECK (attachment_available IN ('Y', 'N'));
