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
 * The persistent class for the purchase_order_rfq_item_map database table.
 * 
 */
@Entity
@Table(name="purchase_order_rfq_item_map")
public class PurchaseOrderRfqItemMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PurchaseOrderRfqItemMapPK id;

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

	@Column(name="negotiated_flag")
	private String negotiatedFlag;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@ManyToOne
	private PurchaseOrderQuoteMap purchaseOrderQuoteMap;

	//bi-directional many-to-one association to RfqPrMap
	@ManyToOne
	private RfqPrMap rfqPrMap;

	public PurchaseOrderRfqItemMap() {
	}

	public PurchaseOrderRfqItemMapPK getId() {
		return this.id;
	}

	public void setId(PurchaseOrderRfqItemMapPK id) {
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

	public String getNegotiatedFlag() {
		return this.negotiatedFlag;
	}

	public void setNegotiatedFlag(String negotiatedFlag) {
		this.negotiatedFlag = negotiatedFlag;
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

	public RfqPrMap getRfqPrMap() {
		return this.rfqPrMap;
	}

	public void setRfqPrMap(RfqPrMap rfqPrMap) {
		this.rfqPrMap = rfqPrMap;
	}

}