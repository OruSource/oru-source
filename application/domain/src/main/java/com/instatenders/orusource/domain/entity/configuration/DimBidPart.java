package com.instatenders.orusource.domain.entity.configuration;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class DimBidPart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private String bidPartType;

	@Column
	private String bidPartDescription;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

	public String getBidPartType() {
		return this.bidPartType;
	}

	public void setBidPartType(String bidPartType) {
		this.bidPartType = bidPartType;
	}

	public String getBidPartDescription() {
		return this.bidPartDescription;
	}

	public void setBidPartDescription(String bidPartDescription) {
		this.bidPartDescription = bidPartDescription;
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
}
