package com.instatenders.orusource.domain.dao.purchaserequest;

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
@Table(name="purchase_request_attachment")
//this table has FK constraint
public class PurchaseRequestAttachment {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="purchase_request_attachment_id")
	private String PRAttachmentID;
	
	@Column(name="purchase_request_id")
	private String PRId;
	
	@Column(name="attachment_type")
	private String attachmentType;

	@Column(name="attachment_url")
	private String attachmentUrl;
	
	@Column(name="attachment_notes")
	private String attachmentNotes;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getPRAttachmentID() {
		return PRAttachmentID;
	}

	public void setPRAttachmentID(String pRAttachmentID) {
		PRAttachmentID = pRAttachmentID;
	}

	public String getPRId() {
		return PRId;
	}

	public void setPRId(String pRId) {
		PRId = pRId;
	}

	public String getAttachmentType() {
		return attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getAttachmentUrl() {
		return attachmentUrl;
	}

	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

	public String getAttachmentNotes() {
		return attachmentNotes;
	}

	public void setAttachmentNotes(String attachmentNotes) {
		this.attachmentNotes = attachmentNotes;
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
		return "PRAttachment [PRAttachmentID=" + PRAttachmentID + ", PRId=" + PRId + ", attachmentType="
				+ attachmentType + ", attachmentUrl=" + attachmentUrl + ", attachmentNotes=" + attachmentNotes
				+ ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
