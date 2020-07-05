USE ORU_SOURCE_SVC;

CREATE TABLE supplier_quote_attachment (
	supplier_quote_attachment_id	BIGINT			NOT NULL	AUTO_INCREMENT PRIMARY KEY 	COMMENT 'Auto-generated, sequence value',
	supplier_quote_header_id	    BIGINT			NOT NULL								COMMENT 'each quote might have one/multiple attachments',
    attachment_type   			    VARCHAR(64)		NOT NULL,
    attachment_url   			    VARCHAR(1024)	NOT NULL								COMMENT 'files will be stored in the s3 bucket, and the reference url will be saved in this column for each attachment',
    attachment_notes   			    VARCHAR(512)	NOT NULL,
    create_timestamp        	    TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	    TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE supplier_quote_attachment COMMENT = 'This table holds the quote attachments.';

CREATE INDEX xindx_supplier_quote_attachment
ON supplier_quote_attachment (supplier_quote_header_id);
