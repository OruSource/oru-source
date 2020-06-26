USE ORU_SOURCE_SVC;

CREATE TABLE purchase_request_items (
    pr_item_line_id     	BIGINT			NOT NULL	AUTO_INCREMENT PRIMARY KEY 	COMMENT 'Auto-generated, sequence value.',
    purchase_request_id   	BIGINT			NOT NULL,
    item_category_code   	VARCHAR(64)		NOT NULL								COMMENT 'Example: 04 | Stationary',
	item_sub_category_code	VARCHAR(64)		NOT NULL								COMMENT 'Example: 0402 | Writing Material',
	item_code				VARCHAR(64)		NOT NULL								COMMENT 'Example: 04020002 | Pencil',
	item_code_prefix		VARCHAR(8)		NOT NULL								COMMENT '04020002 - store prefix alone for future reference, since item is not unique value for the table.',
	pr_item_quantity		INT				NOT NULL								COMMENT 'human entered value, should be numeric. Since the Unit of measurement is populated from dim_item table',
	allocated_quantity		INT				NOT NULL,
	balance_quantity		INT,
	item_prev_unit_price	DECIMAL(32, 2)	NOT NULL								COMMENT 'taken from item_previous_purchase_detail table. based on the purchase currency previous purchased item price should be retrieved from the item_previous_purchase_detail table. If value is not present get the value from dim_item table',
	item_total_price		DECIMAL(32, 2)	NOT NULL,
	item_prev_supplier		VARCHAR(6),
	item_prev_purchase_date	DATE,
	item_status				VARCHAR(32)		NOT NULL,
    create_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE purchase_request_items COMMENT = 'This table holds PR level individual item details. PR will have multiple items.';

CREATE INDEX xindx_purchase_request_items
ON purchase_request_items (purchase_request_id);
