USE ORU_SOURCE_CFG;

CREATE TABLE dim_supplier_sub_industry (
    supplier_sub_industry_name  		VARCHAR(32)		NOT NULL,
    supplier_sub_industry_description	VARCHAR(128),
    supplier_industry_name   			VARCHAR(32)		NOT NULL,
    create_timestamp        			TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        			TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_supplier_sub_industry COMMENT = 'This table holds supplier user specific sub industry values.';

ALTER TABLE dim_supplier_sub_industry
ADD CONSTRAINT xpk_dim_supplier_sub_industry
PRIMARY KEY (supplier_sub_industry_name, supplier_industry_name);
