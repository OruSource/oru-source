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
@Table(name="dim_item_category")
public class DimItemCategory {


	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="item_category_code_prefix")
	private String itemCategoryCodePrefix;
	
	@Column(name="item_category_code")
	private String itemCategoryCode;
	
	@Column(name="item_category_desc")
	private String itemCategoryDesc;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getItemCategoryCodePrefix() {
		return itemCategoryCodePrefix;
	}

	public void setItemCategoryCodePrefix(String itemCategoryCodePrefix) {
		this.itemCategoryCodePrefix = itemCategoryCodePrefix;
	}

	public String getItemCategoryCode() {
		return itemCategoryCode;
	}

	public void setItemCategoryCode(String itemCategoryCode) {
		this.itemCategoryCode = itemCategoryCode;
	}

	public String getItemCategoryDesc() {
		return itemCategoryDesc;
	}

	public void setItemCategoryDesc(String itemCategoryDesc) {
		this.itemCategoryDesc = itemCategoryDesc;
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
		return "DIMItemCategory [itemCategoryCodePrefix=" + itemCategoryCodePrefix + ", itemCategoryCode="
				+ itemCategoryCode + ", itemCategoryDesc=" + itemCategoryDesc + ", createTimeStamp=" + createTimeStamp
				+ ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
