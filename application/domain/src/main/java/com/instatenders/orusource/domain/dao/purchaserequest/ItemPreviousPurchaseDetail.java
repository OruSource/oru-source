package com.instatenders.orusource.domain.dao.purchaserequest;

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
@Table(name="item_previous_purchase_detail")
//this table has FK constraint
public class ItemPreviousPurchaseDetail {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="item_code_prefix")
	private String itemCodePrefix;
	
	@Column(name="unit_of_measurement")
	private String UOM;
	
	@Column(name="previous_purchase_currency")
	private String prevPurchaseCurrency;

	@Column(name="previous_purchase_price")
	private String prevPurchasePrice;
	
	@Column(name="previous_purchase_date")
	private Date prevPurchaseDate;

	@Column(name="previous_supplier_id")
	private String prevSupplierId;
	
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

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public String getPrevPurchaseCurrency() {
		return prevPurchaseCurrency;
	}

	public void setPrevPurchaseCurrency(String prevPurchaseCurrency) {
		this.prevPurchaseCurrency = prevPurchaseCurrency;
	}

	public String getPrevPurchasePrice() {
		return prevPurchasePrice;
	}

	public void setPrevPurchasePrice(String prevPurchasePrice) {
		this.prevPurchasePrice = prevPurchasePrice;
	}

	public Date getPrevPurchaseDate() {
		return prevPurchaseDate;
	}

	public void setPrevPurchaseDate(Date prevPurchaseDate) {
		this.prevPurchaseDate = prevPurchaseDate;
	}

	public String getPrevSupplierId() {
		return prevSupplierId;
	}

	public void setPrevSupplierId(String prevSupplierId) {
		this.prevSupplierId = prevSupplierId;
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
		return "ItemPreviousPurchaseDetail [itemCodePrefix=" + itemCodePrefix + ", UOM=" + UOM
				+ ", prevPurchaseCurrency=" + prevPurchaseCurrency + ", prevPurchasePrice=" + prevPurchasePrice
				+ ", prevPurchaseDate=" + prevPurchaseDate + ", prevSupplierId=" + prevSupplierId + ", createTimeStamp="
				+ createTimeStamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
