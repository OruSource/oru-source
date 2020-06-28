USE ORU_SOURCE_SVC;

ALTER TABLE purchase_order_quote_map
ADD CONSTRAINT xfk_purc_ord_quote_map_x_dim_iso_curr
FOREIGN KEY (purchase_currency)
REFERENCES ORU_SOURCE_CFG.dim_iso_currency (iso_currency_code);
