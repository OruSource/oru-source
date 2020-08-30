USE ORU_SOURCE_SVC;

CREATE TABLE purchase_order_rfq_item_map (
	purchase_order_quote_map_id		BIGINT			NOT NULL,
	rfq_item_line_id				BIGINT			NOT NULL,
	item_unit_basic_price			DECIMAL(32, 2)	NOT NULL	COMMENT	'negotiated unit basic price',
	item_total_basic_price			DECIMAL(32, 2)	NOT NULL	COMMENT	'negotiated multiplied value of unit price & allocated quantity in rfq item line',
	item_gst_percentage				DECIMAL(3, 2)	NOT NULL,
	item_gst_value					DECIMAL(32, 2)	NOT NULL,
	item_total_price				DECIMAL(32, 2)	NOT NULL,
	negotiated_flag					VARCHAR(1)		NOT NULL,
    create_timestamp        		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE purchase_order_rfq_item_map COMMENT = 'single purchase order have many rfq line items, individual line item price details will be stored in this table.';

ALTER TABLE purchase_order_rfq_item_map
ADD CONSTRAINT xpk_purchase_order_rfq_item_map
PRIMARY KEY (purchase_order_quote_map_id, rfq_item_line_id);

ALTER TABLE purchase_order_rfq_item_map
ADD CHECK (negotiated_flag IN ('Y', 'N'));
