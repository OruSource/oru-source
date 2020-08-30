package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the rfq_term_map database table.
 * 
 */
@Entity
@Table(name="rfq_term_map")
public class RfqTermMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RfqTermMapPK id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="rfq_term_value")
	private String rfqTermValue;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to RequestForQuoteHeader
	@ManyToOne
	private RequestForQuoteHeader requestForQuoteHeader;

	public RfqTermMap() {
	}

	public RfqTermMapPK getId() {
		return this.id;
	}

	public void setId(RfqTermMapPK id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getRfqTermValue() {
		return this.rfqTermValue;
	}

	public void setRfqTermValue(String rfqTermValue) {
		this.rfqTermValue = rfqTermValue;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public RequestForQuoteHeader getRequestForQuoteHeader() {
		return this.requestForQuoteHeader;
	}

	public void setRequestForQuoteHeader(RequestForQuoteHeader requestForQuoteHeader) {
		this.requestForQuoteHeader = requestForQuoteHeader;
	}

}