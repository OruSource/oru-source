USE ORU_SOURCE_CFG;

ALTER TABLE role_permission_map
ADD CONSTRAINT xfk_role_perm_map_x_dim_plat_user_role
FOREIGN KEY (user_role_name)
REFERENCES dim_platform_user_roles (user_role_name);
