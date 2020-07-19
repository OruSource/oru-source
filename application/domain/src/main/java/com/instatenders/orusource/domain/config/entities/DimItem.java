package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_item database table.
 * 
 */
@Entity
@Table(name="dim_item")
public class DimItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="item_code_prefix")
	private String itemCodePrefix;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="gst_percentage")
	private BigDecimal gstPercentage;

	@Column(name="hsn_code")
	private String hsnCode;

	@Column(name="item_base_price")
	private BigDecimal itemBasePrice;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_description")
	private String itemDescription;

	private String make;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to DimIsoCurrency
	@ManyToOne
	private DimIsoCurrency dimIsoCurrency;

	//bi-directional many-to-one association to DimItemSubCategory
	@ManyToOne
	private DimItemSubCategory dimItemSubCategory;

	//bi-directional many-to-one association to DimUnitOfMeasurement
	@ManyToOne
	private DimUnitOfMeasurement dimUnitOfMeasurement;

	public DimItem() {
	}

	public String getItemCodePrefix() {
		return this.itemCodePrefix;
	}

	public void setItemCodePrefix(String itemCodePrefix) {
		this.itemCodePrefix = itemCodePrefix;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public BigDecimal getGstPercentage() {
		return this.gstPercentage;
	}

	public void setGstPercentage(BigDecimal gstPercentage) {
		this.gstPercentage = gstPercentage;
	}

	public String getHsnCode() {
		return this.hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public BigDecimal getItemBasePrice() {
		return this.itemBasePrice;
	}

	public void setItemBasePrice(BigDecimal itemBasePrice) {
		this.itemBasePrice = itemBasePrice;
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

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public DimIsoCurrency getDimIsoCurrency() {
		return this.dimIsoCurrency;
	}

	public void setDimIsoCurrency(DimIsoCurrency dimIsoCurrency) {
		this.dimIsoCurrency = dimIsoCurrency;
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

}