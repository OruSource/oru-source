package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_attachment_type database table.
 * 
 */
@Entity
@Table(name="dim_attachment_type")
public class DimAttachmentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="attachment_type")
	private String attachmentType;

	@Column(name="allowed_file_size")
	private String allowedFileSize;

	@Column(name="allowed_file_type")
	private String allowedFileType;

	@Column(name="attachment_description")
	private String attachmentDescription;

	@Column(name="attachment_name")
	private String attachmentName;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimAttachmentType() {
	}

	public String getAttachmentType() {
		return this.attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getAllowedFileSize() {
		return this.allowedFileSize;
	}

	public void setAllowedFileSize(String allowedFileSize) {
		this.allowedFileSize = allowedFileSize;
	}

	public String getAllowedFileType() {
		return this.allowedFileType;
	}

	public void setAllowedFileType(String allowedFileType) {
		this.allowedFileType = allowedFileType;
	}

	public String getAttachmentDescription() {
		return this.attachmentDescription;
	}

	public void setAttachmentDescription(String attachmentDescription) {
		this.attachmentDescription = attachmentDescription;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
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