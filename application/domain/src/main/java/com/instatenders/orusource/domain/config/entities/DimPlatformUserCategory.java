package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_platform_user_category database table.
 * 
 */
@Entity
@Table(name="dim_platform_user_category")
public class DimPlatformUserCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_category")
	private String userCategory;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	@Column(name="user_category_description")
	private String userCategoryDescription;

	public DimPlatformUserCategory() {
	}

	public String getUserCategory() {
		return this.userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getUserCategoryDescription() {
		return this.userCategoryDescription;
	}

	public void setUserCategoryDescription(String userCategoryDescription) {
		this.userCategoryDescription = userCategoryDescription;
	}

}