package com.instatenders.orusource.domain.dao.purchaserequest;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="purchase_request_supplier_map")
//this table has FK constraint
public class PurchaseRequestSupplierMap {

	@Column(name="purchase_request_id")
	private String PRId;
	
	@Column(name="supplier_code")
	private String supplierCode;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getPRId() {
		return PRId;
	}

	public void setPRId(String pRId) {
		PRId = pRId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
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
		return "PRSupplierMap [PRId=" + PRId + ", supplierCode=" + supplierCode + ", createTimeStamp=" + createTimeStamp
				+ ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
