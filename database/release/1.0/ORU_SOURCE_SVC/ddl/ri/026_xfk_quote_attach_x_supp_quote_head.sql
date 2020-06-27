USE ORU_SOURCE_SVC;

ALTER TABLE quote_attachment
ADD CONSTRAINT xfk_quote_attach_x_supp_quote_head
FOREIGN KEY (supplier_quote_header_id)
REFERENCES supplier_quote_header (supplier_quote_header_id);
