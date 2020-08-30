package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the customer_quote_pr_price_map database table.
 * 
 */
@Entity
@Table(name="customer_quote_pr_price_map")
public class CustomerQuotePrPriceMap implements Serializable {
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

	@Column(name="pr_items_total_basic_price")
	private BigDecimal prItemsTotalBasicPrice;

	@Column(name="pr_items_total_price")
	private BigDecimal prItemsTotalPrice;

	@Column(name="total_price")
	private BigDecimal totalPrice;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to CustomerQuoteHeader
	@ManyToOne
	private CustomerQuoteHeader customerQuoteHeader;

	public CustomerQuotePrPriceMap() {
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

	public BigDecimal getPrItemsTotalBasicPrice() {
		return this.prItemsTotalBasicPrice;
	}

	public void setPrItemsTotalBasicPrice(BigDecimal prItemsTotalBasicPrice) {
		this.prItemsTotalBasicPrice = prItemsTotalBasicPrice;
	}

	public BigDecimal getPrItemsTotalPrice() {
		return this.prItemsTotalPrice;
	}

	public void setPrItemsTotalPrice(BigDecimal prItemsTotalPrice) {
		this.prItemsTotalPrice = prItemsTotalPrice;
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

	public CustomerQuoteHeader getCustomerQuoteHeader() {
		return this.customerQuoteHeader;
	}

	public void setCustomerQuoteHeader(CustomerQuoteHeader customerQuoteHeader) {
		this.customerQuoteHeader = customerQuoteHeader;
	}

}