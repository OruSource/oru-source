USE ORU_SOURCE_SVC;

ALTER TABLE supplier_quote_header
ADD CONSTRAINT xfk_supp_quote_head_x_dim_status
FOREIGN KEY (quote_status)
REFERENCES ORU_SOURCE_CFG.dim_status (status_code);
