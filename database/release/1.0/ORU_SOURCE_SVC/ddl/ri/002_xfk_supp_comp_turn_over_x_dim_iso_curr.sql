USE ORU_SOURCE_SVC;

ALTER TABLE supplier_company_turn_over
ADD CONSTRAINT xfk_supp_comp_turn_over_x_dim_iso_curr
FOREIGN KEY (iso_currency_code)
REFERENCES ORU_SOURCE_CFG.dim_iso_currency (iso_currency_code);
