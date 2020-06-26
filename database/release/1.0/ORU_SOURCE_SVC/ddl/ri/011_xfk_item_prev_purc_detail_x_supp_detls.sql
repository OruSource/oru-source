USE ORU_SOURCE_SVC;

ALTER TABLE item_previous_purchase_detail
ADD CONSTRAINT xfk_item_prev_purc_detail_x_supp_detls
FOREIGN KEY (previous_supplier_id)
REFERENCES supplier_details (supplier_code);
