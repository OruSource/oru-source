USE ORU_SOURCE_SVC;

ALTER TABLE platform_user_address
ADD CONSTRAINT xfk_plat_usr_address_x_dim_iso_country
FOREIGN KEY (iso_country_code)
REFERENCES ORU_SOURCE_CFG.dim_iso_country (iso_country_code);
