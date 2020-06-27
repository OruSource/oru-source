DELIMITER //
CREATE TRIGGER quote_rfq_price_map_updt BEFORE UPDATE
ON quote_rfq_price_map FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
