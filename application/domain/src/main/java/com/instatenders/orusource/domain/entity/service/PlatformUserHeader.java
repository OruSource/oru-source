package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the platform_user_header database table.
 * 
 */
@Entity
@Table(name="platform_user_header")
public class PlatformUserHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="platform_user_id")
	private int platformUserId;

	@Column(name="company_name")
	private String companyName;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="email_address")
	private String emailAddress;

	@Column(name="first_name")
	private String firstName;

	@Column(name="job_title")
	private String jobTitle;

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

	@Column(name="user_category")
	private String userCategory;

	//bi-directional many-to-one association to CustomerQuoteHeader
	@OneToMany(mappedBy="platformUserHeader1")
	private List<CustomerQuoteHeader> customerQuoteHeaders1;

	//bi-directional many-to-one association to CustomerQuoteHeader
	@OneToMany(mappedBy="platformUserHeader2")
	private List<CustomerQuoteHeader> customerQuoteHeaders2;

	//bi-directional many-to-one association to CustomerQuoteHeader
	@OneToMany(mappedBy="platformUserHeader3")
	private List<CustomerQuoteHeader> customerQuoteHeaders3;

	//bi-directional many-to-one association to PlatformUserAddress
	@OneToMany(mappedBy="platformUserHeader")
	private List<PlatformUserAddress> platformUserAddresses;

	//bi-directional one-to-one association to PlatformUserAttachment
	@OneToOne(mappedBy="platformUserHeader")
	private PlatformUserAttachment platformUserAttachment;

	//bi-directional many-to-one association to PlatformUserCredential
	@OneToMany(mappedBy="platformUserHeader1")
	private List<PlatformUserCredential> platformUserCredentials1;

	//bi-directional many-to-one association to PlatformUserCredential
	@OneToMany(mappedBy="platformUserHeader2")
	private List<PlatformUserCredential> platformUserCredentials2;

	//bi-directional one-to-one association to PlatformUserCredential
	@OneToOne(mappedBy="platformUserHeader3")
	private PlatformUserCredential platformUserCredential;

	//bi-directional many-to-one association to PurchaseOrderApproverMap
	@OneToMany(mappedBy="platformUserHeader")
	private List<PurchaseOrderApproverMap> purchaseOrderApproverMaps;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@OneToMany(mappedBy="platformUserHeader1")
	private List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps1;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@OneToMany(mappedBy="platformUserHeader2")
	private List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps2;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@OneToMany(mappedBy="platformUserHeader3")
	private List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps3;

	//bi-directional many-to-one association to PurchaseRequestApproverMap
	@OneToMany(mappedBy="platformUserHeader")
	private List<PurchaseRequestApproverMap> purchaseRequestApproverMaps;

	//bi-directional many-to-one association to PurchaseRequestHeader
	@OneToMany(mappedBy="platformUserHeader1")
	private List<PurchaseRequestHeader> purchaseRequestHeaders1;

	//bi-directional many-to-one association to PurchaseRequestHeader
	@OneToMany(mappedBy="platformUserHeader2")
	private List<PurchaseRequestHeader> purchaseRequestHeaders2;

	//bi-directional many-to-one association to PurchaseRequestHeader
	@OneToMany(mappedBy="platformUserHeader3")
	private List<PurchaseRequestHeader> purchaseRequestHeaders3;

	//bi-directional many-to-one association to PurchaseRequestHeader
	@OneToMany(mappedBy="platformUserHeader4")
	private List<PurchaseRequestHeader> purchaseRequestHeaders4;

	//bi-directional many-to-one association to RequestForQuoteHeader
	@OneToMany(mappedBy="platformUserHeader1")
	private List<RequestForQuoteHeader> requestForQuoteHeaders1;

	//bi-directional many-to-one association to RequestForQuoteHeader
	@OneToMany(mappedBy="platformUserHeader2")
	private List<RequestForQuoteHeader> requestForQuoteHeaders2;

	//bi-directional many-to-one association to RequestForQuoteHeader
	@OneToMany(mappedBy="platformUserHeader3")
	private List<RequestForQuoteHeader> requestForQuoteHeaders3;

	//bi-directional many-to-one association to RfqApproverMap
	@OneToMany(mappedBy="platformUserHeader")
	private List<RfqApproverMap> rfqApproverMaps;

	//bi-directional many-to-one association to SupplierQuoteApproverMap
	@OneToMany(mappedBy="platformUserHeader")
	private List<SupplierQuoteApproverMap> supplierQuoteApproverMaps;

	//bi-directional many-to-one association to SupplierQuoteHeader
	@OneToMany(mappedBy="platformUserHeader1")
	private List<SupplierQuoteHeader> supplierQuoteHeaders1;

	//bi-directional many-to-one association to SupplierQuoteHeader
	@OneToMany(mappedBy="platformUserHeader2")
	private List<SupplierQuoteHeader> supplierQuoteHeaders2;

	//bi-directional many-to-one association to SupplierQuoteHeader
	@OneToMany(mappedBy="platformUserHeader3")
	private List<SupplierQuoteHeader> supplierQuoteHeaders3;

	//bi-directional many-to-one association to UserDepartmentRoleMap
	@OneToMany(mappedBy="platformUserHeader1")
	private List<UserDepartmentRoleMap> userDepartmentRoleMaps1;

	//bi-directional many-to-one association to UserDepartmentRoleMap
	@OneToMany(mappedBy="platformUserHeader2")
	private List<UserDepartmentRoleMap> userDepartmentRoleMaps2;

	//bi-directional many-to-one association to UserDepartmentRoleMap
	@OneToMany(mappedBy="platformUserHeader3")
	private List<UserDepartmentRoleMap> userDepartmentRoleMaps3;

	//bi-directional one-to-one association to UserDepartmentRoleMap
	@OneToOne(mappedBy="platformUserHeader4")
	private UserDepartmentRoleMap userDepartmentRoleMap;

	public PlatformUserHeader() {
	}

	public int getPlatformUserId() {
		return this.platformUserId;
	}

	public void setPlatformUserId(int platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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

	public String getUserCategory() {
		return this.userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

	public List<CustomerQuoteHeader> getCustomerQuoteHeaders1() {
		return this.customerQuoteHeaders1;
	}

	public void setCustomerQuoteHeaders1(List<CustomerQuoteHeader> customerQuoteHeaders1) {
		this.customerQuoteHeaders1 = customerQuoteHeaders1;
	}

	public CustomerQuoteHeader addCustomerQuoteHeaders1(CustomerQuoteHeader customerQuoteHeaders1) {
		getCustomerQuoteHeaders1().add(customerQuoteHeaders1);
		customerQuoteHeaders1.setPlatformUserHeader1(this);

		return customerQuoteHeaders1;
	}

	public CustomerQuoteHeader removeCustomerQuoteHeaders1(CustomerQuoteHeader customerQuoteHeaders1) {
		getCustomerQuoteHeaders1().remove(customerQuoteHeaders1);
		customerQuoteHeaders1.setPlatformUserHeader1(null);

		return customerQuoteHeaders1;
	}

	public List<CustomerQuoteHeader> getCustomerQuoteHeaders2() {
		return this.customerQuoteHeaders2;
	}

	public void setCustomerQuoteHeaders2(List<CustomerQuoteHeader> customerQuoteHeaders2) {
		this.customerQuoteHeaders2 = customerQuoteHeaders2;
	}

	public CustomerQuoteHeader addCustomerQuoteHeaders2(CustomerQuoteHeader customerQuoteHeaders2) {
		getCustomerQuoteHeaders2().add(customerQuoteHeaders2);
		customerQuoteHeaders2.setPlatformUserHeader2(this);

		return customerQuoteHeaders2;
	}

	public CustomerQuoteHeader removeCustomerQuoteHeaders2(CustomerQuoteHeader customerQuoteHeaders2) {
		getCustomerQuoteHeaders2().remove(customerQuoteHeaders2);
		customerQuoteHeaders2.setPlatformUserHeader2(null);

		return customerQuoteHeaders2;
	}

	public List<CustomerQuoteHeader> getCustomerQuoteHeaders3() {
		return this.customerQuoteHeaders3;
	}

	public void setCustomerQuoteHeaders3(List<CustomerQuoteHeader> customerQuoteHeaders3) {
		this.customerQuoteHeaders3 = customerQuoteHeaders3;
	}

	public CustomerQuoteHeader addCustomerQuoteHeaders3(CustomerQuoteHeader customerQuoteHeaders3) {
		getCustomerQuoteHeaders3().add(customerQuoteHeaders3);
		customerQuoteHeaders3.setPlatformUserHeader3(this);

		return customerQuoteHeaders3;
	}

	public CustomerQuoteHeader removeCustomerQuoteHeaders3(CustomerQuoteHeader customerQuoteHeaders3) {
		getCustomerQuoteHeaders3().remove(customerQuoteHeaders3);
		customerQuoteHeaders3.setPlatformUserHeader3(null);

		return customerQuoteHeaders3;
	}

	public List<PlatformUserAddress> getPlatformUserAddresses() {
		return this.platformUserAddresses;
	}

	public void setPlatformUserAddresses(List<PlatformUserAddress> platformUserAddresses) {
		this.platformUserAddresses = platformUserAddresses;
	}

	public PlatformUserAddress addPlatformUserAddress(PlatformUserAddress platformUserAddress) {
		getPlatformUserAddresses().add(platformUserAddress);
		platformUserAddress.setPlatformUserHeader(this);

		return platformUserAddress;
	}

	public PlatformUserAddress removePlatformUserAddress(PlatformUserAddress platformUserAddress) {
		getPlatformUserAddresses().remove(platformUserAddress);
		platformUserAddress.setPlatformUserHeader(null);

		return platformUserAddress;
	}

	public PlatformUserAttachment getPlatformUserAttachment() {
		return this.platformUserAttachment;
	}

	public void setPlatformUserAttachment(PlatformUserAttachment platformUserAttachment) {
		this.platformUserAttachment = platformUserAttachment;
	}

	public List<PlatformUserCredential> getPlatformUserCredentials1() {
		return this.platformUserCredentials1;
	}

	public void setPlatformUserCredentials1(List<PlatformUserCredential> platformUserCredentials1) {
		this.platformUserCredentials1 = platformUserCredentials1;
	}

	public PlatformUserCredential addPlatformUserCredentials1(PlatformUserCredential platformUserCredentials1) {
		getPlatformUserCredentials1().add(platformUserCredentials1);
		platformUserCredentials1.setPlatformUserHeader1(this);

		return platformUserCredentials1;
	}

	public PlatformUserCredential removePlatformUserCredentials1(PlatformUserCredential platformUserCredentials1) {
		getPlatformUserCredentials1().remove(platformUserCredentials1);
		platformUserCredentials1.setPlatformUserHeader1(null);

		return platformUserCredentials1;
	}

	public List<PlatformUserCredential> getPlatformUserCredentials2() {
		return this.platformUserCredentials2;
	}

	public void setPlatformUserCredentials2(List<PlatformUserCredential> platformUserCredentials2) {
		this.platformUserCredentials2 = platformUserCredentials2;
	}

	public PlatformUserCredential addPlatformUserCredentials2(PlatformUserCredential platformUserCredentials2) {
		getPlatformUserCredentials2().add(platformUserCredentials2);
		platformUserCredentials2.setPlatformUserHeader2(this);

		return platformUserCredentials2;
	}

	public PlatformUserCredential removePlatformUserCredentials2(PlatformUserCredential platformUserCredentials2) {
		getPlatformUserCredentials2().remove(platformUserCredentials2);
		platformUserCredentials2.setPlatformUserHeader2(null);

		return platformUserCredentials2;
	}

	public PlatformUserCredential getPlatformUserCredential() {
		return this.platformUserCredential;
	}

	public void setPlatformUserCredential(PlatformUserCredential platformUserCredential) {
		this.platformUserCredential = platformUserCredential;
	}

	public List<PurchaseOrderApproverMap> getPurchaseOrderApproverMaps() {
		return this.purchaseOrderApproverMaps;
	}

	public void setPurchaseOrderApproverMaps(List<PurchaseOrderApproverMap> purchaseOrderApproverMaps) {
		this.purchaseOrderApproverMaps = purchaseOrderApproverMaps;
	}

	public PurchaseOrderApproverMap addPurchaseOrderApproverMap(PurchaseOrderApproverMap purchaseOrderApproverMap) {
		getPurchaseOrderApproverMaps().add(purchaseOrderApproverMap);
		purchaseOrderApproverMap.setPlatformUserHeader(this);

		return purchaseOrderApproverMap;
	}

	public PurchaseOrderApproverMap removePurchaseOrderApproverMap(PurchaseOrderApproverMap purchaseOrderApproverMap) {
		getPurchaseOrderApproverMaps().remove(purchaseOrderApproverMap);
		purchaseOrderApproverMap.setPlatformUserHeader(null);

		return purchaseOrderApproverMap;
	}

	public List<PurchaseOrderQuoteMap> getPurchaseOrderQuoteMaps1() {
		return this.purchaseOrderQuoteMaps1;
	}

	public void setPurchaseOrderQuoteMaps1(List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps1) {
		this.purchaseOrderQuoteMaps1 = purchaseOrderQuoteMaps1;
	}

	public PurchaseOrderQuoteMap addPurchaseOrderQuoteMaps1(PurchaseOrderQuoteMap purchaseOrderQuoteMaps1) {
		getPurchaseOrderQuoteMaps1().add(purchaseOrderQuoteMaps1);
		purchaseOrderQuoteMaps1.setPlatformUserHeader1(this);

		return purchaseOrderQuoteMaps1;
	}

	public PurchaseOrderQuoteMap removePurchaseOrderQuoteMaps1(PurchaseOrderQuoteMap purchaseOrderQuoteMaps1) {
		getPurchaseOrderQuoteMaps1().remove(purchaseOrderQuoteMaps1);
		purchaseOrderQuoteMaps1.setPlatformUserHeader1(null);

		return purchaseOrderQuoteMaps1;
	}

	public List<PurchaseOrderQuoteMap> getPurchaseOrderQuoteMaps2() {
		return this.purchaseOrderQuoteMaps2;
	}

	public void setPurchaseOrderQuoteMaps2(List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps2) {
		this.purchaseOrderQuoteMaps2 = purchaseOrderQuoteMaps2;
	}

	public PurchaseOrderQuoteMap addPurchaseOrderQuoteMaps2(PurchaseOrderQuoteMap purchaseOrderQuoteMaps2) {
		getPurchaseOrderQuoteMaps2().add(purchaseOrderQuoteMaps2);
		purchaseOrderQuoteMaps2.setPlatformUserHeader2(this);

		return purchaseOrderQuoteMaps2;
	}

	public PurchaseOrderQuoteMap removePurchaseOrderQuoteMaps2(PurchaseOrderQuoteMap purchaseOrderQuoteMaps2) {
		getPurchaseOrderQuoteMaps2().remove(purchaseOrderQuoteMaps2);
		purchaseOrderQuoteMaps2.setPlatformUserHeader2(null);

		return purchaseOrderQuoteMaps2;
	}

	public List<PurchaseOrderQuoteMap> getPurchaseOrderQuoteMaps3() {
		return this.purchaseOrderQuoteMaps3;
	}

	public void setPurchaseOrderQuoteMaps3(List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps3) {
		this.purchaseOrderQuoteMaps3 = purchaseOrderQuoteMaps3;
	}

	public PurchaseOrderQuoteMap addPurchaseOrderQuoteMaps3(PurchaseOrderQuoteMap purchaseOrderQuoteMaps3) {
		getPurchaseOrderQuoteMaps3().add(purchaseOrderQuoteMaps3);
		purchaseOrderQuoteMaps3.setPlatformUserHeader3(this);

		return purchaseOrderQuoteMaps3;
	}

	public PurchaseOrderQuoteMap removePurchaseOrderQuoteMaps3(PurchaseOrderQuoteMap purchaseOrderQuoteMaps3) {
		getPurchaseOrderQuoteMaps3().remove(purchaseOrderQuoteMaps3);
		purchaseOrderQuoteMaps3.setPlatformUserHeader3(null);

		return purchaseOrderQuoteMaps3;
	}

	public List<PurchaseRequestApproverMap> getPurchaseRequestApproverMaps() {
		return this.purchaseRequestApproverMaps;
	}

	public void setPurchaseRequestApproverMaps(List<PurchaseRequestApproverMap> purchaseRequestApproverMaps) {
		this.purchaseRequestApproverMaps = purchaseRequestApproverMaps;
	}

	public PurchaseRequestApproverMap addPurchaseRequestApproverMap(PurchaseRequestApproverMap purchaseRequestApproverMap) {
		getPurchaseRequestApproverMaps().add(purchaseRequestApproverMap);
		purchaseRequestApproverMap.setPlatformUserHeader(this);

		return purchaseRequestApproverMap;
	}

	public PurchaseRequestApproverMap removePurchaseRequestApproverMap(PurchaseRequestApproverMap purchaseRequestApproverMap) {
		getPurchaseRequestApproverMaps().remove(purchaseRequestApproverMap);
		purchaseRequestApproverMap.setPlatformUserHeader(null);

		return purchaseRequestApproverMap;
	}

	public List<PurchaseRequestHeader> getPurchaseRequestHeaders1() {
		return this.purchaseRequestHeaders1;
	}

	public void setPurchaseRequestHeaders1(List<PurchaseRequestHeader> purchaseRequestHeaders1) {
		this.purchaseRequestHeaders1 = purchaseRequestHeaders1;
	}

	public PurchaseRequestHeader addPurchaseRequestHeaders1(PurchaseRequestHeader purchaseRequestHeaders1) {
		getPurchaseRequestHeaders1().add(purchaseRequestHeaders1);
		purchaseRequestHeaders1.setPlatformUserHeader1(this);

		return purchaseRequestHeaders1;
	}

	public PurchaseRequestHeader removePurchaseRequestHeaders1(PurchaseRequestHeader purchaseRequestHeaders1) {
		getPurchaseRequestHeaders1().remove(purchaseRequestHeaders1);
		purchaseRequestHeaders1.setPlatformUserHeader1(null);

		return purchaseRequestHeaders1;
	}

	public List<PurchaseRequestHeader> getPurchaseRequestHeaders2() {
		return this.purchaseRequestHeaders2;
	}

	public void setPurchaseRequestHeaders2(List<PurchaseRequestHeader> purchaseRequestHeaders2) {
		this.purchaseRequestHeaders2 = purchaseRequestHeaders2;
	}

	public PurchaseRequestHeader addPurchaseRequestHeaders2(PurchaseRequestHeader purchaseRequestHeaders2) {
		getPurchaseRequestHeaders2().add(purchaseRequestHeaders2);
		purchaseRequestHeaders2.setPlatformUserHeader2(this);

		return purchaseRequestHeaders2;
	}

	public PurchaseRequestHeader removePurchaseRequestHeaders2(PurchaseRequestHeader purchaseRequestHeaders2) {
		getPurchaseRequestHeaders2().remove(purchaseRequestHeaders2);
		purchaseRequestHeaders2.setPlatformUserHeader2(null);

		return purchaseRequestHeaders2;
	}

	public List<PurchaseRequestHeader> getPurchaseRequestHeaders3() {
		return this.purchaseRequestHeaders3;
	}

	public void setPurchaseRequestHeaders3(List<PurchaseRequestHeader> purchaseRequestHeaders3) {
		this.purchaseRequestHeaders3 = purchaseRequestHeaders3;
	}

	public PurchaseRequestHeader addPurchaseRequestHeaders3(PurchaseRequestHeader purchaseRequestHeaders3) {
		getPurchaseRequestHeaders3().add(purchaseRequestHeaders3);
		purchaseRequestHeaders3.setPlatformUserHeader3(this);

		return purchaseRequestHeaders3;
	}

	public PurchaseRequestHeader removePurchaseRequestHeaders3(PurchaseRequestHeader purchaseRequestHeaders3) {
		getPurchaseRequestHeaders3().remove(purchaseRequestHeaders3);
		purchaseRequestHeaders3.setPlatformUserHeader3(null);

		return purchaseRequestHeaders3;
	}

	public List<PurchaseRequestHeader> getPurchaseRequestHeaders4() {
		return this.purchaseRequestHeaders4;
	}

	public void setPurchaseRequestHeaders4(List<PurchaseRequestHeader> purchaseRequestHeaders4) {
		this.purchaseRequestHeaders4 = purchaseRequestHeaders4;
	}

	public PurchaseRequestHeader addPurchaseRequestHeaders4(PurchaseRequestHeader purchaseRequestHeaders4) {
		getPurchaseRequestHeaders4().add(purchaseRequestHeaders4);
		purchaseRequestHeaders4.setPlatformUserHeader4(this);

		return purchaseRequestHeaders4;
	}

	public PurchaseRequestHeader removePurchaseRequestHeaders4(PurchaseRequestHeader purchaseRequestHeaders4) {
		getPurchaseRequestHeaders4().remove(purchaseRequestHeaders4);
		purchaseRequestHeaders4.setPlatformUserHeader4(null);

		return purchaseRequestHeaders4;
	}

	public List<RequestForQuoteHeader> getRequestForQuoteHeaders1() {
		return this.requestForQuoteHeaders1;
	}

	public void setRequestForQuoteHeaders1(List<RequestForQuoteHeader> requestForQuoteHeaders1) {
		this.requestForQuoteHeaders1 = requestForQuoteHeaders1;
	}

	public RequestForQuoteHeader addRequestForQuoteHeaders1(RequestForQuoteHeader requestForQuoteHeaders1) {
		getRequestForQuoteHeaders1().add(requestForQuoteHeaders1);
		requestForQuoteHeaders1.setPlatformUserHeader1(this);

		return requestForQuoteHeaders1;
	}

	public RequestForQuoteHeader removeRequestForQuoteHeaders1(RequestForQuoteHeader requestForQuoteHeaders1) {
		getRequestForQuoteHeaders1().remove(requestForQuoteHeaders1);
		requestForQuoteHeaders1.setPlatformUserHeader1(null);

		return requestForQuoteHeaders1;
	}

	public List<RequestForQuoteHeader> getRequestForQuoteHeaders2() {
		return this.requestForQuoteHeaders2;
	}

	public void setRequestForQuoteHeaders2(List<RequestForQuoteHeader> requestForQuoteHeaders2) {
		this.requestForQuoteHeaders2 = requestForQuoteHeaders2;
	}

	public RequestForQuoteHeader addRequestForQuoteHeaders2(RequestForQuoteHeader requestForQuoteHeaders2) {
		getRequestForQuoteHeaders2().add(requestForQuoteHeaders2);
		requestForQuoteHeaders2.setPlatformUserHeader2(this);

		return requestForQuoteHeaders2;
	}

	public RequestForQuoteHeader removeRequestForQuoteHeaders2(RequestForQuoteHeader requestForQuoteHeaders2) {
		getRequestForQuoteHeaders2().remove(requestForQuoteHeaders2);
		requestForQuoteHeaders2.setPlatformUserHeader2(null);

		return requestForQuoteHeaders2;
	}

	public List<RequestForQuoteHeader> getRequestForQuoteHeaders3() {
		return this.requestForQuoteHeaders3;
	}

	public void setRequestForQuoteHeaders3(List<RequestForQuoteHeader> requestForQuoteHeaders3) {
		this.requestForQuoteHeaders3 = requestForQuoteHeaders3;
	}

	public RequestForQuoteHeader addRequestForQuoteHeaders3(RequestForQuoteHeader requestForQuoteHeaders3) {
		getRequestForQuoteHeaders3().add(requestForQuoteHeaders3);
		requestForQuoteHeaders3.setPlatformUserHeader3(this);

		return requestForQuoteHeaders3;
	}

	public RequestForQuoteHeader removeRequestForQuoteHeaders3(RequestForQuoteHeader requestForQuoteHeaders3) {
		getRequestForQuoteHeaders3().remove(requestForQuoteHeaders3);
		requestForQuoteHeaders3.setPlatformUserHeader3(null);

		return requestForQuoteHeaders3;
	}

	public List<RfqApproverMap> getRfqApproverMaps() {
		return this.rfqApproverMaps;
	}

	public void setRfqApproverMaps(List<RfqApproverMap> rfqApproverMaps) {
		this.rfqApproverMaps = rfqApproverMaps;
	}

	public RfqApproverMap addRfqApproverMap(RfqApproverMap rfqApproverMap) {
		getRfqApproverMaps().add(rfqApproverMap);
		rfqApproverMap.setPlatformUserHeader(this);

		return rfqApproverMap;
	}

	public RfqApproverMap removeRfqApproverMap(RfqApproverMap rfqApproverMap) {
		getRfqApproverMaps().remove(rfqApproverMap);
		rfqApproverMap.setPlatformUserHeader(null);

		return rfqApproverMap;
	}

	public List<SupplierQuoteApproverMap> getSupplierQuoteApproverMaps() {
		return this.supplierQuoteApproverMaps;
	}

	public void setSupplierQuoteApproverMaps(List<SupplierQuoteApproverMap> supplierQuoteApproverMaps) {
		this.supplierQuoteApproverMaps = supplierQuoteApproverMaps;
	}

	public SupplierQuoteApproverMap addSupplierQuoteApproverMap(SupplierQuoteApproverMap supplierQuoteApproverMap) {
		getSupplierQuoteApproverMaps().add(supplierQuoteApproverMap);
		supplierQuoteApproverMap.setPlatformUserHeader(this);

		return supplierQuoteApproverMap;
	}

	public SupplierQuoteApproverMap removeSupplierQuoteApproverMap(SupplierQuoteApproverMap supplierQuoteApproverMap) {
		getSupplierQuoteApproverMaps().remove(supplierQuoteApproverMap);
		supplierQuoteApproverMap.setPlatformUserHeader(null);

		return supplierQuoteApproverMap;
	}

	public List<SupplierQuoteHeader> getSupplierQuoteHeaders1() {
		return this.supplierQuoteHeaders1;
	}

	public void setSupplierQuoteHeaders1(List<SupplierQuoteHeader> supplierQuoteHeaders1) {
		this.supplierQuoteHeaders1 = supplierQuoteHeaders1;
	}

	public SupplierQuoteHeader addSupplierQuoteHeaders1(SupplierQuoteHeader supplierQuoteHeaders1) {
		getSupplierQuoteHeaders1().add(supplierQuoteHeaders1);
		supplierQuoteHeaders1.setPlatformUserHeader1(this);

		return supplierQuoteHeaders1;
	}

	public SupplierQuoteHeader removeSupplierQuoteHeaders1(SupplierQuoteHeader supplierQuoteHeaders1) {
		getSupplierQuoteHeaders1().remove(supplierQuoteHeaders1);
		supplierQuoteHeaders1.setPlatformUserHeader1(null);

		return supplierQuoteHeaders1;
	}

	public List<SupplierQuoteHeader> getSupplierQuoteHeaders2() {
		return this.supplierQuoteHeaders2;
	}

	public void setSupplierQuoteHeaders2(List<SupplierQuoteHeader> supplierQuoteHeaders2) {
		this.supplierQuoteHeaders2 = supplierQuoteHeaders2;
	}

	public SupplierQuoteHeader addSupplierQuoteHeaders2(SupplierQuoteHeader supplierQuoteHeaders2) {
		getSupplierQuoteHeaders2().add(supplierQuoteHeaders2);
		supplierQuoteHeaders2.setPlatformUserHeader2(this);

		return supplierQuoteHeaders2;
	}

	public SupplierQuoteHeader removeSupplierQuoteHeaders2(SupplierQuoteHeader supplierQuoteHeaders2) {
		getSupplierQuoteHeaders2().remove(supplierQuoteHeaders2);
		supplierQuoteHeaders2.setPlatformUserHeader2(null);

		return supplierQuoteHeaders2;
	}

	public List<SupplierQuoteHeader> getSupplierQuoteHeaders3() {
		return this.supplierQuoteHeaders3;
	}

	public void setSupplierQuoteHeaders3(List<SupplierQuoteHeader> supplierQuoteHeaders3) {
		this.supplierQuoteHeaders3 = supplierQuoteHeaders3;
	}

	public SupplierQuoteHeader addSupplierQuoteHeaders3(SupplierQuoteHeader supplierQuoteHeaders3) {
		getSupplierQuoteHeaders3().add(supplierQuoteHeaders3);
		supplierQuoteHeaders3.setPlatformUserHeader3(this);

		return supplierQuoteHeaders3;
	}

	public SupplierQuoteHeader removeSupplierQuoteHeaders3(SupplierQuoteHeader supplierQuoteHeaders3) {
		getSupplierQuoteHeaders3().remove(supplierQuoteHeaders3);
		supplierQuoteHeaders3.setPlatformUserHeader3(null);

		return supplierQuoteHeaders3;
	}

	public List<UserDepartmentRoleMap> getUserDepartmentRoleMaps1() {
		return this.userDepartmentRoleMaps1;
	}

	public void setUserDepartmentRoleMaps1(List<UserDepartmentRoleMap> userDepartmentRoleMaps1) {
		this.userDepartmentRoleMaps1 = userDepartmentRoleMaps1;
	}

	public UserDepartmentRoleMap addUserDepartmentRoleMaps1(UserDepartmentRoleMap userDepartmentRoleMaps1) {
		getUserDepartmentRoleMaps1().add(userDepartmentRoleMaps1);
		userDepartmentRoleMaps1.setPlatformUserHeader1(this);

		return userDepartmentRoleMaps1;
	}

	public UserDepartmentRoleMap removeUserDepartmentRoleMaps1(UserDepartmentRoleMap userDepartmentRoleMaps1) {
		getUserDepartmentRoleMaps1().remove(userDepartmentRoleMaps1);
		userDepartmentRoleMaps1.setPlatformUserHeader1(null);

		return userDepartmentRoleMaps1;
	}

	public List<UserDepartmentRoleMap> getUserDepartmentRoleMaps2() {
		return this.userDepartmentRoleMaps2;
	}

	public void setUserDepartmentRoleMaps2(List<UserDepartmentRoleMap> userDepartmentRoleMaps2) {
		this.userDepartmentRoleMaps2 = userDepartmentRoleMaps2;
	}

	public UserDepartmentRoleMap addUserDepartmentRoleMaps2(UserDepartmentRoleMap userDepartmentRoleMaps2) {
		getUserDepartmentRoleMaps2().add(userDepartmentRoleMaps2);
		userDepartmentRoleMaps2.setPlatformUserHeader2(this);

		return userDepartmentRoleMaps2;
	}

	public UserDepartmentRoleMap removeUserDepartmentRoleMaps2(UserDepartmentRoleMap userDepartmentRoleMaps2) {
		getUserDepartmentRoleMaps2().remove(userDepartmentRoleMaps2);
		userDepartmentRoleMaps2.setPlatformUserHeader2(null);

		return userDepartmentRoleMaps2;
	}

	public List<UserDepartmentRoleMap> getUserDepartmentRoleMaps3() {
		return this.userDepartmentRoleMaps3;
	}

	public void setUserDepartmentRoleMaps3(List<UserDepartmentRoleMap> userDepartmentRoleMaps3) {
		this.userDepartmentRoleMaps3 = userDepartmentRoleMaps3;
	}

	public UserDepartmentRoleMap addUserDepartmentRoleMaps3(UserDepartmentRoleMap userDepartmentRoleMaps3) {
		getUserDepartmentRoleMaps3().add(userDepartmentRoleMaps3);
		userDepartmentRoleMaps3.setPlatformUserHeader3(this);

		return userDepartmentRoleMaps3;
	}

	public UserDepartmentRoleMap removeUserDepartmentRoleMaps3(UserDepartmentRoleMap userDepartmentRoleMaps3) {
		getUserDepartmentRoleMaps3().remove(userDepartmentRoleMaps3);
		userDepartmentRoleMaps3.setPlatformUserHeader3(null);

		return userDepartmentRoleMaps3;
	}

	public UserDepartmentRoleMap getUserDepartmentRoleMap() {
		return this.userDepartmentRoleMap;
	}

	public void setUserDepartmentRoleMap(UserDepartmentRoleMap userDepartmentRoleMap) {
		this.userDepartmentRoleMap = userDepartmentRoleMap;
	}

}