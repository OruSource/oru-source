package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the purchase_request_approver_map database table.
 * 
 */
@Entity
@Table(name="purchase_request_approver_map")
public class PurchaseRequestApproverMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PurchaseRequestApproverMapPK id;

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

	//bi-directional many-to-one association to PurchaseRequestHeader
	@ManyToOne
	private PurchaseRequestHeader purchaseRequestHeader;

	public PurchaseRequestApproverMap() {
	}

	public PurchaseRequestApproverMapPK getId() {
		return this.id;
	}

	public void setId(PurchaseRequestApproverMapPK id) {
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

	public PurchaseRequestHeader getPurchaseRequestHeader() {
		return this.purchaseRequestHeader;
	}

	public void setPurchaseRequestHeader(PurchaseRequestHeader purchaseRequestHeader) {
		this.purchaseRequestHeader = purchaseRequestHeader;
	}

}