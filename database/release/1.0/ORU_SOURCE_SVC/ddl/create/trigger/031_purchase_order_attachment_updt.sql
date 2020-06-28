DELIMITER //
CREATE TRIGGER purchase_order_attachment_updt BEFORE UPDATE
ON purchase_order_attachment FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
