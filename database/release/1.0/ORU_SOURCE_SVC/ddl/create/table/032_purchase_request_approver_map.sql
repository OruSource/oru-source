USE ORU_SOURCE_SVC;

CREATE TABLE purchase_request_approver_map (
	purchase_request_id     	BIGINT		NOT NULL,
    approver_id   				INT			NOT NULL,
    approver_sequence   		INT			NOT NULL	COMMENT  'this will be numeric value, where this will be considered only if the APPROVAL_FLOW is SEQUENCE, else PR will be OPENED to all approvers',
    approver_level_status   	VARCHAR(32)	NOT NULL,
    create_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE purchase_request_approver_map COMMENT = 'This table holds approvers mapped against the PR. This allows the PR creator to choose multiple approvers for the PR. Approver flow will be based on the user selection(default is SEQUENCE flow).';

ALTER TABLE purchase_request_approver_map
ADD CONSTRAINT xpk_purchase_request_approver_map
UNIQUE KEY (purchase_request_id, approver_id);

CREATE INDEX xindx_purchase_request_approver_map
ON purchase_request_approver_map (purchase_request_id);
