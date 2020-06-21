USE ORU_SOURCE_CFG;

ALTER TABLE dim_item_sub_category
ADD CONSTRAINT xfk_dim_item_sub_cat_x_dim_item_cat
FOREIGN KEY (item_category_code_prefix)
REFERENCES dim_item_category (item_category_code_prefix);
