package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the purchase_request_supplier_map database table.
 * 
 */
@Entity
@Table(name="purchase_request_supplier_map")
public class PurchaseRequestSupplierMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PurchaseRequestSupplierMapPK id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PurchaseRequestHeader
	@ManyToOne
	private PurchaseRequestHeader purchaseRequestHeader;

	//bi-directional many-to-one association to SupplierDetail
	@ManyToOne
	private SupplierDetail supplierDetail;

	public PurchaseRequestSupplierMap() {
	}

	public PurchaseRequestSupplierMapPK getId() {
		return this.id;
	}

	public void setId(PurchaseRequestSupplierMapPK id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public PurchaseRequestHeader getPurchaseRequestHeader() {
		return this.purchaseRequestHeader;
	}

	public void setPurchaseRequestHeader(PurchaseRequestHeader purchaseRequestHeader) {
		this.purchaseRequestHeader = purchaseRequestHeader;
	}

	public SupplierDetail getSupplierDetail() {
		return this.supplierDetail;
	}

	public void setSupplierDetail(SupplierDetail supplierDetail) {
		this.supplierDetail = supplierDetail;
	}

}