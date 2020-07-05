USE ORU_SOURCE_SVC;

ALTER TABLE purchase_request_approver_map
ADD CONSTRAINT xfk_purc_req_app_map_x_dim_status
FOREIGN KEY (approver_level_status)
REFERENCES ORU_SOURCE_CFG.dim_status (status_code);
