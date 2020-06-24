USE ORU_SOURCE_SVC;

CREATE TABLE user_department_role_map (
    platform_user_id		INT				NOT NULL,
    department_code   		VARCHAR(16)		NOT NULL,
    user_role_name   		VARCHAR(32)		NOT NULL,
    approver_id   			INT				NOT NULL,
    supplier_code   		VARCHAR(128)				COMMENT 'If the user is supplier, supplier details should be captured',
    created_by   			INT				NOT NULL,
    updated_by   			INT,
    self_approval_limit   	DECIMAL(32, 0)	NOT NULL	COMMENT 'there will be a limit and based on that approval type will be decided, if the total PR value exceeded, this should go for approval.',
    create_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        TIMESTAMP 		NOT NULL 	DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE user_department_role_map COMMENT = 'This table holds the user associated department and role map details.';

ALTER TABLE user_department_role_map
ADD CONSTRAINT xpk_user_department_role_map
PRIMARY KEY (platform_user_id);
