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
 * The persistent class for the purchase_order_terms database table.
 * 
 */
@Entity
@Table(name="purchase_order_terms")
public class PurchaseOrderTerm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PurchaseOrderTermPK id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="negotiated_flag")
	private String negotiatedFlag;

	@Column(name="term_value")
	private String termValue;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@ManyToOne
	private PurchaseOrderQuoteMap purchaseOrderQuoteMap;

	public PurchaseOrderTerm() {
	}

	public PurchaseOrderTermPK getId() {
		return this.id;
	}

	public void setId(PurchaseOrderTermPK id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getNegotiatedFlag() {
		return this.negotiatedFlag;
	}

	public void setNegotiatedFlag(String negotiatedFlag) {
		this.negotiatedFlag = negotiatedFlag;
	}

	public String getTermValue() {
		return this.termValue;
	}

	public void setTermValue(String termValue) {
		this.termValue = termValue;
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