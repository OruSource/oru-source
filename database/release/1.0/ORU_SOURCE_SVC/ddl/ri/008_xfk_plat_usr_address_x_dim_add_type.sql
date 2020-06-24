USE ORU_SOURCE_SVC;

ALTER TABLE platform_user_address
ADD CONSTRAINT xfk_plat_usr_address_x_dim_add_type
FOREIGN KEY (address_type)
REFERENCES ORU_SOURCE_CFG.dim_address_type (address_type);
