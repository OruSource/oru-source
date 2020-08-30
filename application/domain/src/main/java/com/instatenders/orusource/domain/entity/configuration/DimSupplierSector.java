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
public class DimSupplierSector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private String supplierSectorName;

	@Column
	private String supplierSectorDescription;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

	public String getSupplierSectorName() {
		return this.supplierSectorName;
	}

	public void setSupplierSectorName(String supplierSectorName) {
		this.supplierSectorName = supplierSectorName;
	}

	public String getSupplierSectorDescription() {
		return this.supplierSectorDescription;
	}

	public void setSupplierSectorDescription(String supplierSectorDescription) {
		this.supplierSectorDescription = supplierSectorDescription;
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
