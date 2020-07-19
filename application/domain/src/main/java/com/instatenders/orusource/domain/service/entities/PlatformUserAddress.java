package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the platform_user_address database table.
 * 
 */
@Entity
@Table(name="platform_user_address")
public class PlatformUserAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="address_id")
	private int addressId;

	@Column(name="address_line_1")
	private String addressLine1;

	@Column(name="address_line_2")
	private String addressLine2;

	@Column(name="address_type")
	private String addressType;

	private String city;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="iso_country_code")
	private String isoCountryCode;

	@Column(name="postal_code")
	private String postalCode;

	private String state;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader;

	//bi-directional many-to-one association to PurchaseRequestHeader
	@OneToMany(mappedBy="platformUserAddress")
	private List<PurchaseRequestHeader> purchaseRequestHeaders;

	public PlatformUserAddress() {
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getIsoCountryCode() {
		return this.isoCountryCode;
	}

	public void setIsoCountryCode(String isoCountryCode) {
		this.isoCountryCode = isoCountryCode;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

	public List<PurchaseRequestHeader> getPurchaseRequestHeaders() {
		return this.purchaseRequestHeaders;
	}

	public void setPurchaseRequestHeaders(List<PurchaseRequestHeader> purchaseRequestHeaders) {
		this.purchaseRequestHeaders = purchaseRequestHeaders;
	}

	public PurchaseRequestHeader addPurchaseRequestHeader(PurchaseRequestHeader purchaseRequestHeader) {
		getPurchaseRequestHeaders().add(purchaseRequestHeader);
		purchaseRequestHeader.setPlatformUserAddress(this);

		return purchaseRequestHeader;
	}

	public PurchaseRequestHeader removePurchaseRequestHeader(PurchaseRequestHeader purchaseRequestHeader) {
		getPurchaseRequestHeaders().remove(purchaseRequestHeader);
		purchaseRequestHeader.setPlatformUserAddress(null);

		return purchaseRequestHeader;
	}

}