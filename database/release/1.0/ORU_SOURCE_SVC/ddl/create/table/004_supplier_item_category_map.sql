USE ORU_SOURCE_SVC;

CREATE TABLE supplier_item_category_map (
	supplier_item_category_map_id   INT				NOT NULL AUTO_INCREMENT	PRIMARY KEY COMMENT  'Auto-generated, sequence value.',
    supplier_code   				VARCHAR(6)		NOT NULL,
    item_code_prefix   				VARCHAR(8)		NOT NULL COMMENT 'using item code complete details will be taken from dim_item_sub_category table',
    item_code   					VARCHAR(64)		NOT NULL COMMENT 'this for reference, by seeing the column itself, you can identify the item code',
    create_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE supplier_item_category_map COMMENT = 'This table holds supplier supply items codes.';

ALTER TABLE supplier_item_category_map
ADD CONSTRAINT xindx_supplier_item_category_map
UNIQUE KEY (supplier_code, item_code_prefix);

CREATE INDEX xindx_supp_item_cat_map_supp_code
ON supplier_item_category_map (supplier_code);
