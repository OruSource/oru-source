package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the purchase_request_supplier_map database table.
 * 
 */
@Embeddable
public class PurchaseRequestSupplierMapPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="purchase_request_id", insertable=false, updatable=false)
	private String purchaseRequestId;

	@Column(name="supplier_code", insertable=false, updatable=false)
	private String supplierCode;

	public PurchaseRequestSupplierMapPK() {
	}
	public String getPurchaseRequestId() {
		return this.purchaseRequestId;
	}
	public void setPurchaseRequestId(String purchaseRequestId) {
		this.purchaseRequestId = purchaseRequestId;
	}
	public String getSupplierCode() {
		return this.supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PurchaseRequestSupplierMapPK)) {
			return false;
		}
		PurchaseRequestSupplierMapPK castOther = (PurchaseRequestSupplierMapPK)other;
		return 
			this.purchaseRequestId.equals(castOther.purchaseRequestId)
			&& this.supplierCode.equals(castOther.supplierCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.purchaseRequestId.hashCode();
		hash = hash * prime + this.supplierCode.hashCode();
		
		return hash;
	}
}