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
@Table(name="dim_iso_country")
public class DimIsoCountry {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="iso_country_code")
	private String isoCountryCode;
	
	@Column(name="country_name")
	private String countryName;
	
	
	@Column(name="iso_numeric_code")
	private String isoNumericCode;
	
	@Column(name="iso_alpha3_code")
	
	private String isoAplha3Code;
	
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getIsoCountryCode() {
		return isoCountryCode;
	}

	public void setIsoCountryCode(String isoCountryCode) {
		this.isoCountryCode = isoCountryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getIsoNumericCode() {
		return isoNumericCode;
	}

	public void setIsoNumericCode(String isoNumericCode) {
		this.isoNumericCode = isoNumericCode;
	}

	public String getIsoAplha3Code() {
		return isoAplha3Code;
	}

	public void setIsoAplha3Code(String isoAplha3Code) {
		this.isoAplha3Code = isoAplha3Code;
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
		return "DIMISOCountry [isoCountryCode=" + isoCountryCode + ", countryName=" + countryName + ", isoNumericCode="
				+ isoNumericCode + ", isoAplha3Code=" + isoAplha3Code + ", createTimeStamp=" + createTimeStamp
				+ ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
