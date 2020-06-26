USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_items
ADD CONSTRAINT xfk_purc_req_items_x_purc_req_header
FOREIGN KEY (purchase_request_id)
REFERENCES purchase_request_header (purchase_request_id);
