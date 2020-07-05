USE ORU_SOURCE_SVC;

CREATE TABLE rfq_approver_map (
	rfq_id     					BIGINT		NOT NULL,
    approver_id   				INT			NOT NULL,
    approver_sequence   		INT			NOT NULL	COMMENT  'this will be numeric value, where this will be considered only if the APPROVAL_FLOW is SEQUENCE, else RFQ will be OPENED to all approvers',
    approver_level_status   	VARCHAR(32)	NOT NULL,
    create_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE rfq_approver_map COMMENT = 'This table holds approvers mapped against the RFQ. This allows the RFQ creator to choose multiple approvers for the RFQ. Approver flow will be based on the user selection(default is SEQUENCE flow).';

ALTER TABLE rfq_approver_map
ADD CONSTRAINT xpk_rfq_approver_map
UNIQUE KEY (rfq_id, approver_id);

CREATE INDEX xindx_rfq_approver_map
ON rfq_approver_map (rfq_id);
