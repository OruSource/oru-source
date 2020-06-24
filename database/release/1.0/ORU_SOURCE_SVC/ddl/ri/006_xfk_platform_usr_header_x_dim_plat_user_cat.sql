USE ORU_SOURCE_SVC;

ALTER TABLE platform_user_header
ADD CONSTRAINT xfk_platform_usr_header_x_dim_plat_user_cat
FOREIGN KEY (user_category)
REFERENCES ORU_SOURCE_CFG.dim_platform_user_category (user_category);
