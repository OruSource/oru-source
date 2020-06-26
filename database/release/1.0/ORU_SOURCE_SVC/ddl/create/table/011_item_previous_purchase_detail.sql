USE ORU_SOURCE_SVC;

CREATE TABLE item_previous_purchase_detail (
    item_code_prefix			VARCHAR(8)		NOT NULL,
    unit_of_measurement   		VARCHAR(32)		NOT NULL,
    previous_purchase_currency  VARCHAR(3)		NOT NULL,
    previous_purchase_price   	DECIMAL(32, 2)	NOT NULL	COMMENT  'every latest PO approved/After  - this field against item needs to be updated',
    previous_purchase_date   	DATE			NOT NULL	COMMENT  'every latest PO approved/After  - this field against item needs to be updated',
    previous_supplier_id   		VARCHAR(6)		NOT NULL,
    create_timestamp        	TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE item_previous_purchase_detail COMMENT = 'This table holds the item previous purchase details, this table has frequent update. Using the recent transaction for the specific item, this table values will get updated. This table should be updated only if the item code prefix and uom and currency matched, else new entry should be added. The same way in PR creation also this previous purchase data should be populated based on prefix/uom/currency.';

ALTER TABLE item_previous_purchase_detail
ADD CONSTRAINT xunique_dim_platform_user_category
UNIQUE KEY (item_code_prefix, unit_of_measurement, previous_purchase_currency);

CREATE INDEX xindx_item_previous_purchase_detail
ON item_previous_purchase_detail (item_code_prefix);
