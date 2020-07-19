package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_platform_user_job_title database table.
 * 
 */
@Entity
@Table(name="dim_platform_user_job_title")
public class DimPlatformUserJobTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="job_title")
	private String jobTitle;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="job_title_description")
	private String jobTitleDescription;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimPlatformUserJobTitle() {
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getJobTitleDescription() {
		return this.jobTitleDescription;
	}

	public void setJobTitleDescription(String jobTitleDescription) {
		this.jobTitleDescription = jobTitleDescription;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}