USE ORU_SOURCE_SVC;

ALTER TABLE purchase_order_rfq_item_map
ADD CONSTRAINT xfk_purc_ordr_rfq_item_map_x_rfq_pr_map
FOREIGN KEY (rfq_item_line_id)
REFERENCES rfq_pr_map (rfq_item_line_id);
