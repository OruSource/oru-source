USE ORU_SOURCE_SVC;

ALTER TABLE item_previous_purchase_detail
ADD CONSTRAINT xfk_item_prev_purc_detail_x_dim_item
FOREIGN KEY (item_code_prefix)
REFERENCES ORU_SOURCE_CFG.dim_item (item_code_prefix);
