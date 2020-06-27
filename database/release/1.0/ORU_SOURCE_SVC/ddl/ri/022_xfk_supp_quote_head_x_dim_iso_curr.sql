USE ORU_SOURCE_SVC;

ALTER TABLE supplier_quote_header
ADD CONSTRAINT xfk_supp_quote_head_x_dim_iso_curr
FOREIGN KEY (purchase_currency)
REFERENCES ORU_SOURCE_CFG.dim_iso_currency (iso_currency_code);
