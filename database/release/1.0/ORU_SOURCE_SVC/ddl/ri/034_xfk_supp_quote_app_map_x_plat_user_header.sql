USE ORU_SOURCE_SVC;

ALTER TABLE supplier_quote_approver_map
ADD CONSTRAINT xfk_supp_quote_app_map_x_plat_user_header
FOREIGN KEY (approver_id)
REFERENCES platform_user_header (platform_user_id);
