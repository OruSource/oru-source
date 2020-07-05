USE ORU_SOURCE_SVC;

ALTER TABLE supplier_quote_rfq_item_price_map
ADD CONSTRAINT xfk_supp_quote_rfq_item_price_map_x_rfq_pr_map
FOREIGN KEY (rfq_item_line_id)
REFERENCES rfq_pr_map (rfq_item_line_id);
