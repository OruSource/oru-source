USE ORU_SOURCE_CFG;

ALTER TABLE dim_supplier_sub_industry
ADD CONSTRAINT xfk_dim_supp_sub_ind_x_dim_supp_ind
FOREIGN KEY (supplier_industry_name)
REFERENCES dim_supplier_industry (supplier_industry_name);
