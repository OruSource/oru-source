USE ORU_SOURCE_SVC;

ALTER TABLE rfq_approver_map
ADD CONSTRAINT xfk_rfq_app_map_x_plat_user_header
FOREIGN KEY (approver_id)
REFERENCES platform_user_header (platform_user_id);
