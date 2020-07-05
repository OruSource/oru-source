USE ORU_SOURCE_SVC;

ALTER TABLE purchase_order_quote_map
ADD CONSTRAINT xfk_purc_ord_quote_map_x_plat_user_head_assign_to
FOREIGN KEY (assigned_to)
REFERENCES platform_user_header (platform_user_id);
