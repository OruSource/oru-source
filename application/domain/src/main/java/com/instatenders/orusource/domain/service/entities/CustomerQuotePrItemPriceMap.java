package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the customer_quote_pr_item_price_map database table.
 * 
 */
@Entity
@Table(name="customer_quote_pr_item_price_map")
public class CustomerQuotePrItemPriceMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustomerQuotePrItemPriceMapPK id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="item_gst_percentage")
	private BigDecimal itemGstPercentage;

	@Column(name="item_gst_value")
	private BigDecimal itemGstValue;

	@Column(name="item_total_basic_price")
	private BigDecimal itemTotalBasicPrice;

	@Column(name="item_total_price")
	private BigDecimal itemTotalPrice;

	@Column(name="item_unit_basic_price")
	private BigDecimal itemUnitBasicPrice;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to CustomerQuoteHeader
	@ManyToOne
	private CustomerQuoteHeader customerQuoteHeader;

	//bi-directional many-to-one association to PurchaseRequestItem
	@ManyToOne
	private PurchaseRequestItem purchaseRequestItem;

	public CustomerQuotePrItemPriceMap() {
	}

	public CustomerQuotePrItemPriceMapPK getId() {
		return this.id;
	}

	public void setId(CustomerQuotePrItemPriceMapPK id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public BigDecimal getItemGstPercentage() {
		return this.itemGstPercentage;
	}

	public void setItemGstPercentage(BigDecimal itemGstPercentage) {
		this.itemGstPercentage = itemGstPercentage;
	}

	public BigDecimal getItemGstValue() {
		return this.itemGstValue;
	}

	public void setItemGstValue(BigDecimal itemGstValue) {
		this.itemGstValue = itemGstValue;
	}

	public BigDecimal getItemTotalBasicPrice() {
		return this.itemTotalBasicPrice;
	}

	public void setItemTotalBasicPrice(BigDecimal itemTotalBasicPrice) {
		this.itemTotalBasicPrice = itemTotalBasicPrice;
	}

	public BigDecimal getItemTotalPrice() {
		return this.itemTotalPrice;
	}

	public void setItemTotalPrice(BigDecimal itemTotalPrice) {
		this.itemTotalPrice = itemTotalPrice;
	}

	public BigDecimal getItemUnitBasicPrice() {
		return this.itemUnitBasicPrice;
	}

	public void setItemUnitBasicPrice(BigDecimal itemUnitBasicPrice) {
		this.itemUnitBasicPrice = itemUnitBasicPrice;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public CustomerQuoteHeader getCustomerQuoteHeader() {
		return this.customerQuoteHeader;
	}

	public void setCustomerQuoteHeader(CustomerQuoteHeader customerQuoteHeader) {
		this.customerQuoteHeader = customerQuoteHeader;
	}

	public PurchaseRequestItem getPurchaseRequestItem() {
		return this.purchaseRequestItem;
	}

	public void setPurchaseRequestItem(PurchaseRequestItem purchaseRequestItem) {
		this.purchaseRequestItem = purchaseRequestItem;
	}

}