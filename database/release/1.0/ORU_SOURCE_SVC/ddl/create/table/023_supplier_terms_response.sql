USE ORU_SOURCE_SVC;

CREATE TABLE supplier_terms_response (
	supplier_quote_header_id	BIGINT			NOT	NULL,
	term_code					VARCHAR(64)		NOT	NULL,
	term_value					VARCHAR(512)	NOT	NULL,
    create_timestamp    		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp    		TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE supplier_terms_response COMMENT = 'This table holds the supplier agreed terms response.';

ALTER TABLE supplier_terms_response
ADD CONSTRAINT xpk_supplier_terms_response
PRIMARY KEY (supplier_quote_header_id, term_code);
