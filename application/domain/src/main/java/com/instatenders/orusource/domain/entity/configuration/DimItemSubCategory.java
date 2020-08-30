package com.instatenders.orusource.domain.entity.configuration;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class DimItemSubCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private String itemSubCategoryCodePrefix;

	@Column
	private String itemSubCategoryCode;

	@Column
	private String itemSubCategoryDesc;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_CATEGORY_CODE_PREFIX", insertable = false, updatable = false)
	private DimItemCategory dimItemCategory;

	public String getItemSubCategoryCodePrefix() {
		return this.itemSubCategoryCodePrefix;
	}

	public void setItemSubCategoryCodePrefix(String itemSubCategoryCodePrefix) {
		this.itemSubCategoryCodePrefix = itemSubCategoryCodePrefix;
	}
	public String getItemSubCategoryCode() {
		return this.itemSubCategoryCode;
	}

	public void setItemSubCategoryCode(String itemSubCategoryCode) {
		this.itemSubCategoryCode = itemSubCategoryCode;
	}

	public String getItemSubCategoryDesc() {
		return this.itemSubCategoryDesc;
	}

	public void setItemSubCategoryDesc(String itemSubCategoryDesc) {
		this.itemSubCategoryDesc = itemSubCategoryDesc;
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

	public DimItemCategory getDimItemCategory() {
		return this.dimItemCategory;
	}

	public void setDimItemCategory(DimItemCategory dimItemCategory) {
		this.dimItemCategory = dimItemCategory;
	}
}
