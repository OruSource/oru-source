package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rfq_approver_map database table.
 * 
 */
@Embeddable
public class RfqApproverMapPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="rfq_id", insertable=false, updatable=false)
	private String rfqId;

	@Column(name="approver_id", insertable=false, updatable=false)
	private int approverId;

	public RfqApproverMapPK() {
	}
	public String getRfqId() {
		return this.rfqId;
	}
	public void setRfqId(String rfqId) {
		this.rfqId = rfqId;
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
		if (!(other instanceof RfqApproverMapPK)) {
			return false;
		}
		RfqApproverMapPK castOther = (RfqApproverMapPK)other;
		return 
			this.rfqId.equals(castOther.rfqId)
			&& this.approverId == castOther.approverId;
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.rfqId.hashCode();
		hash = hash * prime + this.approverId;
		
		return hash;
	}
}