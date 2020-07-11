USE ORU_SOURCE_SVC;

ALTER TABLE customer_quote_header
ADD CONSTRAINT xfk_cust_quote_head_x_req_for_quote_head
FOREIGN KEY (purchase_request_id)
REFERENCES purchase_request_header (purchase_request_id);
