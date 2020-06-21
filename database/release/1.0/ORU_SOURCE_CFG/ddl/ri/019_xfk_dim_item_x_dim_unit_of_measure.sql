USE ORU_SOURCE_CFG;

ALTER TABLE dim_item
ADD CONSTRAINT xfk_dim_item_x_dim_unit_of_measure
FOREIGN KEY (unit_of_measurement)
REFERENCES dim_unit_of_measurement (uom_name);
