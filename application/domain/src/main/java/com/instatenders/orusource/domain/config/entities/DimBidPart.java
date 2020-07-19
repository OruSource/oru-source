package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_bid_part database table.
 * 
 */
@Entity
@Table(name="dim_bid_part")
public class DimBidPart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bid_part_type")
	private String bidPartType;

	@Column(name="bid_part_description")
	private String bidPartDescription;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimBidPart() {
	}

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

}