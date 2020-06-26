package com.instatenders.orusource.domain.dao.purchaserequest;

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
@Table(name="purchase_request_header")
//this table has FK constraint
public class PurchaseRequestHeader {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="purchase_request_id")
	private String PRID;
	
	@Column(name="purchase_request_owner_id")
	private String PROwnerId;
	
	@Column(name="purchase_request_create_date")
	private Date PRCreateDate;

	@Column(name="delivery_date")
	private Date PRDeliveryDate;
	
	@Column(name="delivery_address_id")
	private String PRDeliveryAddressId;

	@Column(name="purchase_currency")
	private String purchaseCurrency;
	
	@Column(name="purchase_request_total_value")
	private BigDecimal PRTotalValue;
	
	@Column(name="purchase_request_status")
	private String PRstatus;
	
	@Column(name="approval_type")
	private String approvalType;

	@Column(name="onbehalf_of")
	private String onBehalfOf;
	
	@Column(name="last_updated_by")
	private Date lastUpdatedBy;

	@Column(name="attachment_available")
	private Boolean attachmentAvailable;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getPRID() {
		return PRID;
	}

	public void setPRID(String pRID) {
		PRID = pRID;
	}

	public String getPROwnerId() {
		return PROwnerId;
	}

	public void setPROwnerId(String pROwnerId) {
		PROwnerId = pROwnerId;
	}

	public Date getPRCreateDate() {
		return PRCreateDate;
	}

	public void setPRCreateDate(Date pRCreateDate) {
		PRCreateDate = pRCreateDate;
	}

	public Date getPRDeliveryDate() {
		return PRDeliveryDate;
	}

	public void setPRDeliveryDate(Date pRDeliveryDate) {
		PRDeliveryDate = pRDeliveryDate;
	}

	public String getPRDeliveryAddressId() {
		return PRDeliveryAddressId;
	}

	public void setPRDeliveryAddressId(String pRDeliveryAddressId) {
		PRDeliveryAddressId = pRDeliveryAddressId;
	}

	public String getPurchaseCurrency() {
		return purchaseCurrency;
	}

	public void setPurchaseCurrency(String purchaseCurrency) {
		this.purchaseCurrency = purchaseCurrency;
	}

	public BigDecimal getPRTotalValue() {
		return PRTotalValue;
	}

	public void setPRTotalValue(BigDecimal pRTotalValue) {
		PRTotalValue = pRTotalValue;
	}

	public String getPRstatus() {
		return PRstatus;
	}

	public void setPRstatus(String pRstatus) {
		PRstatus = pRstatus;
	}

	public String getApprovalType() {
		return approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
	}

	public String getOnBehalfOf() {
		return onBehalfOf;
	}

	public void setOnBehalfOf(String onBehalfOf) {
		this.onBehalfOf = onBehalfOf;
	}

	public Date getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Date lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Boolean getAttachmentAvailable() {
		return attachmentAvailable;
	}

	public void setAttachmentAvailable(Boolean attachmentAvailable) {
		this.attachmentAvailable = attachmentAvailable;
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
		return "PRHeader [PRID=" + PRID + ", PROwnerId=" + PROwnerId + ", PRCreateDate=" + PRCreateDate
				+ ", PRDeliveryDate=" + PRDeliveryDate + ", PRDeliveryAddressId=" + PRDeliveryAddressId
				+ ", purchaseCurrency=" + purchaseCurrency + ", PRTotalValue=" + PRTotalValue + ", PRstatus=" + PRstatus
				+ ", approvalType=" + approvalType + ", onBehalfOf=" + onBehalfOf + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", attachmentAvailable=" + attachmentAvailable + ", createTimeStamp=" + createTimeStamp
				+ ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
