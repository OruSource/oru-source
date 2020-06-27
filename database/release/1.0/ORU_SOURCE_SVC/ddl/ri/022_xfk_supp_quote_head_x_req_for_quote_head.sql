USE ORU_SOURCE_SVC;

ALTER TABLE supplier_quote_header
ADD CONSTRAINT xfk_supp_quote_head_x_req_for_quote_head
FOREIGN KEY (rfq_id)
REFERENCES request_for_quote_header (rfq_id);
