USE ORU_SOURCE_SVC;

ALTER TABLE request_for_quote_header
ADD CONSTRAINT xfk_req_for_quote_head_x_dim_status
FOREIGN KEY (rfq_status)
REFERENCES ORU_SOURCE_CFG.dim_status (status_code);
