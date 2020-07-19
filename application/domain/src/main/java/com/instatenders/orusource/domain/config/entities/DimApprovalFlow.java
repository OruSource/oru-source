package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_approval_flow database table.
 * 
 */
@Entity
@Table(name="dim_approval_flow")
public class DimApprovalFlow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="approval_flow_name")
	private String approvalFlowName;

	@Column(name="approval_flow_description")
	private String approvalFlowDescription;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="default_flag")
	private String defaultFlag;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimApprovalFlow() {
	}

	public String getApprovalFlowName() {
		return this.approvalFlowName;
	}

	public void setApprovalFlowName(String approvalFlowName) {
		this.approvalFlowName = approvalFlowName;
	}

	public String getApprovalFlowDescription() {
		return this.approvalFlowDescription;
	}

	public void setApprovalFlowDescription(String approvalFlowDescription) {
		this.approvalFlowDescription = approvalFlowDescription;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getDefaultFlag() {
		return this.defaultFlag;
	}

	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}