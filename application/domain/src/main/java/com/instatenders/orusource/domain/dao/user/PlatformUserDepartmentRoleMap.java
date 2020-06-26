package com.instatenders.orusource.domain.dao.user;

import java.math.BigDecimal;
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
@Table(name="user_department_role_map")
//this table has FK constraint
public class PlatformUserDepartmentRoleMap {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="platform_user_id")
	private String userId;
	
	@Column(name="department_code")
	private String departmentCode;

	@Column(name="user_role_name")
	private String userRoleName;
	
	@Column(name="approver_id")
	private String approverId;

	@Column(name="supplier_code")
	private String supplierCode;
	
	@Column(name="created_by")
	private String createdBy;

	@Column(name="updated_by")
	private String updatedBy;
	
	@Column(name="self_approval_limit")
	private BigDecimal selfApprovalLimit;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public String getApproverId() {
		return approverId;
	}

	public void setApproverId(String approverId) {
		this.approverId = approverId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public BigDecimal getSelfApprovalLimit() {
		return selfApprovalLimit;
	}

	public void setSelfApprovalLimit(BigDecimal selfApprovalLimit) {
		this.selfApprovalLimit = selfApprovalLimit;
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
		return "UserDepartmentRoleMap [userId=" + userId + ", departmentCode=" + departmentCode + ", userRoleName="
				+ userRoleName + ", approverId=" + approverId + ", supplierCode=" + supplierCode + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", selfApprovalLimit=" + selfApprovalLimit
				+ ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
