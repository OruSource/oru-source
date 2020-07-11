DELIMITER //
CREATE TRIGGER customer_quote_pr_item_price_map_updt BEFORE UPDATE
ON customer_quote_pr_item_price_map FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
