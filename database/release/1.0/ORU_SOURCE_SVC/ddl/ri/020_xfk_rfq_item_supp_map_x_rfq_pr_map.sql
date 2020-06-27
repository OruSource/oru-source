USE ORU_SOURCE_SVC;

ALTER TABLE rfq_item_supplier_mapping
ADD CONSTRAINT xfk_rfq_item_supp_map_x_rfq_pr_map
FOREIGN KEY (rfq_item_line_id)
REFERENCES rfq_pr_map (rfq_item_line_id);
