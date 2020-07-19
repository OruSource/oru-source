package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_purchase_requisitition_type database table.
 * 
 */
@Entity
@Table(name="dim_purchase_requisitition_type")
public class DimPurchaseRequisititionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="requisitition_type_code")
	private String requisititionTypeCode;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="requisitition_description")
	private String requisititionDescription;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimPurchaseRequisititionType() {
	}

	public String getRequisititionTypeCode() {
		return this.requisititionTypeCode;
	}

	public void setRequisititionTypeCode(String requisititionTypeCode) {
		this.requisititionTypeCode = requisititionTypeCode;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getRequisititionDescription() {
		return this.requisititionDescription;
	}

	public void setRequisititionDescription(String requisititionDescription) {
		this.requisititionDescription = requisititionDescription;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}