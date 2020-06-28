DELIMITER //
CREATE TRIGGER purchase_order_terms_updt BEFORE UPDATE
ON purchase_order_terms FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
