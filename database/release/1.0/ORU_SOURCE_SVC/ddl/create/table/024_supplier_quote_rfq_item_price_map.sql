USE ORU_SOURCE_SVC;

CREATE TABLE supplier_quote_rfq_item_price_map (
	supplier_quote_header_id	BIGINT			NOT NULL,
	rfq_item_line_id			BIGINT			NOT	NULL,
	item_unit_basic_price		DECIMAL(32, 2)	NOT	NULL,
	item_total_basic_price		DECIMAL(32, 2)	NOT	NULL,
	item_gst_percentage			DECIMAL(3, 2)	NOT	NULL,
	item_gst_value				DECIMAL(32, 2)	NOT	NULL,
	item_total_price    		DECIMAL(32, 2)	NOT	NULL,
    create_timestamp        	TIMESTAMP       NOT NULL    DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP       NOT NULL    DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE supplier_quote_rfq_item_price_map COMMENT = 'This table holds one supplier quote have many rfq line items, individual line item price details will be stored here.';

ALTER TABLE supplier_quote_rfq_item_price_map
ADD CONSTRAINT xpk_supp_quote_rfq_item_price_map
PRIMARY KEY (supplier_quote_header_id, rfq_item_line_id);
