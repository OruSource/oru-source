package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the supplier_quote_attachment database table.
 * 
 */
@Entity
@Table(name="supplier_quote_attachment")
public class SupplierQuoteAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="supplier_quote_attachment_id")
	private String supplierQuoteAttachmentId;

	@Column(name="attachment_notes")
	private String attachmentNotes;

	@Column(name="attachment_type")
	private String attachmentType;

	@Column(name="attachment_url")
	private String attachmentUrl;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to SupplierQuoteHeader
	@ManyToOne
	private SupplierQuoteHeader supplierQuoteHeader;

	public SupplierQuoteAttachment() {
	}

	public String getSupplierQuoteAttachmentId() {
		return this.supplierQuoteAttachmentId;
	}

	public void setSupplierQuoteAttachmentId(String supplierQuoteAttachmentId) {
		this.supplierQuoteAttachmentId = supplierQuoteAttachmentId;
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

	public SupplierQuoteHeader getSupplierQuoteHeader() {
		return this.supplierQuoteHeader;
	}

	public void setSupplierQuoteHeader(SupplierQuoteHeader supplierQuoteHeader) {
		this.supplierQuoteHeader = supplierQuoteHeader;
	}

}