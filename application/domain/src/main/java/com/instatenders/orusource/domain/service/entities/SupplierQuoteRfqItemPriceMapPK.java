package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the supplier_quote_rfq_item_price_map database table.
 * 
 */
@Embeddable
public class SupplierQuoteRfqItemPriceMapPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="supplier_quote_header_id", insertable=false, updatable=false)
	private String supplierQuoteHeaderId;

	@Column(name="rfq_item_line_id", insertable=false, updatable=false)
	private String rfqItemLineId;

	public SupplierQuoteRfqItemPriceMapPK() {
	}
	public String getSupplierQuoteHeaderId() {
		return this.supplierQuoteHeaderId;
	}
	public void setSupplierQuoteHeaderId(String supplierQuoteHeaderId) {
		this.supplierQuoteHeaderId = supplierQuoteHeaderId;
	}
	public String getRfqItemLineId() {
		return this.rfqItemLineId;
	}
	public void setRfqItemLineId(String rfqItemLineId) {
		this.rfqItemLineId = rfqItemLineId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SupplierQuoteRfqItemPriceMapPK)) {
			return false;
		}
		SupplierQuoteRfqItemPriceMapPK castOther = (SupplierQuoteRfqItemPriceMapPK)other;
		return 
			this.supplierQuoteHeaderId.equals(castOther.supplierQuoteHeaderId)
			&& this.rfqItemLineId.equals(castOther.rfqItemLineId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.supplierQuoteHeaderId.hashCode();
		hash = hash * prime + this.rfqItemLineId.hashCode();
		
		return hash;
	}
}