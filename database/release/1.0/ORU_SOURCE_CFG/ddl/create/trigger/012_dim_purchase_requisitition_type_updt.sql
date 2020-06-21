DELIMITER //
CREATE TRIGGER dim_purchase_requisitition_type_updt BEFORE UPDATE 
ON dim_purchase_requisitition_type FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
