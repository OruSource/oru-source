USE ORU_SOURCE_SVC;

ALTER TABLE rfq_approver_map
ADD CONSTRAINT xfk_rfq_app_map_x_req_for_quote_head
FOREIGN KEY (rfq_id)
REFERENCES request_for_quote_header (rfq_id);
