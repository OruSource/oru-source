USE ORU_SOURCE_SVC;

CREATE TABLE customer_quote_pr_price_map (
	customer_quote_header_id		BIGINT			NOT NULL,
	pr_items_total_basic_price		DECIMAL(32, 2) 	NOT NULL	COMMENT 'sum of pr item_total_basic_price',
	pr_items_total_price			DECIMAL(32, 2) 	NOT NULL	COMMENT 'sum of pr item_total_price',
	freight_percentage				DECIMAL(3, 2) 	NOT NULL	COMMENT '3% of pr_items_total_basic_price(100)',
	freight_value					DECIMAL(32, 2) 	NOT NULL,
	freight_gst_percentage			DECIMAL(3, 2) 	NOT NULL	COMMENT '10% - this should have only value not the % symbol',
	freight_gst_value				DECIMAL(32, 2) 	NOT NULL,
	freight_total_value				DECIMAL(32, 2) 	NOT NULL,
	total_price						DECIMAL(32, 2) 	NOT NULL	COMMENT 'total price = pr_items_total_price + freight_total_value',
    create_timestamp        		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE customer_quote_pr_price_map COMMENT = 'Customer quote will be created against the PR and this table holds the complete data of PR level pricing.';
