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
@Table(name="dim_purchase_requisitition_type")
public class DimPurchaseRequestType {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="requisitition_type_code")
	private String requisititionTypeCode;
	
	@Column(name="requisitition_description")
	private String requisitionDesc;
	
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getRequisititionTypeCode() {
		return requisititionTypeCode;
	}

	public void setRequisititionTypeCode(String requisititionTypeCode) {
		this.requisititionTypeCode = requisititionTypeCode;
	}

	public String getRequisitionDesc() {
		return requisitionDesc;
	}

	public void setRequisitionDesc(String requisitionDesc) {
		this.requisitionDesc = requisitionDesc;
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
		return "DIMPRType [requisititionTypeCode=" + requisititionTypeCode + ", requisitionDesc=" + requisitionDesc
				+ ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
