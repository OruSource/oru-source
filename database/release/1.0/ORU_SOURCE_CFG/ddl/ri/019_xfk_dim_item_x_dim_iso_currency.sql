USE ORU_SOURCE_CFG;

ALTER TABLE dim_item
ADD CONSTRAINT xfk_dim_item_x_dim_iso_currency
FOREIGN KEY (item_base_currency)
REFERENCES dim_iso_currency (iso_currency_code);
