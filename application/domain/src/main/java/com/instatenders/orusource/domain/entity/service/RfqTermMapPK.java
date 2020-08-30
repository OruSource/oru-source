package com.instatenders.orusource.domain.entity.service;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the rfq_term_map database table.
 * 
 */
@Embeddable
public class RfqTermMapPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="rfq_id", insertable=false, updatable=false)
	private String rfqId;

	@Column(name="term_code")
	private String termCode;

	public RfqTermMapPK() {
	}
	public String getRfqId() {
		return this.rfqId;
	}
	public void setRfqId(String rfqId) {
		this.rfqId = rfqId;
	}
	public String getTermCode() {
		return this.termCode;
	}
	public void setTermCode(String termCode) {
		this.termCode = termCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RfqTermMapPK)) {
			return false;
		}
		RfqTermMapPK castOther = (RfqTermMapPK)other;
		return 
			this.rfqId.equals(castOther.rfqId)
			&& this.termCode.equals(castOther.termCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.rfqId.hashCode();
		hash = hash * prime + this.termCode.hashCode();
		
		return hash;
	}
}