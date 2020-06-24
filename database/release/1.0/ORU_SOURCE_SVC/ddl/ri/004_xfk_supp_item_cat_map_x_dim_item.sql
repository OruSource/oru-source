USE ORU_SOURCE_SVC;

ALTER TABLE supplier_item_category_map
ADD CONSTRAINT xfk_supp_item_cat_map_x_dim_item
FOREIGN KEY (item_code_prefix)
REFERENCES ORU_SOURCE_CFG.dim_item (item_code_prefix);
