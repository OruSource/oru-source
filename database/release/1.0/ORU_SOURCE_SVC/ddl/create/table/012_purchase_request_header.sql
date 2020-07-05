USE ORU_SOURCE_SVC;

CREATE TABLE purchase_request_header (
    purchase_request_id     		BIGINT			NOT NULL	AUTO_INCREMENT PRIMARY KEY 	COMMENT 'Auto-generated, sequence value.',
    purchase_request_owner_id   	INT				NOT NULL								COMMENT 'person who created the PR',
    purchase_request_create_date   	DATE			NOT NULL								COMMENT 'expected delivery date',
    delivery_date   				DATE			NOT NULL,
    delivery_address_id   			INT				NOT NULL								COMMENT 'user will have multiple addresses, using this address id get the complete address from platform_user_address table',
    purchase_currency   			VARCHAR(3)		NOT NULL								COMMENT 'based on the purchase currency previous purchased item price should be retrieved from the item_previous_purchase_detail table. If value is not present get the value from dim_item table base price/currency',
    purchase_request_total_value   	DECIMAL(32, 2)	NOT NULL								COMMENT 'sum of all the items total value without gst and freight value',
    purchase_request_status   		VARCHAR(32)		NOT NULL,
    on_behalf_of   					INT														COMMENT 'if someone is created on behalf of you, the person should choose the user to whom he is creating this PR. mail should be triggered to the respective user',
    approval_type   				VARCHAR(64)		NOT NULL,
    assigned_to                     INT             NOT NULL                                COMMENT 'used to identify the PR assigned to which approver user',
    approval_flow                   VARCHAR(64)     NOT NULL,
    approved_by        				INT														COMMENT 'Person who approved/reviewed the PR',
    attachment_available   			VARCHAR(1)		NOT NULL								COMMENT 'while creating PR user might add some attachments for quicker approval. Attachment can be existing PR reference or PO reference.',
    create_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        		TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE purchase_request_header COMMENT = 'This table holds purchase request header data.';

CREATE INDEX xindx_purchase_request_header
ON purchase_request_header (purchase_request_owner_id);

ALTER TABLE purchase_request_header
ADD CHECK (attachment_available IN ('Y', 'N'));
