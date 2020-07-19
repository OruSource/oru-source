package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the dim_supplier_sector database table.
 * 
 */
@Entity
@Table(name="dim_supplier_sector")
public class DimSupplierSector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="supplier_sector_name")
	private String supplierSectorName;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="supplier_sector_description")
	private String supplierSectorDescription;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to DimSupplierIndustry
	@OneToMany(mappedBy="dimSupplierSector")
	private List<DimSupplierIndustry> dimSupplierIndustries;

	public DimSupplierSector() {
	}

	public String getSupplierSectorName() {
		return this.supplierSectorName;
	}

	public void setSupplierSectorName(String supplierSectorName) {
		this.supplierSectorName = supplierSectorName;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getSupplierSectorDescription() {
		return this.supplierSectorDescription;
	}

	public void setSupplierSectorDescription(String supplierSectorDescription) {
		this.supplierSectorDescription = supplierSectorDescription;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<DimSupplierIndustry> getDimSupplierIndustries() {
		return this.dimSupplierIndustries;
	}

	public void setDimSupplierIndustries(List<DimSupplierIndustry> dimSupplierIndustries) {
		this.dimSupplierIndustries = dimSupplierIndustries;
	}

	public DimSupplierIndustry addDimSupplierIndustry(DimSupplierIndustry dimSupplierIndustry) {
		getDimSupplierIndustries().add(dimSupplierIndustry);
		dimSupplierIndustry.setDimSupplierSector(this);

		return dimSupplierIndustry;
	}

	public DimSupplierIndustry removeDimSupplierIndustry(DimSupplierIndustry dimSupplierIndustry) {
		getDimSupplierIndustries().remove(dimSupplierIndustry);
		dimSupplierIndustry.setDimSupplierSector(null);

		return dimSupplierIndustry;
	}

}