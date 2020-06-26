DELIMITER //
CREATE TRIGGER item_previous_purchase_detail_updt BEFORE UPDATE
ON item_previous_purchase_detail FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
