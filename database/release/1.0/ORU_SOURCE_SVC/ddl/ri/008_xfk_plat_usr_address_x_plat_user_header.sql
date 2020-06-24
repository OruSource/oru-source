USE ORU_SOURCE_SVC;

ALTER TABLE platform_user_address
ADD CONSTRAINT xfk_plat_usr_address_x_plat_user_header
FOREIGN KEY (platform_user_id)
REFERENCES platform_user_header (platform_user_id);
