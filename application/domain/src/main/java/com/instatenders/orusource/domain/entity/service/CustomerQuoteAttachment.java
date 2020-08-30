package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.instatenders.orusource.domain.entity.configuration.DimAttachmentType;

@Entity
@Table
public class CustomerQuoteAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private String customerQuoteAttachmentId;

	@Column
	private String attachmentNotes;

	@Column
	private String attachmentType;

	@Column
	private String attachmentUrl;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_QUOTE_HEADER_ID", insertable = false, updatable = false)
	private CustomerQuoteHeader customerQuoteHeader;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATTACHMENT_TYPE", insertable = false, updatable = false)
	private DimAttachmentType dimAttachmentType;

	public String getCustomerQuoteAttachmentId() {
		return this.customerQuoteAttachmentId;
	}

	public void setCustomerQuoteAttachmentId(String customerQuoteAttachmentId) {
		this.customerQuoteAttachmentId = customerQuoteAttachmentId;
	}

	public String getAttachmentNotes() {
		return this.attachmentNotes;
	}

	public void setAttachmentNotes(String attachmentNotes) {
		this.attachmentNotes = attachmentNotes;
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

	public CustomerQuoteHeader getCustomerQuoteHeader() {
		return this.customerQuoteHeader;
	}

	public void setCustomerQuoteHeader(CustomerQuoteHeader customerQuoteHeader) {
		this.customerQuoteHeader = customerQuoteHeader;
	}

	public DimAttachmentType getDimAttachmentType() {
		return dimAttachmentType;
	}

	public void setDimAttachmentType(DimAttachmentType dimAttachmentType) {
		this.dimAttachmentType = dimAttachmentType;
	}
}
