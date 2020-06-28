USE ORU_SOURCE_SVC;

CREATE TABLE purchase_order_terms (
	purchase_order_quote_map_id	BIGINT			NOT	NULL,
	term_code					VARCHAR(64)		NOT	NULL,
	term_value					VARCHAR(512)	NOT	NULL,
    negotiated_flag				VARCHAR(1)		NOT NULL,
    create_timestamp    		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp    		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE purchase_order_terms COMMENT = 'This table holds the terms agreed against the supplier_terms_response and the final terms will be stored here.';

ALTER TABLE purchase_order_terms
ADD CONSTRAINT xunique_purchase_order_terms
UNIQUE KEY (purchase_order_quote_map_id, term_code);

ALTER TABLE purchase_order_terms
ADD CHECK (negotiated_flag IN ('Y', 'N'));
