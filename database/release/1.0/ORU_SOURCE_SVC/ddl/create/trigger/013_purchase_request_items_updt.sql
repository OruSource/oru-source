DELIMITER //
CREATE TRIGGER purchase_request_items_updt BEFORE UPDATE
ON purchase_request_items FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
