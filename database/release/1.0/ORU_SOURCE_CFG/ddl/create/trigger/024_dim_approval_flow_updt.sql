DELIMITER //
CREATE TRIGGER dim_approval_flow_updt BEFORE UPDATE
ON dim_approval_flow FOR EACH ROW
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
