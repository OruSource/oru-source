USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_items
ADD CONSTRAINT xfk_purc_req_items_x_dim_item
FOREIGN KEY (item_code_prefix)
REFERENCES ORU_SOURCE_CFG.dim_item (item_code_prefix);
