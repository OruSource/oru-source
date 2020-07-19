package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_approval_type database table.
 * 
 */
@Entity
@Table(name="dim_approval_type")
public class DimApprovalType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="approval_type")
	private String approvalType;

	@Column(name="approval_type_description")
	private String approvalTypeDescription;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimApprovalType() {
	}

	public String getApprovalType() {
		return this.approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
	}

	public String getApprovalTypeDescription() {
		return this.approvalTypeDescription;
	}

	public void setApprovalTypeDescription(String approvalTypeDescription) {
		this.approvalTypeDescription = approvalTypeDescription;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}