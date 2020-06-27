USE ORU_SOURCE_SVC;

ALTER TABLE rfq_pr_map
ADD CONSTRAINT xfk_rfq_pr_map_x_dim_item
FOREIGN KEY (pr_item_code_prefix)
REFERENCES ORU_SOURCE_CFG.dim_item (item_code_prefix);
