USE ORU_SOURCE_SVC;

CREATE TABLE customer_quote_attachment (
	customer_quote_attachment_id	BIGINT			NOT NULL	AUTO_INCREMENT PRIMARY KEY 	COMMENT 'Auto-generated, sequence value',
	customer_quote_header_id	    BIGINT			NOT NULL								COMMENT 'each quote might have one/multiple attachments',
    attachment_type   			    VARCHAR(64)		NOT NULL,
    attachment_url   			    VARCHAR(1024)	NOT NULL								COMMENT 'files will be stored in the s3 bucket, and the reference url will be saved in this column for each attachment',
    attachment_notes   			    VARCHAR(512)	NOT NULL,
    create_timestamp        	    TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	    TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE customer_quote_attachment COMMENT = 'This table holds the customer quote attachments.';

CREATE INDEX xindx_customer_quote_attachment
ON customer_quote_attachment (customer_quote_header_id);
