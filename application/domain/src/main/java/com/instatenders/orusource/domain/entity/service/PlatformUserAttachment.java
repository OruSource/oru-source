package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;




/**
 * The persistent class for the platform_user_attachment database table.
 * 
 */
@Entity
@Table(name="platform_user_attachment")
public class PlatformUserAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="platform_user_id")
	private int platformUserId;

	@Column(name="attachment_type")
	private String attachmentType;

	@Column(name="attachment_url")
	private String attachmentUrl;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional one-to-one association to PlatformUserHeader
	@OneToOne
	private PlatformUserHeader platformUserHeader;

	public PlatformUserAttachment() {
	}

	public int getPlatformUserId() {
		return this.platformUserId;
	}

	public void setPlatformUserId(int platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getAttachmentType() {
		return this.attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getAttachmentUrl() {
		return this.attachmentUrl;
	}

	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
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

	public PlatformUserHeader getPlatformUserHeader() {
		return this.platformUserHeader;
	}

	public void setPlatformUserHeader(PlatformUserHeader platformUserHeader) {
		this.platformUserHeader = platformUserHeader;
	}

}