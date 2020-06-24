USE ORU_SOURCE_SVC;

ALTER TABLE platform_user_header
ADD CONSTRAINT xfk_platform_usr_header_x_dim_plat_user_job_title
FOREIGN KEY (job_title)
REFERENCES ORU_SOURCE_CFG.dim_platform_user_job_title (job_title);
