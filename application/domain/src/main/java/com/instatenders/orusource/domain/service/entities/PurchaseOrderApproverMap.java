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
 * The persistent class for the purchase_order_approver_map database table.
 * 
 */
@Entity
@Table(name="purchase_order_approver_map")
public class PurchaseOrderApproverMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PurchaseOrderApproverMapPK id;

	@Column(name="approver_level_status")
	private String approverLevelStatus;

	@Column(name="approver_sequence")
	private int approverSequence;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@ManyToOne
	private PurchaseOrderQuoteMap purchaseOrderQuoteMap;

	public PurchaseOrderApproverMap() {
	}

	public PurchaseOrderApproverMapPK getId() {
		return this.id;
	}

	public void setId(PurchaseOrderApproverMapPK id) {
		this.id = id;
	}

	public String getApproverLevelStatus() {
		return this.approverLevelStatus;
	}

	public void setApproverLevelStatus(String approverLevelStatus) {
		this.approverLevelStatus = approverLevelStatus;
	}

	public int getApproverSequence() {
		return this.approverSequence;
	}

	public void setApproverSequence(int approverSequence) {
		this.approverSequence = approverSequence;
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

	public PlatformUserHeader getPlatformUserHeader() {
		return this.platformUserHeader;
	}

	public void setPlatformUserHeader(PlatformUserHeader platformUserHeader) {
		this.platformUserHeader = platformUserHeader;
	}

	public PurchaseOrderQuoteMap getPurchaseOrderQuoteMap() {
		return this.purchaseOrderQuoteMap;
	}

	public void setPurchaseOrderQuoteMap(PurchaseOrderQuoteMap purchaseOrderQuoteMap) {
		this.purchaseOrderQuoteMap = purchaseOrderQuoteMap;
	}

}