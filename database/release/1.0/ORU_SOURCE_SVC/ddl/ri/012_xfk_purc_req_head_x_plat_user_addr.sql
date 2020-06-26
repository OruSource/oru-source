USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_header
ADD CONSTRAINT xfk_purc_req_head_x_plat_user_addr
FOREIGN KEY (delivery_address_id)
REFERENCES platform_user_address (address_id);
