USE ORU_SOURCE_SVC;

CREATE TABLE rfq_attachment (
    rfq_attachment_id		BIGINT			NOT NULL AUTO_INCREMENT	PRIMARY KEY COMMENT 'Auto-generated, sequence value.',
    rfq_id					BIGINT			NOT NULL                            COMMENT 'each RFQ might have one/multiple attachements',
    attachment_type   		VARCHAR(64)		NOT NULL,
    attachment_url   		VARCHAR(1024)	NOT NULL							COMMENT 'files will be stored in the s3 bucket, and the reference url will be saved in this column for each attachment',
    attachment_notes   		VARCHAR(512)	NOT NULL,
    create_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE rfq_attachment COMMENT = 'This table holds the rfq attachments.';

CREATE INDEX xindx_rfq_attachment
ON rfq_attachment (rfq_id);
