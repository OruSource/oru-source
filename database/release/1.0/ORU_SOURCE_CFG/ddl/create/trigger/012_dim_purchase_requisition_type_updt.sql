DELIMITER //
CREATE TRIGGER dim_purchase_requisition_type_updt BEFORE UPDATE
ON dim_purchase_requisition_type FOR EACH ROW
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
