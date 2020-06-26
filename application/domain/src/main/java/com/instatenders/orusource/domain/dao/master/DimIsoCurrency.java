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
@Table(name="dim_iso_currency")
public class DimIsoCurrency {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="iso_currency_code")
	private String isoCurrencyCode;
	
	@Column(name="iso_currency_desc")
	private String isoCurrencyDesc;
	
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}

	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}

	public String getIsoCurrencyDesc() {
		return isoCurrencyDesc;
	}

	public void setIsoCurrencyDesc(String isoCurrencyDesc) {
		this.isoCurrencyDesc = isoCurrencyDesc;
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
		return "DIMISOCurrency [isoCurrencyCode=" + isoCurrencyCode + ", isoCurrencyDesc=" + isoCurrencyDesc
				+ ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
