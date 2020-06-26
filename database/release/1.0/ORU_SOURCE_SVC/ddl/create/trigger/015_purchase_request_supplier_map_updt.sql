DELIMITER //
CREATE TRIGGER purchase_request_supplier_map_updt BEFORE UPDATE
ON purchase_request_supplier_map FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
