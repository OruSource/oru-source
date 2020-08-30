package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the supplier_quote_rfq_item_price_map database table.
 * 
 */
@Entity
@Table(name="supplier_quote_rfq_item_price_map")
public class SupplierQuoteRfqItemPriceMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SupplierQuoteRfqItemPriceMapPK id;

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

	//bi-directional many-to-one association to RfqPrMap
	@ManyToOne
	private RfqPrMap rfqPrMap;

	//bi-directional many-to-one association to SupplierQuoteHeader
	@ManyToOne
	private SupplierQuoteHeader supplierQuoteHeader;

	public SupplierQuoteRfqItemPriceMap() {
	}

	public SupplierQuoteRfqItemPriceMapPK getId() {
		return this.id;
	}

	public void setId(SupplierQuoteRfqItemPriceMapPK id) {
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

	public RfqPrMap getRfqPrMap() {
		return this.rfqPrMap;
	}

	public void setRfqPrMap(RfqPrMap rfqPrMap) {
		this.rfqPrMap = rfqPrMap;
	}

	public SupplierQuoteHeader getSupplierQuoteHeader() {
		return this.supplierQuoteHeader;
	}

	public void setSupplierQuoteHeader(SupplierQuoteHeader supplierQuoteHeader) {
		this.supplierQuoteHeader = supplierQuoteHeader;
	}

}