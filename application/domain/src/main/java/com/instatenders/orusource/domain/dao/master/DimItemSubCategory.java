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
@Table(name="dim_item_sub_category")

//This table has FK constraint to dimitemcategory 
public class DimItemSubCategory {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="item_sub_category_code_prefix")
	private String itemSubCategoryCodePrefix;
	
	@Column(name="item_sub_category_code")
	private String itemSubCategoryCode;
	
	@Column(name="item_sub_category_desc")
	private String itemSubCategoryDesc;
	
	@Column(name="item_category_code_prefix")
	private String itemCategoryCodePrefix;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getItemSubCategoryCodePrefix() {
		return itemSubCategoryCodePrefix;
	}

	public void setItemSubCategoryCodePrefix(String itemSubCategoryCodePrefix) {
		this.itemSubCategoryCodePrefix = itemSubCategoryCodePrefix;
	}

	public String getItemSubCategoryCode() {
		return itemSubCategoryCode;
	}

	public void setItemSubCategoryCode(String itemSubCategoryCode) {
		this.itemSubCategoryCode = itemSubCategoryCode;
	}

	public String getItemSubCategoryDesc() {
		return itemSubCategoryDesc;
	}

	public void setItemSubCategoryDesc(String itemSubCategoryDesc) {
		this.itemSubCategoryDesc = itemSubCategoryDesc;
	}

	public String getItemCategoryCodePrefix() {
		return itemCategoryCodePrefix;
	}

	public void setItemCategoryCodePrefix(String itemCategoryCodePrefix) {
		this.itemCategoryCodePrefix = itemCategoryCodePrefix;
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
		return "DIMItemSubCategory [itemSubCategoryCodePrefix=" + itemSubCategoryCodePrefix + ", itemSubCategoryCode="
				+ itemSubCategoryCode + ", itemSubCategoryDesc=" + itemSubCategoryDesc + ", itemCategoryCodePrefix="
				+ itemCategoryCodePrefix + ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp="
				+ updateTimeStamp + "]";
	}
	
	
}
