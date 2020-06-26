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
@Table(name="dim_attachment_type")
public class DimAttachmentType {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="attachment_type")
	private String attachmentType;
	
	@Column(name="attachment_name")
	private String attachmentName;
	
	@Column(name="attachment_description")
	private String attachmentDesc;
	
	@Column(name="allowed_file_type")
	private String allowedFileType;
	
	@Column(name="allowed_file_size")
	private String allowedFileSize;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getAttachmentType() {
		return attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getAttachmentDesc() {
		return attachmentDesc;
	}

	public void setAttachmentDesc(String attachmentDesc) {
		this.attachmentDesc = attachmentDesc;
	}

	public String getAllowedFileType() {
		return allowedFileType;
	}

	public void setAllowedFileType(String allowedFileType) {
		this.allowedFileType = allowedFileType;
	}

	public String getAllowedFileSize() {
		return allowedFileSize;
	}

	public void setAllowedFileSize(String allowedFileSize) {
		this.allowedFileSize = allowedFileSize;
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
		return "DIMAttachementType [attachmentType=" + attachmentType + ", attachmentName=" + attachmentName
				+ ", attachmentDesc=" + attachmentDesc + ", allowedFileType=" + allowedFileType + ", allowedFileSize="
				+ allowedFileSize + ", createTimeStamp=" + createTimeStamp + ", updateTimeStamp=" + updateTimeStamp
				+ "]";
	}
	
	
	
}
