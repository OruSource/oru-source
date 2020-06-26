package com.instatenders.orusource.domain.dao.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="dim_platform_user_job_title")
public class DimPlatformUserJobTitle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="job_title")
	private String jobTitle;

	@Column(name="job_title_description")
	private String jobTitleDescription;

	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;

	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobTitleDescription() {
		return jobTitleDescription;
	}

	public void setJobTitleDescription(String jobTitleDescription) {
		this.jobTitleDescription = jobTitleDescription;
	}

	public Date getCreateTimeStamp() {
		return createTimeStamp;
	}

	public void setCreateTimeStamp(Date createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public Date getUpdateTimeStamp() {
		return updateTimeStamp;
	}

	public void setUpdateTimeStamp(Date updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}

	@Override
	public String toString() {
		return "DIMPlatformUserJobTitle [jobTitle=" + jobTitle + ", jobTitleDescription=" + jobTitleDescription
				+ ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
