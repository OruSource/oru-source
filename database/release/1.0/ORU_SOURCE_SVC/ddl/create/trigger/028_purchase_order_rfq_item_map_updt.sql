DELIMITER //
CREATE TRIGGER purchase_order_rfq_item_map_updt BEFORE UPDATE
ON purchase_order_rfq_item_map FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
