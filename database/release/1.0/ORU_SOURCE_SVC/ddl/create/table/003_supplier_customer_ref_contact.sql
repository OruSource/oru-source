USE ORU_SOURCE_SVC;

CREATE TABLE supplier_customer_ref_contact (
    supplier_customer_ref_contact_id	INT				NOT NULL  AUTO_INCREMENT  PRIMARY KEY  COMMENT  'Auto-generated, sequence value.',
    salutation     					    VARCHAR(10)		NOT NULL,
    first_name     					    VARCHAR(64)		NOT NULL,
    last_name     					    VARCHAR(64),
    mobile_number     				    VARCHAR(16)		NOT NULL,
    landline_std_code     			    VARCHAR(8),
    landline_number     			    VARCHAR(16),
    email_address     				    VARCHAR(128)	NOT NULL,
    create_timestamp    			    TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp    			    TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE supplier_customer_ref_contact COMMENT = 'This table holds supplier customer details for contact.';
