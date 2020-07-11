USE ORU_SOURCE_SVC;

CREATE TABLE customer_quote_header (
    customer_quote_header_id	BIGINT		NOT NULL	AUTO_INCREMENT PRIMARY KEY	COMMENT 'Auto-generated.sequence value',
	customer_quote_owner_id		INT			NOT NULL,
	customer_quote_create_date	DATE		NOT NULL,
	purchase_request_id			BIGINT		NOT NULL,
	purchase_currency			VARCHAR(3)	NOT NULL,
	approval_type				VARCHAR(64)	NOT NULL,
	assigned_to                 INT         NOT NULL                                COMMENT 'used to identify the Customer Quote assigned to which user',
    approval_flow               VARCHAR(64) NOT NULL,
    approved_by            		INT													COMMENT 'Person who approved/reviewed the Customer Quote',
    customer_quote_status		VARCHAR(32) NOT NULL,
	attachment_available		VARCHAR(1)	NOT NULL,
    create_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE customer_quote_header COMMENT = 'This table holds the quote data sent to the customer - quote details against PR.';

CREATE INDEX xindx_customer_quote_header
ON customer_quote_header (customer_quote_owner_id);

ALTER TABLE customer_quote_header
ADD CHECK (attachment_available IN ('Y', 'N'));
