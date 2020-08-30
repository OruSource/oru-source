package com.instatenders.orusource.domain.entity.configuration;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class DimSupplierIndustry implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DimSupplierIndustryPK id;

	@Column
	private String supplierIndustryDescription;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "SUPPLIER_SECTOR_NAME", insertable = false, updatable = false)
	private DimSupplierSector dimSupplierSector;

	public DimSupplierIndustryPK getId() {
		return this.id;
	}

	public void setId(DimSupplierIndustryPK id) {
		this.id = id;
	}

	public String getSupplierIndustryDescription() {
		return this.supplierIndustryDescription;
	}

	public void setSupplierIndustryDescription(String supplierIndustryDescription) {
		this.supplierIndustryDescription = supplierIndustryDescription;
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

	public DimSupplierSector getDimSupplierSector() {
		return this.dimSupplierSector;
	}

	public void setDimSupplierSector(DimSupplierSector dimSupplierSector) {
		this.dimSupplierSector = dimSupplierSector;
	}
}
