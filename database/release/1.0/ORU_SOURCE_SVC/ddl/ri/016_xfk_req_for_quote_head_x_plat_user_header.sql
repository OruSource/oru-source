USE ORU_SOURCE_SVC;

ALTER TABLE request_for_quote_header
ADD CONSTRAINT xfk_req_for_quote_head_x_plat_user_header
FOREIGN KEY (rfq_owner_id)
REFERENCES platform_user_header (platform_user_id);
