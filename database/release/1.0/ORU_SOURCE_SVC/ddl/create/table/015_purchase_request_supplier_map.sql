USE ORU_SOURCE_SVC;

CREATE TABLE purchase_request_supplier_map (
    purchase_request_id		BIGINT		NOT NULL,
    supplier_code   		VARCHAR(6)	NOT NULL,
    create_timestamp        TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 	NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE purchase_request_supplier_map COMMENT = 'This allows the PR creator to choose their preferred supplier while creating PR itself, while creating RFQ the Purchase processor should give preference to the user selected supplier.';

ALTER TABLE purchase_request_supplier_map
ADD CONSTRAINT xunique_dim_platform_user_category
UNIQUE KEY (purchase_request_id, supplier_code);
