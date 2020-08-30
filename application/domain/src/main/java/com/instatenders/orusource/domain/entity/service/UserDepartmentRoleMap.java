package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the user_department_role_map database table.
 * 
 */
@Entity
@Table(name="user_department_role_map")
public class UserDepartmentRoleMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="platform_user_id")
	private int platformUserId;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="department_code")
	private String departmentCode;

	@Column(name="self_approval_limit")
	private BigDecimal selfApprovalLimit;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	@Column(name="user_role_name")
	private String userRoleName;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader1;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader2;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader3;

	//bi-directional one-to-one association to PlatformUserHeader
	@OneToOne
	private PlatformUserHeader platformUserHeader4;

	//bi-directional many-to-one association to SupplierDetail
	@ManyToOne
	private SupplierDetail supplierDetail;

	public UserDepartmentRoleMap() {
	}

	public int getPlatformUserId() {
		return this.platformUserId;
	}

	public void setPlatformUserId(int platformUserId) {
		this.platformUserId = platformUserId;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getDepartmentCode() {
		return this.departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public BigDecimal getSelfApprovalLimit() {
		return this.selfApprovalLimit;
	}

	public void setSelfApprovalLimit(BigDecimal selfApprovalLimit) {
		this.selfApprovalLimit = selfApprovalLimit;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getUserRoleName() {
		return this.userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public PlatformUserHeader getPlatformUserHeader1() {
		return this.platformUserHeader1;
	}

	public void setPlatformUserHeader1(PlatformUserHeader platformUserHeader1) {
		this.platformUserHeader1 = platformUserHeader1;
	}

	public PlatformUserHeader getPlatformUserHeader2() {
		return this.platformUserHeader2;
	}

	public void setPlatformUserHeader2(PlatformUserHeader platformUserHeader2) {
		this.platformUserHeader2 = platformUserHeader2;
	}

	public PlatformUserHeader getPlatformUserHeader3() {
		return this.platformUserHeader3;
	}

	public void setPlatformUserHeader3(PlatformUserHeader platformUserHeader3) {
		this.platformUserHeader3 = platformUserHeader3;
	}

	public PlatformUserHeader getPlatformUserHeader4() {
		return this.platformUserHeader4;
	}

	public void setPlatformUserHeader4(PlatformUserHeader platformUserHeader4) {
		this.platformUserHeader4 = platformUserHeader4;
	}

	public SupplierDetail getSupplierDetail() {
		return this.supplierDetail;
	}

	public void setSupplierDetail(SupplierDetail supplierDetail) {
		this.supplierDetail = supplierDetail;
	}

}