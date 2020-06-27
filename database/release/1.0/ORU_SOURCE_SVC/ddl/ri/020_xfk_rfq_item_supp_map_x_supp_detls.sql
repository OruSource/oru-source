USE ORU_SOURCE_SVC;

ALTER TABLE rfq_item_supplier_mapping
ADD CONSTRAINT xfk_rfq_item_supp_map_x_supp_detls
FOREIGN KEY (supplier_code)
REFERENCES supplier_details (supplier_code);
