USE ORU_SOURCE_SVC;

CREATE TABLE supplier_quote_approver_map (
	supplier_quote_header_id    BIGINT		NOT NULL,
    approver_id   				INT			NOT NULL,
    approver_sequence   		INT			NOT NULL	COMMENT  'this will be numeric value, where this will be considered only if the APPROVAL_FLOW is SEQUENCE, else Supplier Quote will be OPENED to all approvers',
    approver_level_status   	VARCHAR(32)	NOT NULL,
    create_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE supplier_quote_approver_map COMMENT = 'This table holds approvers mapped against the Supplier Quote. This allows the Quote creator to choose multiple approvers for the Supplier Quote. Approver flow will be based on the user selection(default is SEQUENCE flow).';

ALTER TABLE supplier_quote_approver_map
ADD CONSTRAINT xpk_supplier_quote_approver_map
PRIMARY KEY (supplier_quote_header_id, approver_id);

CREATE INDEX xindx_supplier_quote_approver_map
ON supplier_quote_approver_map (supplier_quote_header_id);
