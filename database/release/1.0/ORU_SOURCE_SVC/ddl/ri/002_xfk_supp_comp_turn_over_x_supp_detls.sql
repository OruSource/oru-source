USE ORU_SOURCE_SVC;

ALTER TABLE supplier_company_turn_over
ADD CONSTRAINT xfk_supp_comp_turn_over_x_supp_detls
FOREIGN KEY (supplier_code)
REFERENCES supplier_details (supplier_code);
