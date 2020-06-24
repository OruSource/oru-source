USE ORU_SOURCE_SVC;

ALTER TABLE platform_user_credentials
ADD CONSTRAINT xfk_plat_user_cred_updated_x_plat_user_head
FOREIGN KEY (updated_by)
REFERENCES platform_user_header (platform_user_id);
