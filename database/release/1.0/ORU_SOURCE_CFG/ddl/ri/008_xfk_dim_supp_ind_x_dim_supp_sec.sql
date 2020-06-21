USE ORU_SOURCE_CFG;

ALTER TABLE dim_supplier_industry
ADD CONSTRAINT xfk_dim_supp_ind_x_dim_supp_sec
FOREIGN KEY (supplier_sector_name)
REFERENCES dim_supplier_sector (supplier_sector_name);
