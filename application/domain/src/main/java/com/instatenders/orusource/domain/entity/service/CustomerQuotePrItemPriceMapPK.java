package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the customer_quote_pr_item_price_map database table.
 * 
 */
@Embeddable
public class CustomerQuotePrItemPriceMapPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="customer_quote_header_id", insertable=false, updatable=false)
	private String customerQuoteHeaderId;

	@Column(name="pr_item_line_id", insertable=false, updatable=false)
	private String prItemLineId;

	public CustomerQuotePrItemPriceMapPK() {
	}
	public String getCustomerQuoteHeaderId() {
		return this.customerQuoteHeaderId;
	}
	public void setCustomerQuoteHeaderId(String customerQuoteHeaderId) {
		this.customerQuoteHeaderId = customerQuoteHeaderId;
	}
	public String getPrItemLineId() {
		return this.prItemLineId;
	}
	public void setPrItemLineId(String prItemLineId) {
		this.prItemLineId = prItemLineId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustomerQuotePrItemPriceMapPK)) {
			return false;
		}
		CustomerQuotePrItemPriceMapPK castOther = (CustomerQuotePrItemPriceMapPK)other;
		return 
			this.customerQuoteHeaderId.equals(castOther.customerQuoteHeaderId)
			&& this.prItemLineId.equals(castOther.prItemLineId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.customerQuoteHeaderId.hashCode();
		hash = hash * prime + this.prItemLineId.hashCode();
		
		return hash;
	}
}