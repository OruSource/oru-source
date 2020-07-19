package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the dim_address_type database table.
 * 
 */
@Entity
@Table(name="dim_address_type")
public class DimAddressType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="address_type")
	private String addressType;

	@Column(name="address_description")
	private String addressDescription;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="default_flag")
	private String defaultFlag;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimAddressType() {
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressDescription() {
		return this.addressDescription;
	}

	public void setAddressDescription(String addressDescription) {
		this.addressDescription = addressDescription;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getDefaultFlag() {
		return this.defaultFlag;
	}

	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}