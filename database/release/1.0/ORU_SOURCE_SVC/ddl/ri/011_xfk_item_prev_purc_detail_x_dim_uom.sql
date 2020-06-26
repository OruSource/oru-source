USE ORU_SOURCE_SVC;

ALTER TABLE item_previous_purchase_detail
ADD CONSTRAINT xfk_item_prev_purc_detail_x_dim_uom
FOREIGN KEY (unit_of_measurement)
REFERENCES ORU_SOURCE_CFG.dim_unit_of_measurement (uom_name);
