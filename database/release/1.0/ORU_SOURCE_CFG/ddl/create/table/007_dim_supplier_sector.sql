USE ORU_SOURCE_CFG;

CREATE TABLE dim_supplier_sector (
    supplier_sector_name   		VARCHAR(32)		NOT NULL,
    supplier_sector_description	VARCHAR(128),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_supplier_sector COMMENT = 'This table holds supplier user possible sector values.';

ALTER TABLE dim_supplier_sector
ADD CONSTRAINT xpk_dim_supplier_sector
PRIMARY KEY (supplier_sector_name);
