package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the purchase_order_quote_price_map database table.
 * 
 */
@Entity
@Table(name="purchase_order_quote_price_map")
public class PurchaseOrderQuotePriceMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="freight_gst_percentage")
	private BigDecimal freightGstPercentage;

	@Column(name="freight_gst_value")
	private BigDecimal freightGstValue;

	@Column(name="freight_percentage")
	private BigDecimal freightPercentage;

	@Column(name="freight_total_value")
	private BigDecimal freightTotalValue;

	@Column(name="freight_value")
	private BigDecimal freightValue;

	@Column(name="rfq_items_total_basic_price")
	private BigDecimal rfqItemsTotalBasicPrice;

	@Column(name="rfq_items_total_price")
	private BigDecimal rfqItemsTotalPrice;

	@Column(name="total_price")
	private BigDecimal totalPrice;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@ManyToOne
	private PurchaseOrderQuoteMap purchaseOrderQuoteMap;

	public PurchaseOrderQuotePriceMap() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public BigDecimal getFreightGstPercentage() {
		return this.freightGstPercentage;
	}

	public void setFreightGstPercentage(BigDecimal freightGstPercentage) {
		this.freightGstPercentage = freightGstPercentage;
	}

	public BigDecimal getFreightGstValue() {
		return this.freightGstValue;
	}

	public void setFreightGstValue(BigDecimal freightGstValue) {
		this.freightGstValue = freightGstValue;
	}

	public BigDecimal getFreightPercentage() {
		return this.freightPercentage;
	}

	public void setFreightPercentage(BigDecimal freightPercentage) {
		this.freightPercentage = freightPercentage;
	}

	public BigDecimal getFreightTotalValue() {
		return this.freightTotalValue;
	}

	public void setFreightTotalValue(BigDecimal freightTotalValue) {
		this.freightTotalValue = freightTotalValue;
	}

	public BigDecimal getFreightValue() {
		return this.freightValue;
	}

	public void setFreightValue(BigDecimal freightValue) {
		this.freightValue = freightValue;
	}

	public BigDecimal getRfqItemsTotalBasicPrice() {
		return this.rfqItemsTotalBasicPrice;
	}

	public void setRfqItemsTotalBasicPrice(BigDecimal rfqItemsTotalBasicPrice) {
		this.rfqItemsTotalBasicPrice = rfqItemsTotalBasicPrice;
	}

	public BigDecimal getRfqItemsTotalPrice() {
		return this.rfqItemsTotalPrice;
	}

	public void setRfqItemsTotalPrice(BigDecimal rfqItemsTotalPrice) {
		this.rfqItemsTotalPrice = rfqItemsTotalPrice;
	}

	public BigDecimal getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public PurchaseOrderQuoteMap getPurchaseOrderQuoteMap() {
		return this.purchaseOrderQuoteMap;
	}

	public void setPurchaseOrderQuoteMap(PurchaseOrderQuoteMap purchaseOrderQuoteMap) {
		this.purchaseOrderQuoteMap = purchaseOrderQuoteMap;
	}

}