USE ORU_SOURCE_CFG;

CREATE TABLE dim_iso_currency (
    iso_currency_code  		VARCHAR(3)		NOT NULL,
    iso_currency_desc		VARCHAR(128)	NOT NULL,
    create_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_iso_currency COMMENT = 'This table holds pre-defined all supported ISO Currency Codes.';

ALTER TABLE dim_iso_currency
ADD CONSTRAINT xpk_dim_iso_currency
PRIMARY KEY (iso_currency_code);
