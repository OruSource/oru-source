USE ORU_SOURCE_SVC;

ALTER TABLE customer_quote_attachment
ADD CONSTRAINT xfk_cust_quote_attach_x_dim_attach_type
FOREIGN KEY (attachment_type)
REFERENCES ORU_SOURCE_CFG.dim_attachment_type (attachment_type);
