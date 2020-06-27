USE ORU_SOURCE_SVC;

CREATE TABLE quote_rfq_price_map (
	supplier_quote_header_id		BIGINT			NOT NULL,
	rfq_items_total_basic_price		DECIMAL(32, 2) 	NOT NULL	COMMENT 'sum of rfq item_total_basic_price',
	rfq_items_total_price			DECIMAL(32, 2) 	NOT NULL	COMMENT 'sum of rfq item_total_price',
	freight_percentage				DECIMAL(3, 2) 	NOT NULL	COMMENT '3% of rfq_items_total_basic_price(100)',
	freight_value					DECIMAL(32, 2) 	NOT NULL,
	freight_gst_percentage			DECIMAL(3, 2) 	NOT NULL	COMMENT '10% - this should have only value not the % symbol',
	freight_gst_value				DECIMAL(32, 2) 	NOT NULL,
	freight_total_value				DECIMAL(32, 2) 	NOT NULL,
	total_price						DECIMAL(32, 2) 	NOT NULL	COMMENT 'total price = rfq_items_total_price + freight_total_value',
    create_timestamp        		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE quote_rfq_price_map COMMENT = 'Quote will be created against the RFQ and this table holds the complete data of RFQ level pricing.';
