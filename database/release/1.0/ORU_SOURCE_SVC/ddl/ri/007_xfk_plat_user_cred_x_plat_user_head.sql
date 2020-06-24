USE ORU_SOURCE_SVC;

ALTER TABLE platform_user_credentials
ADD CONSTRAINT xfk_plat_user_cred_x_plat_user_head
FOREIGN KEY (platform_user_id)
REFERENCES platform_user_header (platform_user_id);
