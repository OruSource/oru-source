USE ORU_SOURCE_SVC;

ALTER TABLE user_department_role_map
ADD CONSTRAINT xfk_usr_dept_role_map_x_dim_plat_user_role
FOREIGN KEY (user_role_name)
REFERENCES ORU_SOURCE_CFG.dim_platform_user_roles (user_role_name);
