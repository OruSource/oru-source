package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_platform_department database table.
 * 
 */
@Entity
@Table(name="dim_platform_department")
public class DimPlatformDepartment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="department_code")
	private String departmentCode;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="department_description")
	private String departmentDescription;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimPlatformDepartment() {
	}

	public String getDepartmentCode() {
		return this.departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getDepartmentDescription() {
		return this.departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}