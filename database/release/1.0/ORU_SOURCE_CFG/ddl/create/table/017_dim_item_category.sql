USE ORU_SOURCE_CFG;

CREATE TABLE dim_item_category (
    item_category_code_prefix   VARCHAR(2)		NOT NULL COMMENT 'Two digit numeric value for identification(can be automatically populated)',
    item_category_code   		VARCHAR(64)		NOT NULL,
    item_category_desc		    VARCHAR(128),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_item_category COMMENT = 'This table holds item category details - First level in the item master.';

ALTER TABLE dim_item_category
ADD CONSTRAINT xpk_dim_item_category 
PRIMARY KEY (item_category_code_prefix);
