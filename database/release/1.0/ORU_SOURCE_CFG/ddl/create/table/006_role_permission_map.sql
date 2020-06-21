USE ORU_SOURCE_CFG;

CREATE TABLE role_permission_map (
    user_role_name	     		VARCHAR(32)		NOT NULL,
    permission_code     		VARCHAR(16)		NOT NULL,
    created_by   				VARCHAR(64)		NOT NULL,
    updated_by   				VARCHAR(64),
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE role_permission_map COMMENT = 'This table holds the user role possible permission mappings.';

ALTER TABLE role_permission_map
ADD CONSTRAINT xpk_role_permission_map
PRIMARY KEY (user_role_name, permission_code);
