USE ORU_SOURCE_SVC;

ALTER TABLE platform_user_attachment
ADD CONSTRAINT xfk_plat_user_attach_x_dim_plat_user_header
FOREIGN KEY (platform_user_id)
REFERENCES platform_user_header (platform_user_id);
