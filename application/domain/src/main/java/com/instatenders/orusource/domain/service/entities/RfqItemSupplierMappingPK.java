package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the rfq_item_supplier_mapping database table.
 * 
 */
@Embeddable
public class RfqItemSupplierMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="rfq_item_line_id", insertable=false, updatable=false)
	private String rfqItemLineId;

	@Column(name="supplier_code", insertable=false, updatable=false)
	private String supplierCode;

	public RfqItemSupplierMappingPK() {
	}
	public String getRfqItemLineId() {
		return this.rfqItemLineId;
	}
	public void setRfqItemLineId(String rfqItemLineId) {
		this.rfqItemLineId = rfqItemLineId;
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
		if (!(other instanceof RfqItemSupplierMappingPK)) {
			return false;
		}
		RfqItemSupplierMappingPK castOther = (RfqItemSupplierMappingPK)other;
		return 
			this.rfqItemLineId.equals(castOther.rfqItemLineId)
			&& this.supplierCode.equals(castOther.supplierCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.rfqItemLineId.hashCode();
		hash = hash * prime + this.supplierCode.hashCode();
		
		return hash;
	}
}