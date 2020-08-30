package com.instatenders.orusource.domain.entity.configuration;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class DimItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private String itemCodePrefix;

	@Column
	private String itemCode;

	@Column
	private String itemDescription;

	@Column
	private String make;

	@Column
	private BigDecimal itemBasePrice;

	@Column
	private String hsnCode;

	@Column
	private BigDecimal gstPercentage;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_SUB_CATEGORY_CODE_PREFIX", insertable = false, updatable = false)
	private DimItemSubCategory dimItemSubCategory;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNIT_OF_MEASUREMENT", insertable = false, updatable = false)
	private DimUnitOfMeasurement dimUnitOfMeasurement;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_BASE_CURRENCY", insertable = false, updatable = false)
	private DimIsoCurrency dimIsoCurrency;

	public String getItemCodePrefix() {
		return this.itemCodePrefix;
	}

	public void setItemCodePrefix(String itemCodePrefix) {
		this.itemCodePrefix = itemCodePrefix;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public BigDecimal getItemBasePrice() {
		return this.itemBasePrice;
	}

	public void setItemBasePrice(BigDecimal itemBasePrice) {
		this.itemBasePrice = itemBasePrice;
	}

	public String getHsnCode() {
		return this.hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public BigDecimal getGstPercentage() {
		return this.gstPercentage;
	}

	public void setGstPercentage(BigDecimal gstPercentage) {
		this.gstPercentage = gstPercentage;
	}

	public Date getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public DimItemSubCategory getDimItemSubCategory() {
		return this.dimItemSubCategory;
	}

	public void setDimItemSubCategory(DimItemSubCategory dimItemSubCategory) {
		this.dimItemSubCategory = dimItemSubCategory;
	}

	public DimUnitOfMeasurement getDimUnitOfMeasurement() {
		return this.dimUnitOfMeasurement;
	}

	public void setDimUnitOfMeasurement(DimUnitOfMeasurement dimUnitOfMeasurement) {
		this.dimUnitOfMeasurement = dimUnitOfMeasurement;
	}

	public DimIsoCurrency getDimIsoCurrency() {
		return this.dimIsoCurrency;
	}

	public void setDimIsoCurrency(DimIsoCurrency dimIsoCurrency) {
		this.dimIsoCurrency = dimIsoCurrency;
	}
}
