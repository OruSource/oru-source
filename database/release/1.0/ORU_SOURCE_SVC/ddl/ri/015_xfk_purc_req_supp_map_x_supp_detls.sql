USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_supplier_map
ADD CONSTRAINT xfk_purc_req_supp_map_x_supp_detls
FOREIGN KEY (supplier_code)
REFERENCES supplier_details (supplier_code);
