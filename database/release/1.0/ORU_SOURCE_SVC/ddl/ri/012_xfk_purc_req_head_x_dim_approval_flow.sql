USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_header
ADD CONSTRAINT xfk_purc_req_head_x_dim_approval_flow
FOREIGN KEY (approval_flow)
REFERENCES ORU_SOURCE_CFG.dim_approval_flow (approval_flow_name);
