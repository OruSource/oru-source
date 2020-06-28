USE ORU_SOURCE_SVC;

ALTER TABLE purchase_order_quote_map
ADD CONSTRAINT xfk_purc_ord_quote_map_x_dim_appr_type
FOREIGN KEY (approval_type)
REFERENCES ORU_SOURCE_CFG.dim_approval_type (approval_type);
