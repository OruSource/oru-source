DELIMITER //
CREATE TRIGGER rfq_item_supplier_mapping_updt BEFORE UPDATE
ON rfq_item_supplier_mapping FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
