DELIMITER //
CREATE TRIGGER supplier_customer_ref_contact_updt BEFORE UPDATE 
ON supplier_customer_ref_contact FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
