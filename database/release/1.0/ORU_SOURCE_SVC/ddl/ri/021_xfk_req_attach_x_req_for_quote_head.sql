USE ORU_SOURCE_SVC;

ALTER TABLE rfq_attachment
ADD CONSTRAINT xfk_req_attach_x_req_for_quote_head
FOREIGN KEY (rfq_id)
REFERENCES request_for_quote_header (rfq_id);
