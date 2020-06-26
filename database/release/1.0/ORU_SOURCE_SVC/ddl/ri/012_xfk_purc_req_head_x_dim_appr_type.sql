USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_header
ADD CONSTRAINT xfk_purc_req_head_x_dim_appr_type
FOREIGN KEY (approval_type)
REFERENCES ORU_SOURCE_CFG.dim_approval_type (approval_type);
