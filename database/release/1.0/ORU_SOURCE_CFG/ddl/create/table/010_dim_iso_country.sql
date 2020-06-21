USE ORU_SOURCE_CFG;

CREATE TABLE dim_iso_country (
    iso_country_code  		VARCHAR(2)		NOT NULL,
    country_name			VARCHAR(64)		NOT NULL,
    iso_numeric_code   		VARCHAR(3)		NOT NULL,
    iso_alpha3_code   		VARCHAR(3),
    create_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_iso_country COMMENT = 'This table holds two digit iso country code for all countries.';

ALTER TABLE dim_iso_country
ADD CONSTRAINT xpk_dim_iso_country
PRIMARY KEY (iso_country_code);
