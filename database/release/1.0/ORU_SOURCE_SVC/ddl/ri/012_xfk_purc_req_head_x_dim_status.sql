USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_header
ADD CONSTRAINT xfk_purc_req_head_x_dim_status
FOREIGN KEY (purchase_request_status)
REFERENCES ORU_SOURCE_CFG.dim_status (status_code);
