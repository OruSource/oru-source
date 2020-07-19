package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the purchase_order_terms database table.
 * 
 */
@Embeddable
public class PurchaseOrderTermPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="purchase_order_quote_map_id", insertable=false, updatable=false)
	private String purchaseOrderQuoteMapId;

	@Column(name="term_code")
	private String termCode;

	public PurchaseOrderTermPK() {
	}
	public String getPurchaseOrderQuoteMapId() {
		return this.purchaseOrderQuoteMapId;
	}
	public void setPurchaseOrderQuoteMapId(String purchaseOrderQuoteMapId) {
		this.purchaseOrderQuoteMapId = purchaseOrderQuoteMapId;
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
		if (!(other instanceof PurchaseOrderTermPK)) {
			return false;
		}
		PurchaseOrderTermPK castOther = (PurchaseOrderTermPK)other;
		return 
			this.purchaseOrderQuoteMapId.equals(castOther.purchaseOrderQuoteMapId)
			&& this.termCode.equals(castOther.termCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.purchaseOrderQuoteMapId.hashCode();
		hash = hash * prime + this.termCode.hashCode();
		
		return hash;
	}
}