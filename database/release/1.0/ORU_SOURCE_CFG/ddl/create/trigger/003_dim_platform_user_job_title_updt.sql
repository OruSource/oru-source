DELIMITER //
CREATE TRIGGER dim_platform_user_job_title_updt BEFORE UPDATE 
ON dim_platform_user_job_title FOR EACH ROW 
BEGIN 
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
