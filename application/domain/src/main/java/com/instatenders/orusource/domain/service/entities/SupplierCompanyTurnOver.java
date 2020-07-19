package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the supplier_company_turn_over database table.
 * 
 */
@Entity
@Table(name="supplier_company_turn_over")
public class SupplierCompanyTurnOver implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="company_turn_over_id")
	private int companyTurnOverId;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="financial_year")
	private String financialYear;

	@Column(name="iso_currency_code")
	private String isoCurrencyCode;

	@Column(name="turn_over_in_lakhs")
	private BigDecimal turnOverInLakhs;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to SupplierDetail
	@ManyToOne
	private SupplierDetail supplierDetail;

	public SupplierCompanyTurnOver() {
	}

	public int getCompanyTurnOverId() {
		return this.companyTurnOverId;
	}

	public void setCompanyTurnOverId(int companyTurnOverId) {
		this.companyTurnOverId = companyTurnOverId;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getFinancialYear() {
		return this.financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}

	public String getIsoCurrencyCode() {
		return this.isoCurrencyCode;
	}

	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}

	public BigDecimal getTurnOverInLakhs() {
		return this.turnOverInLakhs;
	}

	public void setTurnOverInLakhs(BigDecimal turnOverInLakhs) {
		this.turnOverInLakhs = turnOverInLakhs;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public SupplierDetail getSupplierDetail() {
		return this.supplierDetail;
	}

	public void setSupplierDetail(SupplierDetail supplierDetail) {
		this.supplierDetail = supplierDetail;
	}

}