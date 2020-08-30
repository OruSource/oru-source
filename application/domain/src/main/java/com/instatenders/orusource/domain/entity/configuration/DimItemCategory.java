package com.instatenders.orusource.domain.entity.configuration;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class DimItemCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private String itemCategoryCodePrefix;

	@Column
	private String itemCategoryCode;

	@Column
	private String itemCategoryDesc;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

	public String getItemCategoryCodePrefix() {
		return this.itemCategoryCodePrefix;
	}

	public void setItemCategoryCodePrefix(String itemCategoryCodePrefix) {
		this.itemCategoryCodePrefix = itemCategoryCodePrefix;
	}

	public String getItemCategoryCode() {
		return this.itemCategoryCode;
	}

	public void setItemCategoryCode(String itemCategoryCode) {
		this.itemCategoryCode = itemCategoryCode;
	}

	public String getItemCategoryDesc() {
		return this.itemCategoryDesc;
	}

	public void setItemCategoryDesc(String itemCategoryDesc) {
		this.itemCategoryDesc = itemCategoryDesc;
	}

	public Date getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}
}
