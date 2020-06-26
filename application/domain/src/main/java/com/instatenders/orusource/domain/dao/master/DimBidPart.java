package com.instatenders.orusource.domain.dao.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="dim_bid_part")
public class DimBidPart {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="bid_part_type")
	private String bidPartType;
	
	@Column(name="bid_part_description")
	private String bidPartDescription;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getBidPartType() {
		return bidPartType;
	}

	public void setBidPartType(String bidPartType) {
		this.bidPartType = bidPartType;
	}

	public String getBidPartDescription() {
		return bidPartDescription;
	}

	public void setBidPartDescription(String bidPartDescription) {
		this.bidPartDescription = bidPartDescription;
	}

	public Date getCreateTimeStamp() {
		return createTimeStamp;
	}

	public void setCreateTimeStamp(Date createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public Date getUpdateTimeStamp() {
		return updateTimeStamp;
	}

	public void setUpdateTimeStamp(Date updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}

	@Override
	public String toString() {
		return "DIMBidPart [bidPartType=" + bidPartType + ", bidPartDescription=" + bidPartDescription
				+ ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	

}
