USE ORU_SOURCE_CFG;

ALTER TABLE role_permission_map
ADD CONSTRAINT xfk_role_perm_map_x_dim_plat_user_perm
FOREIGN KEY (permission_code)
REFERENCES dim_platform_user_permissions (permission_code);
