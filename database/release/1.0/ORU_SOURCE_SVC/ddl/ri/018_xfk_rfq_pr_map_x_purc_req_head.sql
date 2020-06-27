USE ORU_SOURCE_SVC;

ALTER TABLE rfq_pr_map
ADD CONSTRAINT xfk_rfq_pr_map_x_purc_req_head
FOREIGN KEY (purchase_request_id)
REFERENCES purchase_request_header (purchase_request_id);
