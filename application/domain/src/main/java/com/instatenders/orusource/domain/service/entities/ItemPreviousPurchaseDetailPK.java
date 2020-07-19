package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the item_previous_purchase_detail database table.
 * 
 */
@Embeddable
public class ItemPreviousPurchaseDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="item_code_prefix")
	private String itemCodePrefix;

	@Column(name="previous_purchase_currency")
	private String previousPurchaseCurrency;

	@Column(name="unit_of_measurement")
	private String unitOfMeasurement;

	public ItemPreviousPurchaseDetailPK() {
	}
	public String getItemCodePrefix() {
		return this.itemCodePrefix;
	}
	public void setItemCodePrefix(String itemCodePrefix) {
		this.itemCodePrefix = itemCodePrefix;
	}
	public String getPreviousPurchaseCurrency() {
		return this.previousPurchaseCurrency;
	}
	public void setPreviousPurchaseCurrency(String previousPurchaseCurrency) {
		this.previousPurchaseCurrency = previousPurchaseCurrency;
	}
	public String getUnitOfMeasurement() {
		return this.unitOfMeasurement;
	}
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItemPreviousPurchaseDetailPK)) {
			return false;
		}
		ItemPreviousPurchaseDetailPK castOther = (ItemPreviousPurchaseDetailPK)other;
		return 
			this.itemCodePrefix.equals(castOther.itemCodePrefix)
			&& this.previousPurchaseCurrency.equals(castOther.previousPurchaseCurrency)
			&& this.unitOfMeasurement.equals(castOther.unitOfMeasurement);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.itemCodePrefix.hashCode();
		hash = hash * prime + this.previousPurchaseCurrency.hashCode();
		hash = hash * prime + this.unitOfMeasurement.hashCode();
		
		return hash;
	}
}