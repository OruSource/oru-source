package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the rfq_supplier_mapping database table.
 * 
 */
@Embeddable
public class RfqSupplierMappingPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="rfq_id", insertable=false, updatable=false)
	private String rfqId;

	@Column(name="supplier_code", insertable=false, updatable=false)
	private String supplierCode;

	public RfqSupplierMappingPK() {
	}
	public String getRfqId() {
		return this.rfqId;
	}
	public void setRfqId(String rfqId) {
		this.rfqId = rfqId;
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
		if (!(other instanceof RfqSupplierMappingPK)) {
			return false;
		}
		RfqSupplierMappingPK castOther = (RfqSupplierMappingPK)other;
		return 
			this.rfqId.equals(castOther.rfqId)
			&& this.supplierCode.equals(castOther.supplierCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.rfqId.hashCode();
		hash = hash * prime + this.supplierCode.hashCode();
		
		return hash;
	}
}