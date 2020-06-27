USE ORU_SOURCE_SVC;

CREATE TABLE rfq_term_map (
	rfq_id				BIGINT			NOT	NULL,
	term_code			VARCHAR(64)		NOT	NULL,
	rfq_term_value		VARCHAR(512)	NOT	NULL,
    create_timestamp    TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp    TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE rfq_term_map COMMENT = 'This table holds rfq level terms details.';

ALTER TABLE rfq_term_map
ADD CONSTRAINT xunique_rfq_term_map
UNIQUE KEY (rfq_id, term_code);
