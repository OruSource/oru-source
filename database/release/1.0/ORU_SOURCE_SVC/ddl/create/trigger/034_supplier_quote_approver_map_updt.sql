DELIMITER //
CREATE TRIGGER supplier_quote_approver_map_updt BEFORE UPDATE
ON supplier_quote_approver_map FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
