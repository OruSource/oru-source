package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PurchaseRequestApproverMapPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="purchase_request_id", insertable=false, updatable=false)
	private String purchaseRequestId;

	@Column(name="approver_id", insertable=false, updatable=false)
	private int approverId;

	public PurchaseRequestApproverMapPK() {
	}

	public String getPurchaseRequestId() {
		return this.purchaseRequestId;
	}

	public void setPurchaseRequestId(String purchaseRequestId) {
		this.purchaseRequestId = purchaseRequestId;
	}

	public int getApproverId() {
		return this.approverId;
	}

	public void setApproverId(int approverId) {
		this.approverId = approverId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PurchaseRequestApproverMapPK)) {
			return false;
		}
		PurchaseRequestApproverMapPK castOther = (PurchaseRequestApproverMapPK)other;
		return this.purchaseRequestId.equals(castOther.purchaseRequestId) &&
				this.approverId == castOther.approverId;
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.purchaseRequestId.hashCode();
		hash = hash * prime + this.approverId;
		
		return hash;
	}
}