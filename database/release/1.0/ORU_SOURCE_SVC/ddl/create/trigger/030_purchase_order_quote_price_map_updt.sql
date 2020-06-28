DELIMITER //
CREATE TRIGGER purchase_order_quote_price_map_updt BEFORE UPDATE
ON purchase_order_quote_price_map FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
