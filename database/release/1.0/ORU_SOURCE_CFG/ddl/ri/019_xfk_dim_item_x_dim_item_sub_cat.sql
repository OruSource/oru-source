USE ORU_SOURCE_CFG;

ALTER TABLE dim_item
ADD CONSTRAINT xfk_dim_item_x_dim_item_sub_cat
FOREIGN KEY (item_sub_category_code_prefix)
REFERENCES dim_item_sub_category (item_sub_category_code_prefix);
