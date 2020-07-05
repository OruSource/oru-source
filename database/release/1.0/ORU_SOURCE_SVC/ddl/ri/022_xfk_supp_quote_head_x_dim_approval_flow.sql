USE ORU_SOURCE_SVC;

ALTER TABLE supplier_quote_header
ADD CONSTRAINT xfk_supp_quote_head_x_dim_approval_flow
FOREIGN KEY (approval_flow)
REFERENCES ORU_SOURCE_CFG.dim_approval_flow (approval_flow_name);
