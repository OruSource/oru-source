package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the supplier_customer_ref_contact database table.
 * 
 */
@Entity
@Table(name="supplier_customer_ref_contact")
public class SupplierCustomerRefContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="supplier_customer_ref_contact_id")
	private int supplierCustomerRefContactId;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="email_address")
	private String emailAddress;

	@Column(name="first_name")
	private String firstName;

	@Column(name="landline_number")
	private String landlineNumber;

	@Column(name="landline_std_code")
	private String landlineStdCode;

	@Column(name="last_name")
	private String lastName;

	@Column(name="mobile_number")
	private String mobileNumber;

	private String salutation;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to SupplierDetail
	@OneToMany(mappedBy="supplierCustomerRefContact")
	private List<SupplierDetail> supplierDetails;

	public SupplierCustomerRefContact() {
	}

	public int getSupplierCustomerRefContactId() {
		return this.supplierCustomerRefContactId;
	}

	public void setSupplierCustomerRefContactId(int supplierCustomerRefContactId) {
		this.supplierCustomerRefContactId = supplierCustomerRefContactId;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLandlineNumber() {
		return this.landlineNumber;
	}

	public void setLandlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
	}

	public String getLandlineStdCode() {
		return this.landlineStdCode;
	}

	public void setLandlineStdCode(String landlineStdCode) {
		this.landlineStdCode = landlineStdCode;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<SupplierDetail> getSupplierDetails() {
		return this.supplierDetails;
	}

	public void setSupplierDetails(List<SupplierDetail> supplierDetails) {
		this.supplierDetails = supplierDetails;
	}

	public SupplierDetail addSupplierDetail(SupplierDetail supplierDetail) {
		getSupplierDetails().add(supplierDetail);
		supplierDetail.setSupplierCustomerRefContact(this);

		return supplierDetail;
	}

	public SupplierDetail removeSupplierDetail(SupplierDetail supplierDetail) {
		getSupplierDetails().remove(supplierDetail);
		supplierDetail.setSupplierCustomerRefContact(null);

		return supplierDetail;
	}

}