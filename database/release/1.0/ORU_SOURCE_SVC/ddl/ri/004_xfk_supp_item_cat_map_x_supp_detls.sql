USE ORU_SOURCE_SVC;

ALTER TABLE supplier_item_category_map
ADD CONSTRAINT xfk_supp_item_cat_map_x_supp_detls
FOREIGN KEY (supplier_code)
REFERENCES supplier_details (supplier_code);
