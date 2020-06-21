USE ORU_SOURCE_CFG;

CREATE TABLE dim_unit_of_measurement (
    uom_name     			VARCHAR(32)		NOT NULL,
    uom_description   		VARCHAR(128),
    create_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_unit_of_measurement COMMENT = 'This table holds different units such as each/box/dozen/kg/gram.';

ALTER TABLE dim_unit_of_measurement
ADD CONSTRAINT xpk_dim_unit_of_measurement 
PRIMARY KEY (uom_name);
