USE ORU_SOURCE_SVC;

CREATE TABLE supplier_attachment (
    supplier_attachment_id	INT				NOT NULL AUTO_INCREMENT	PRIMARY KEY COMMENT 'Auto-generated, sequence value.',
    supplier_code   		VARCHAR(6)		NOT NULL							COMMENT 'each supplier can have multiple attachments',
    attachment_type   		VARCHAR(64)		NOT NULL,
    attachment_url   		VARCHAR(1024)	NOT NULL							COMMENT 'files will be stored in the s3 bucket, and the reference url will be saved in this column for each attachment',
    attachment_notes   		VARCHAR(512)	NOT NULL,
    create_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE supplier_attachment COMMENT = 'This table holds the supplier attachments.';

CREATE INDEX xindx_supplier_attachment
ON supplier_attachment (supplier_code);
