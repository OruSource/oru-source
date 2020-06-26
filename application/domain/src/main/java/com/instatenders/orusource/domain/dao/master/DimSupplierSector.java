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
@Table(name="dim_supplier_sector")
public class DimSupplierSector {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="supplier_sector_name")
	private String supplierSectorName;
	
	@Column(name="supplier_sector_description")
	private String supplierSectorDescription;

	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getSupplierSectorName() {
		return supplierSectorName;
	}

	public void setSupplierSectorName(String supplierSectorName) {
		this.supplierSectorName = supplierSectorName;
	}

	public String getSupplierSectorDescription() {
		return supplierSectorDescription;
	}

	public void setSupplierSectorDescription(String supplierSectorDescription) {
		this.supplierSectorDescription = supplierSectorDescription;
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
		return "DIMSupplierSector [supplierSectorName=" + supplierSectorName + ", supplierSectorDescription="
				+ supplierSectorDescription + ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp="
				+ updateTimeStamp + "]";
	}
	
	
}
