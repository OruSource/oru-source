USE ORU_SOURCE_SVC;

ALTER TABLE rfq_pr_map
ADD CONSTRAINT xfk_rfq_pr_map_x_purc_req_items
FOREIGN KEY (pr_item_line_id)
REFERENCES purchase_request_items (pr_item_line_id);
