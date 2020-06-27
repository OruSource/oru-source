USE ORU_SOURCE_SVC;

ALTER TABLE supplier_terms_response
ADD CONSTRAINT xfk_supp_terms_res_x_dim_general_terms
FOREIGN KEY (term_code)
REFERENCES ORU_SOURCE_CFG.dim_general_terms (term_code);
