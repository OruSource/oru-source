USE ORU_SOURCE_SVC;

ALTER TABLE purchase_order_terms
ADD CONSTRAINT xfk_purc_order_terms_x_dim_general_terms
FOREIGN KEY (term_code)
REFERENCES ORU_SOURCE_CFG.dim_general_terms (term_code);
