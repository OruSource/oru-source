USE ORU_SOURCE_SVC;

ALTER TABLE supplier_details
ADD CONSTRAINT xfk_supp_detls_x_dim_supp_sub_ind
FOREIGN KEY (supplier_industry)
REFERENCES ORU_SOURCE_CFG.dim_supplier_sub_industry (supplier_sub_industry_name);
