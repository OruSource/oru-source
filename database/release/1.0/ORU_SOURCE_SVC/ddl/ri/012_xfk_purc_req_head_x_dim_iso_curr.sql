USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_header
ADD CONSTRAINT xfk_purc_req_head_x_dim_iso_curr
FOREIGN KEY (purchase_currency)
REFERENCES ORU_SOURCE_CFG.dim_iso_currency (iso_currency_code);
