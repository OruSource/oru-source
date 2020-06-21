USE ORU_SOURCE_CFG;

CREATE TABLE dim_bid_part (
    bid_part_type     			VARCHAR(64)		NOT NULL,
    bid_part_description	    VARCHAR(128)	NOT NULL,
    create_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_timestamp        	TIMESTAMP 		NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE dim_bid_part COMMENT = 'This table holds the bid part type defined by government.';

ALTER TABLE dim_bid_part
ADD CONSTRAINT xpk_dim_bid_part 
PRIMARY KEY (bid_part_type);
