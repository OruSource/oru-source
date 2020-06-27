USE ORU_SOURCE_SVC;

ALTER TABLE rfq_pr_map
ADD CONSTRAINT xfk_rfq_pr_map_x_dim_status
FOREIGN KEY (rfq_item_status)
REFERENCES ORU_SOURCE_CFG.dim_status (status_code);
