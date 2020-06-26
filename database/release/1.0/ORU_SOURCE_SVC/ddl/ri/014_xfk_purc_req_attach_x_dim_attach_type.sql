USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_attachment
ADD CONSTRAINT xfk_purc_req_attach_x_dim_attach_type
FOREIGN KEY (attachment_type)
REFERENCES ORU_SOURCE_CFG.dim_attachment_type (attachment_type);
