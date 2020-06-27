USE ORU_SOURCE_SVC;

ALTER TABLE rfq_term_map
ADD CONSTRAINT xfk_rfq_term_map_x_dim_general_terms
FOREIGN KEY (term_code)
REFERENCES ORU_SOURCE_CFG.dim_general_terms (term_code);
