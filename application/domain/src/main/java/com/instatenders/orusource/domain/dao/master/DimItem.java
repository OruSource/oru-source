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
//This Table consists of FK constraint
public class DimItem {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="item_code_prefix")
	private String itemCodePrefix;
	
	@Column(name="item_code")
	private String itemCode;
	
	@Column(name="item_description")
	private String itemDesc;
	
	@Column(name="make")
	private String make;
	
	@Column(name="item_sub_category_code_prefix")
	private String itemSubCategoryCodePrefix;
	
	@Column(name="unit_of_measurement")
	private String uom;
	
	@Column(name="item_base_price")
	private String itemBasePrice;
	
	@Column(name="item_base_currency")
	private String itemBaseCurrency;
	
	@Column(name="hsn_code")
	private String hsnCode;
	
	@Column(name="gst_percentage")
	private String gstPercentage;
	
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getItemCodePrefix() {
		return itemCodePrefix;
	}

	public void setItemCodePrefix(String itemCodePrefix) {
		this.itemCodePrefix = itemCodePrefix;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getItemSubCategoryCodePrefix() {
		return itemSubCategoryCodePrefix;
	}

	public void setItemSubCategoryCodePrefix(String itemSubCategoryCodePrefix) {
		this.itemSubCategoryCodePrefix = itemSubCategoryCodePrefix;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getItemBasePrice() {
		return itemBasePrice;
	}

	public void setItemBasePrice(String itemBasePrice) {
		this.itemBasePrice = itemBasePrice;
	}

	public String getItemBaseCurrency() {
		return itemBaseCurrency;
	}

	public void setItemBaseCurrency(String itemBaseCurrency) {
		this.itemBaseCurrency = itemBaseCurrency;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public String getGstPercentage() {
		return gstPercentage;
	}

	public void setGstPercentage(String gstPercentage) {
		this.gstPercentage = gstPercentage;
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
		return "DIMItem [itemCodePrefix=" + itemCodePrefix + ", itemCode=" + itemCode + ", itemDesc=" + itemDesc
				+ ", make=" + make + ", itemSubCategoryCodePrefix=" + itemSubCategoryCodePrefix + ", uom=" + uom
				+ ", itemBasePrice=" + itemBasePrice + ", itemBaseCurrency=" + itemBaseCurrency + ", hsnCode=" + hsnCode
				+ ", gstPercentage=" + gstPercentage + ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp="
				+ updateTimeStamp + "]";
	}

	
}
