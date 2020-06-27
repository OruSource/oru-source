USE ORU_SOURCE_SVC;

ALTER TABLE rfq_supplier_mapping
ADD CONSTRAINT xfk_rfq_supp_map_x_supp_detls
FOREIGN KEY (supplier_code)
REFERENCES supplier_details (supplier_code);
