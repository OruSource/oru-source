USE ORU_SOURCE_CFG;

CREATE TABLE dim_item (
    item_code_prefix			    VARCHAR(8)		NOT NULL COMMENT 'item_sub_category_code_prefix + Four digit numeric value for identification(can be automatically populated)',
    item_code				   		VARCHAR(64)		NOT NULL,
    item_description			    VARCHAR(128),
    make						    VARCHAR(64)		NOT NULL,
    item_sub_category_code_prefix   VARCHAR(4)		NOT NULL,
    unit_of_measurement			   	VARCHAR(32)		NOT NULL,
	item_base_price					DECIMAL(32, 2)	NOT NULL,
	item_base_currency				VARCHAR(3)		NOT NULL,
	hsn_code						VARCHAR(12)		NOT NULL,
	gst_percentage					DECIMAL(2, 2)	NOT NULL,
	create_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_item COMMENT = 'This table holds item level details - Third & fine grain level in the item master.';

ALTER TABLE dim_item
ADD CONSTRAINT xpk_dim_item 
PRIMARY KEY (item_code_prefix);
