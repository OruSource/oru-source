USE ORU_SOURCE_SVC;

ALTER TABLE rfq_supplier_mapping
ADD CONSTRAINT xfk_rfq_supp_map_x_rfq_pr_map
FOREIGN KEY (rfq_id)
REFERENCES rfq_pr_map (rfq_id);
