USE ORU_SOURCE_SVC;

CREATE TABLE customer_quote_pr_item_price_map (
	customer_quote_header_id	BIGINT			NOT NULL,
	pr_item_line_id				BIGINT			NOT	NULL,
	item_unit_basic_price		DECIMAL(32, 2)	NOT	NULL,
	item_total_basic_price		DECIMAL(32, 2)	NOT	NULL,
	item_gst_percentage			DECIMAL(3, 2)	NOT	NULL,
	item_gst_value				DECIMAL(32, 2)	NOT	NULL,
	item_total_price    		DECIMAL(32, 2)	NOT	NULL,
    create_timestamp        	TIMESTAMP       NOT NULL    DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP       NOT NULL    DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE customer_quote_pr_item_price_map COMMENT = 'One customer quote might have many PR line items, individual line item price details will be stored here.';

ALTER TABLE customer_quote_pr_item_price_map
ADD CONSTRAINT xpk_cust_quote_pr_item_price_map
PRIMARY KEY (customer_quote_header_id, pr_item_line_id);
