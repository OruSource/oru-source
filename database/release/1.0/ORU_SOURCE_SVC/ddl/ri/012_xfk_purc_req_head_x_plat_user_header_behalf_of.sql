USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_header
ADD CONSTRAINT xfk_purc_req_head_x_plat_user_header_behalf_of
FOREIGN KEY (on_behalf_of)
REFERENCES platform_user_header (platform_user_id);
