USE ORU_SOURCE_SVC;

ALTER TABLE purchase_order_rfq_item_map
ADD CONSTRAINT xfk_purc_ordr_rfq_item_map_x_purc_ordr_quote_map
FOREIGN KEY (purchase_order_quote_map_id)
REFERENCES purchase_order_quote_map (purchase_order_quote_map_id);
