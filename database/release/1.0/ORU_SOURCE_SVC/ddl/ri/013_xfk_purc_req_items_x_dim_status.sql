USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_items
ADD CONSTRAINT xfk_purc_req_items_x_dim_status
FOREIGN KEY (item_status)
REFERENCES ORU_SOURCE_CFG.dim_status (status_code);
