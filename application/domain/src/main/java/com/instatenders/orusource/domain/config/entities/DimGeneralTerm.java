package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the dim_general_terms database table.
 * 
 */
@Entity
@Table(name="dim_general_terms")
public class DimGeneralTerm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="term_code")
	private String termCode;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="term_description")
	private String termDescription;

	@Column(name="term_name")
	private String termName;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	public DimGeneralTerm() {
	}

	public String getTermCode() {
		return this.termCode;
	}

	public void setTermCode(String termCode) {
		this.termCode = termCode;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getTermDescription() {
		return this.termDescription;
	}

	public void setTermDescription(String termDescription) {
		this.termDescription = termDescription;
	}

	public String getTermName() {
		return this.termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}