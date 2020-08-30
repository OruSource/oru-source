package com.instatenders.orusource.domain.entity.configuration;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class DimApprovalFlow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private String approvalFlowName;

	@Column
	private String approvalFlowDescription;

	@Column
	private String defaultFlag;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

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

	public String getDefaultFlag() {
		return this.defaultFlag;
	}

	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
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
}
