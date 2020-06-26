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
@Table(name="dim_supplier_industry")
//This entity has Foreign key constraint for supplier sector name from dim supplier sector.
//Composite primary key supplierIndustryName and supplierSectorName
public class DimSupplierIndustry {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="supplier_industry_name")
	private String supplierIndustryName;
	
	@Column(name="supplier_industry_description")
	private String supplierIndustryDescription;

	@Id
	@Column(name="supplier_sector_name")
	private String supplierSectorName;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getSupplierIndustryName() {
		return supplierIndustryName;
	}

	public void setSupplierIndustryName(String supplierIndustryName) {
		this.supplierIndustryName = supplierIndustryName;
	}

	public String getSupplierIndustryDescription() {
		return supplierIndustryDescription;
	}

	public void setSupplierIndustryDescription(String supplierIndustryDescription) {
		this.supplierIndustryDescription = supplierIndustryDescription;
	}

	public String getSupplierSectorName() {
		return supplierSectorName;
	}

	public void setSupplierSectorName(String supplierSectorName) {
		this.supplierSectorName = supplierSectorName;
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
		return "DIMSupplierIndustry [supplierIndustryName=" + supplierIndustryName + ", supplierIndustryDescription="
				+ supplierIndustryDescription + ", supplierSectorName=" + supplierSectorName + ", createTimeStamp="
				+ createTimeStamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
