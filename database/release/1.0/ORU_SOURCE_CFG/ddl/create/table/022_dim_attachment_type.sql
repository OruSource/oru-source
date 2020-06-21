USE ORU_SOURCE_CFG;

CREATE TABLE dim_attachment_type (
    attachment_type     		VARCHAR(64)		NOT NULL,
    attachment_name     		VARCHAR(64)		NOT NULL,
    attachment_description     	VARCHAR(128),
    allowed_file_type     		VARCHAR(8)		NOT NULL COMMENT 'comma separated values - photo - jpeg/document - doc/docx/pdf/txt/excel',
    allowed_file_size     		VARCHAR(8)		NOT NULL,
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_attachment_type COMMENT = 'This table holds the different types of attachement - allows only pdf/jpeg/doc/docx.';

ALTER TABLE dim_attachment_type
ADD CONSTRAINT xpk_dim_attachment_type 
PRIMARY KEY (attachment_type);
