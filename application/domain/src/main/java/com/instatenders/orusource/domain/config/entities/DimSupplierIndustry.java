package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_supplier_industry database table.
 * 
 */
@Entity
@Table(name="dim_supplier_industry")
public class DimSupplierIndustry implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DimSupplierIndustryPK id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="supplier_industry_description")
	private String supplierIndustryDescription;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to DimSupplierSector
	@ManyToOne(fetch= FetchType.LAZY,optional=false)
	private DimSupplierSector dimSupplierSector;

	public DimSupplierIndustry() {
	}

	public DimSupplierIndustryPK getId() {
		return this.id;
	}

	public void setId(DimSupplierIndustryPK id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getSupplierIndustryDescription() {
		return this.supplierIndustryDescription;
	}

	public void setSupplierIndustryDescription(String supplierIndustryDescription) {
		this.supplierIndustryDescription = supplierIndustryDescription;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public DimSupplierSector getDimSupplierSector() {
		return this.dimSupplierSector;
	}

	public void setDimSupplierSector(DimSupplierSector dimSupplierSector) {
		this.dimSupplierSector = dimSupplierSector;
	}

}