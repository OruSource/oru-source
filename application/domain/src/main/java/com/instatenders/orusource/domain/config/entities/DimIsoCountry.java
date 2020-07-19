package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_iso_country database table.
 * 
 */
@Entity
@Table(name="dim_iso_country")
public class DimIsoCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="iso_country_code")
	private String isoCountryCode;

	@Column(name="country_name")
	private String countryName;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="iso_alpha3_code")
	private String isoAlpha3Code;

	@Column(name="iso_numeric_code")
	private String isoNumericCode;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimIsoCountry() {
	}

	public String getIsoCountryCode() {
		return this.isoCountryCode;
	}

	public void setIsoCountryCode(String isoCountryCode) {
		this.isoCountryCode = isoCountryCode;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getIsoAlpha3Code() {
		return this.isoAlpha3Code;
	}

	public void setIsoAlpha3Code(String isoAlpha3Code) {
		this.isoAlpha3Code = isoAlpha3Code;
	}

	public String getIsoNumericCode() {
		return this.isoNumericCode;
	}

	public void setIsoNumericCode(String isoNumericCode) {
		this.isoNumericCode = isoNumericCode;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}