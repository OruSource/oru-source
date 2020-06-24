USE ORU_SOURCE_SVC;

ALTER TABLE user_department_role_map
ADD CONSTRAINT xfk_usr_dept_role_map_x_plat_user_header
FOREIGN KEY (platform_user_id)
REFERENCES platform_user_header (platform_user_id);
