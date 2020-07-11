USE ORU_SOURCE_SVC;

ALTER TABLE customer_quote_header
ADD CONSTRAINT xfk_cust_quote_head_x_dim_status
FOREIGN KEY (customer_quote_status)
REFERENCES ORU_SOURCE_CFG.dim_status (status_code);
