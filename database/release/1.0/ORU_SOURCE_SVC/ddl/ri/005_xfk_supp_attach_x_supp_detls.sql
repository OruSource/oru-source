USE ORU_SOURCE_SVC;

ALTER TABLE supplier_attachment
ADD CONSTRAINT xfk_supp_attach_x_supp_detls
FOREIGN KEY (supplier_code)
REFERENCES supplier_details (supplier_code);
