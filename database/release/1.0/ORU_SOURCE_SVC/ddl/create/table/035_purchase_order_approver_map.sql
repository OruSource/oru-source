USE ORU_SOURCE_SVC;

CREATE TABLE purchase_order_approver_map (
	purchase_order_quote_map_id    	BIGINT		NOT NULL,
    approver_id   					INT			NOT NULL,
    approver_sequence   			INT			NOT NULL	COMMENT  'this will be numeric value, where this will be considered only if the APPROVAL_FLOW is SEQUENCE, else PO will be OPENED to all approvers',
    approver_level_status   		VARCHAR(32)	NOT NULL,
    create_timestamp        		TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        		TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE purchase_order_approver_map COMMENT = 'This table holds approvers mapped against the Purchase Order. This allows the PO creator to choose multiple approvers for the PO. Approver flow will be based on the user selection(default is SEQUENCE flow).';

ALTER TABLE purchase_order_approver_map
ADD CONSTRAINT xpk_purchase_order_approver_map
PRIMARY KEY (purchase_order_quote_map_id, approver_id);

CREATE INDEX xindx_purchase_order_approver_map
ON purchase_order_approver_map (purchase_order_quote_map_id);
