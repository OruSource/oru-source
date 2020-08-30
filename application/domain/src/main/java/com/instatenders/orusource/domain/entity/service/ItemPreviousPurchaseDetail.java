package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the item_previous_purchase_detail database table.
 * 
 */
@Entity
@Table(name="item_previous_purchase_detail")
public class ItemPreviousPurchaseDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemPreviousPurchaseDetailPK id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Temporal(TemporalType.DATE)
	@Column(name="previous_purchase_date")
	private Date previousPurchaseDate;

	@Column(name="previous_purchase_price")
	private BigDecimal previousPurchasePrice;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to SupplierDetail
	@ManyToOne
	private SupplierDetail supplierDetail;

	public ItemPreviousPurchaseDetail() {
	}

	public ItemPreviousPurchaseDetailPK getId() {
		return this.id;
	}

	public void setId(ItemPreviousPurchaseDetailPK id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getPreviousPurchaseDate() {
		return this.previousPurchaseDate;
	}

	public void setPreviousPurchaseDate(Date previousPurchaseDate) {
		this.previousPurchaseDate = previousPurchaseDate;
	}

	public BigDecimal getPreviousPurchasePrice() {
		return this.previousPurchasePrice;
	}

	public void setPreviousPurchasePrice(BigDecimal previousPurchasePrice) {
		this.previousPurchasePrice = previousPurchasePrice;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public SupplierDetail getSupplierDetail() {
		return this.supplierDetail;
	}

	public void setSupplierDetail(SupplierDetail supplierDetail) {
		this.supplierDetail = supplierDetail;
	}

}