USE ORU_SOURCE_SVC;

ALTER TABLE purchase_order_quote_map
ADD CONSTRAINT xfk_purc_ord_quote_map_x_req_for_quote_head
FOREIGN KEY (rfq_id)
REFERENCES request_for_quote_header (rfq_id);
