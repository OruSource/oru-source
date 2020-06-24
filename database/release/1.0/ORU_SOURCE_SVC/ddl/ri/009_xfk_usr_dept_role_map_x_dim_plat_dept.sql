USE ORU_SOURCE_SVC;

ALTER TABLE user_department_role_map
ADD CONSTRAINT xfk_usr_dept_role_map_x_dim_plat_dept
FOREIGN KEY (department_code)
REFERENCES ORU_SOURCE_CFG.dim_platform_department (department_code);
