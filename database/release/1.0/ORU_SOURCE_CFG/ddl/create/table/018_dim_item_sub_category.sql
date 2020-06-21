USE ORU_SOURCE_CFG;

CREATE TABLE dim_item_sub_category (
    item_sub_category_code_prefix   VARCHAR(4)		NOT NULL COMMENT 'item_category_code_prefix + Two digit numeric value for identification(can be automatically populated)',
    item_sub_category_code   		VARCHAR(64)		NOT NULL,
    item_sub_category_desc		    VARCHAR(128),
    item_category_code_prefix   	VARCHAR(2)		NOT NULL,
	create_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_item_sub_category COMMENT = 'This table holds item sub category details - Second level in the item master.';

ALTER TABLE dim_item_sub_category
ADD CONSTRAINT xpk_dim_item_sub_category 
PRIMARY KEY (item_sub_category_code_prefix);
