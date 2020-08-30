package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the supplier_terms_response database table.
 * 
 */
@Embeddable
public class SupplierTermsResponsePK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="supplier_quote_header_id", insertable=false, updatable=false)
	private String supplierQuoteHeaderId;

	@Column(name="term_code")
	private String termCode;

	public SupplierTermsResponsePK() {
	}
	public String getSupplierQuoteHeaderId() {
		return this.supplierQuoteHeaderId;
	}
	public void setSupplierQuoteHeaderId(String supplierQuoteHeaderId) {
		this.supplierQuoteHeaderId = supplierQuoteHeaderId;
	}
	public String getTermCode() {
		return this.termCode;
	}
	public void setTermCode(String termCode) {
		this.termCode = termCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SupplierTermsResponsePK)) {
			return false;
		}
		SupplierTermsResponsePK castOther = (SupplierTermsResponsePK)other;
		return 
			this.supplierQuoteHeaderId.equals(castOther.supplierQuoteHeaderId)
			&& this.termCode.equals(castOther.termCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.supplierQuoteHeaderId.hashCode();
		hash = hash * prime + this.termCode.hashCode();
		
		return hash;
	}
}