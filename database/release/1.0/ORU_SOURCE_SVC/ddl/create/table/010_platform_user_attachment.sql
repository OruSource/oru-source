USE ORU_SOURCE_SVC;

CREATE TABLE platform_user_attachment (
    platform_user_id    INT				NOT NULL,
    attachment_type   	VARCHAR(64)		NOT NULL,
    attachment_url   	VARCHAR(1024)	NOT NULL	COMMENT 'files will be stored in the s3 bucket, and the reference url will be saved in this column for each attachment. Allow only JPEG/PNG images for user photos',
    create_timestamp    TIMESTAMP 		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp    TIMESTAMP 		NOT NULL	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE platform_user_attachment COMMENT = 'This table holds user attachment details. And the images will be stored in the S3 bucket';

ALTER TABLE platform_user_attachment
ADD CONSTRAINT xpk_dim_platform_user_category
PRIMARY KEY (platform_user_id);
