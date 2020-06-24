USE ORU_SOURCE_SVC;

ALTER TABLE platform_user_credentials
ADD CONSTRAINT xfk_plat_user_cred_created_x_plat_user_head
FOREIGN KEY (created_by)
REFERENCES platform_user_header (platform_user_id);
