DELIMITER //
CREATE TRIGGER dim_item_category_updt BEFORE UPDATE 
ON dim_item_category FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
