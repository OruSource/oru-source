DELIMITER //
CREATE TRIGGER rfq_approver_map_updt BEFORE UPDATE
ON rfq_approver_map FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
