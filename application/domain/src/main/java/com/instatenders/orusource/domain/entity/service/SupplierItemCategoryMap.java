package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the supplier_item_category_map database table.
 * 
 */
@Entity
@Table(name="supplier_item_category_map")
public class SupplierItemCategoryMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="supplier_item_category_map_id")
	private int supplierItemCategoryMapId;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_code_prefix")
	private String itemCodePrefix;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to SupplierDetail
	@ManyToOne
	private SupplierDetail supplierDetail;

	public SupplierItemCategoryMap() {
	}

	public int getSupplierItemCategoryMapId() {
		return this.supplierItemCategoryMapId;
	}

	public void setSupplierItemCategoryMapId(int supplierItemCategoryMapId) {
		this.supplierItemCategoryMapId = supplierItemCategoryMapId;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCodePrefix() {
		return this.itemCodePrefix;
	}

	public void setItemCodePrefix(String itemCodePrefix) {
		this.itemCodePrefix = itemCodePrefix;
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