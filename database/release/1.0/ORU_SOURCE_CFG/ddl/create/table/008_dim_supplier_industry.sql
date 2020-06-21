USE ORU_SOURCE_CFG;

CREATE TABLE dim_supplier_industry (
    supplier_industry_name   		VARCHAR(32)		NOT NULL,
    supplier_industry_description	VARCHAR(128),
    supplier_sector_name   			VARCHAR(32)		NOT NULL,
    create_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_supplier_industry COMMENT = 'This table holds supplier user specific industry values.';

ALTER TABLE dim_supplier_industry
ADD CONSTRAINT xpk_dim_supplier_industry
PRIMARY KEY (supplier_industry_name, supplier_sector_name);
