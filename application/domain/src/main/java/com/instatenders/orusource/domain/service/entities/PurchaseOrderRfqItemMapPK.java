package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the purchase_order_rfq_item_map database table.
 * 
 */
@Embeddable
public class PurchaseOrderRfqItemMapPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="purchase_order_quote_map_id", insertable=false, updatable=false)
	private String purchaseOrderQuoteMapId;

	@Column(name="rfq_item_line_id", insertable=false, updatable=false)
	private String rfqItemLineId;

	public PurchaseOrderRfqItemMapPK() {
	}
	public String getPurchaseOrderQuoteMapId() {
		return this.purchaseOrderQuoteMapId;
	}
	public void setPurchaseOrderQuoteMapId(String purchaseOrderQuoteMapId) {
		this.purchaseOrderQuoteMapId = purchaseOrderQuoteMapId;
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
		if (!(other instanceof PurchaseOrderRfqItemMapPK)) {
			return false;
		}
		PurchaseOrderRfqItemMapPK castOther = (PurchaseOrderRfqItemMapPK)other;
		return 
			this.purchaseOrderQuoteMapId.equals(castOther.purchaseOrderQuoteMapId)
			&& this.rfqItemLineId.equals(castOther.rfqItemLineId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.purchaseOrderQuoteMapId.hashCode();
		hash = hash * prime + this.rfqItemLineId.hashCode();
		
		return hash;
	}
}