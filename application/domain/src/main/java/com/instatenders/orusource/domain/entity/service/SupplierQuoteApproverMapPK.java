package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the supplier_quote_approver_map database table.
 * 
 */
@Embeddable
public class SupplierQuoteApproverMapPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="supplier_quote_header_id", insertable=false, updatable=false)
	private String supplierQuoteHeaderId;

	@Column(name="approver_id", insertable=false, updatable=false)
	private int approverId;

	public SupplierQuoteApproverMapPK() {
	}
	public String getSupplierQuoteHeaderId() {
		return this.supplierQuoteHeaderId;
	}
	public void setSupplierQuoteHeaderId(String supplierQuoteHeaderId) {
		this.supplierQuoteHeaderId = supplierQuoteHeaderId;
	}
	public int getApproverId() {
		return this.approverId;
	}
	public void setApproverId(int approverId) {
		this.approverId = approverId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SupplierQuoteApproverMapPK)) {
			return false;
		}
		SupplierQuoteApproverMapPK castOther = (SupplierQuoteApproverMapPK)other;
		return 
			this.supplierQuoteHeaderId.equals(castOther.supplierQuoteHeaderId)
			&& this.approverId == castOther.approverId;
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.supplierQuoteHeaderId.hashCode();
		hash = hash * prime + this.approverId;
		
		return hash;
	}
}