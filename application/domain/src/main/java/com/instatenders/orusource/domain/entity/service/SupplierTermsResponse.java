package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the supplier_terms_response database table.
 * 
 */
@Entity
@Table(name="supplier_terms_response")
public class SupplierTermsResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SupplierTermsResponsePK id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="term_value")
	private String termValue;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to SupplierQuoteHeader
	@ManyToOne
	private SupplierQuoteHeader supplierQuoteHeader;

	public SupplierTermsResponse() {
	}

	public SupplierTermsResponsePK getId() {
		return this.id;
	}

	public void setId(SupplierTermsResponsePK id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getTermValue() {
		return this.termValue;
	}

	public void setTermValue(String termValue) {
		this.termValue = termValue;
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