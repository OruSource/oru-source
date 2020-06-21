USE ORU_SOURCE_CFG;

CREATE TABLE dim_general_terms (
    term_code     		VARCHAR(64)		NOT NULL,
    term_name   		VARCHAR(128)	NOT NULL,
    term_description    VARCHAR(256)	NOT NULL,
    create_timestamp    TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp    TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_general_terms COMMENT = 'This table holds techno commercial terms.';

ALTER TABLE dim_general_terms
ADD CONSTRAINT xpk_dim_general_terms 
PRIMARY KEY (term_code);
