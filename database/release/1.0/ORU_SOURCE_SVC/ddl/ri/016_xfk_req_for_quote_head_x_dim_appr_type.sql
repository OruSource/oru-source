USE ORU_SOURCE_SVC;

ALTER TABLE request_for_quote_header
ADD CONSTRAINT xfk_req_for_quote_head_x_dim_appr_type
FOREIGN KEY (approval_type)
REFERENCES ORU_SOURCE_CFG.dim_approval_type (approval_type);
