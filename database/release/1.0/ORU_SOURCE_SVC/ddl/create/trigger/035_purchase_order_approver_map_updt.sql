DELIMITER //
CREATE TRIGGER purchase_order_approver_map_updt BEFORE UPDATE
ON purchase_order_approver_map FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
