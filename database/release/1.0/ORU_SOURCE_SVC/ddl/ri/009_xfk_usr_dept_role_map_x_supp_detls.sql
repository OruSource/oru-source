USE ORU_SOURCE_SVC;

ALTER TABLE user_department_role_map
ADD CONSTRAINT xfk_usr_dept_role_map_x_supp_detls
FOREIGN KEY (supplier_code)
REFERENCES supplier_details (supplier_code);
