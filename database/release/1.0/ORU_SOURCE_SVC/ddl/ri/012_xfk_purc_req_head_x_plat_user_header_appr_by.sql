USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_header
ADD CONSTRAINT xfk_purc_req_head_x_plat_user_header_appr_by
FOREIGN KEY (approved_by)
REFERENCES platform_user_header (platform_user_id);
