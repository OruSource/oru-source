DELIMITER //
CREATE TRIGGER supplier_item_category_map_updt BEFORE UPDATE 
ON supplier_item_category_map FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
