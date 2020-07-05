USE ORU_SOURCE_SVC;

ALTER TABLE purchase_order_quote_map
ADD CONSTRAINT xfk_purc_ord_quote_map_x_dim_approval_flow
FOREIGN KEY (approval_flow)
REFERENCES ORU_SOURCE_CFG.dim_approval_flow (approval_flow_name);
