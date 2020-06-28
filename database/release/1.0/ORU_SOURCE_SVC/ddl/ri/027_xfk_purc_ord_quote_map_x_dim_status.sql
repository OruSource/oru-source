USE ORU_SOURCE_SVC;

ALTER TABLE purchase_order_quote_map
ADD CONSTRAINT xfk_purc_ord_quote_map_x_dim_status
FOREIGN KEY (purchase_order_status)
REFERENCES ORU_SOURCE_CFG.dim_status (status_code);
