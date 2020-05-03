CREATE TABLE IF NOT EXISTS dim_transaction_type (
    transaction_type_code VARCHAR(32) PRIMARY KEY NOT NULL,
    description VARCHAR(512),
    create_timestamp TIMESTAMP(6) DEFAULT systimestamp NOT NULL,
    update_timestamp TIMESTAMP(6) DEFAULT systimestamp NOT NULL
);
