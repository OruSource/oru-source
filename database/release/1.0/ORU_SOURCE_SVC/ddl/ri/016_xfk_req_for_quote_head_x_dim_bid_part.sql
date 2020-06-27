USE ORU_SOURCE_SVC;

ALTER TABLE request_for_quote_header
ADD CONSTRAINT xfk_req_for_quote_head_x_dim_bid_part
FOREIGN KEY (bid_part_type)
REFERENCES ORU_SOURCE_CFG.dim_bid_part (bid_part_type);
