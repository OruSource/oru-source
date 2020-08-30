package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the supplier_details database table.
 * 
 */
@Entity
@Table(name="supplier_details")
public class SupplierDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="supplier_code")
	private String supplierCode;

	@Column(name="attachment_available")
	private String attachmentAvailable;

	@Column(name="company_year_of_experience")
	private String companyYearOfExperience;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="supplier_company_name")
	private String supplierCompanyName;

	@Column(name="supplier_customer_reference")
	private String supplierCustomerReference;

	@Column(name="supplier_industry")
	private String supplierIndustry;

	@Column(name="supplier_rating")
	private BigDecimal supplierRating;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to ItemPreviousPurchaseDetail
	@OneToMany(mappedBy="supplierDetail")
	private List<ItemPreviousPurchaseDetail> itemPreviousPurchaseDetails;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@OneToMany(mappedBy="supplierDetail")
	private List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps;

	//bi-directional many-to-one association to PurchaseRequestSupplierMap
	@OneToMany(mappedBy="supplierDetail")
	private List<PurchaseRequestSupplierMap> purchaseRequestSupplierMaps;

	//bi-directional many-to-one association to RfqItemSupplierMapping
	@OneToMany(mappedBy="supplierDetail")
	private List<RfqItemSupplierMapping> rfqItemSupplierMappings;

	//bi-directional many-to-one association to RfqSupplierMapping
	@OneToMany(mappedBy="supplierDetail")
	private List<RfqSupplierMapping> rfqSupplierMappings;

	//bi-directional many-to-one association to SupplierAttachment
	@OneToMany(mappedBy="supplierDetail")
	private List<SupplierAttachment> supplierAttachments;

	//bi-directional many-to-one association to SupplierCompanyTurnOver
	@OneToMany(mappedBy="supplierDetail")
	private List<SupplierCompanyTurnOver> supplierCompanyTurnOvers;

	//bi-directional many-to-one association to SupplierCustomerRefContact
	@ManyToOne
	private SupplierCustomerRefContact supplierCustomerRefContact;

	//bi-directional many-to-one association to SupplierItemCategoryMap
	@OneToMany(mappedBy="supplierDetail")
	private List<SupplierItemCategoryMap> supplierItemCategoryMaps;

	//bi-directional many-to-one association to UserDepartmentRoleMap
	@OneToMany(mappedBy="supplierDetail")
	private List<UserDepartmentRoleMap> userDepartmentRoleMaps;

	public SupplierDetail() {
	}

	public String getSupplierCode() {
		return this.supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getAttachmentAvailable() {
		return this.attachmentAvailable;
	}

	public void setAttachmentAvailable(String attachmentAvailable) {
		this.attachmentAvailable = attachmentAvailable;
	}

	public String getCompanyYearOfExperience() {
		return this.companyYearOfExperience;
	}

	public void setCompanyYearOfExperience(String companyYearOfExperience) {
		this.companyYearOfExperience = companyYearOfExperience;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getSupplierCompanyName() {
		return this.supplierCompanyName;
	}

	public void setSupplierCompanyName(String supplierCompanyName) {
		this.supplierCompanyName = supplierCompanyName;
	}

	public String getSupplierCustomerReference() {
		return this.supplierCustomerReference;
	}

	public void setSupplierCustomerReference(String supplierCustomerReference) {
		this.supplierCustomerReference = supplierCustomerReference;
	}

	public String getSupplierIndustry() {
		return this.supplierIndustry;
	}

	public void setSupplierIndustry(String supplierIndustry) {
		this.supplierIndustry = supplierIndustry;
	}

	public BigDecimal getSupplierRating() {
		return this.supplierRating;
	}

	public void setSupplierRating(BigDecimal supplierRating) {
		this.supplierRating = supplierRating;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<ItemPreviousPurchaseDetail> getItemPreviousPurchaseDetails() {
		return this.itemPreviousPurchaseDetails;
	}

	public void setItemPreviousPurchaseDetails(List<ItemPreviousPurchaseDetail> itemPreviousPurchaseDetails) {
		this.itemPreviousPurchaseDetails = itemPreviousPurchaseDetails;
	}

	public ItemPreviousPurchaseDetail addItemPreviousPurchaseDetail(ItemPreviousPurchaseDetail itemPreviousPurchaseDetail) {
		getItemPreviousPurchaseDetails().add(itemPreviousPurchaseDetail);
		itemPreviousPurchaseDetail.setSupplierDetail(this);

		return itemPreviousPurchaseDetail;
	}

	public ItemPreviousPurchaseDetail removeItemPreviousPurchaseDetail(ItemPreviousPurchaseDetail itemPreviousPurchaseDetail) {
		getItemPreviousPurchaseDetails().remove(itemPreviousPurchaseDetail);
		itemPreviousPurchaseDetail.setSupplierDetail(null);

		return itemPreviousPurchaseDetail;
	}

	public List<PurchaseOrderQuoteMap> getPurchaseOrderQuoteMaps() {
		return this.purchaseOrderQuoteMaps;
	}

	public void setPurchaseOrderQuoteMaps(List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps) {
		this.purchaseOrderQuoteMaps = purchaseOrderQuoteMaps;
	}

	public PurchaseOrderQuoteMap addPurchaseOrderQuoteMap(PurchaseOrderQuoteMap purchaseOrderQuoteMap) {
		getPurchaseOrderQuoteMaps().add(purchaseOrderQuoteMap);
		purchaseOrderQuoteMap.setSupplierDetail(this);

		return purchaseOrderQuoteMap;
	}

	public PurchaseOrderQuoteMap removePurchaseOrderQuoteMap(PurchaseOrderQuoteMap purchaseOrderQuoteMap) {
		getPurchaseOrderQuoteMaps().remove(purchaseOrderQuoteMap);
		purchaseOrderQuoteMap.setSupplierDetail(null);

		return purchaseOrderQuoteMap;
	}

	public List<PurchaseRequestSupplierMap> getPurchaseRequestSupplierMaps() {
		return this.purchaseRequestSupplierMaps;
	}

	public void setPurchaseRequestSupplierMaps(List<PurchaseRequestSupplierMap> purchaseRequestSupplierMaps) {
		this.purchaseRequestSupplierMaps = purchaseRequestSupplierMaps;
	}

	public PurchaseRequestSupplierMap addPurchaseRequestSupplierMap(PurchaseRequestSupplierMap purchaseRequestSupplierMap) {
		getPurchaseRequestSupplierMaps().add(purchaseRequestSupplierMap);
		purchaseRequestSupplierMap.setSupplierDetail(this);

		return purchaseRequestSupplierMap;
	}

	public PurchaseRequestSupplierMap removePurchaseRequestSupplierMap(PurchaseRequestSupplierMap purchaseRequestSupplierMap) {
		getPurchaseRequestSupplierMaps().remove(purchaseRequestSupplierMap);
		purchaseRequestSupplierMap.setSupplierDetail(null);

		return purchaseRequestSupplierMap;
	}

	public List<RfqItemSupplierMapping> getRfqItemSupplierMappings() {
		return this.rfqItemSupplierMappings;
	}

	public void setRfqItemSupplierMappings(List<RfqItemSupplierMapping> rfqItemSupplierMappings) {
		this.rfqItemSupplierMappings = rfqItemSupplierMappings;
	}

	public RfqItemSupplierMapping addRfqItemSupplierMapping(RfqItemSupplierMapping rfqItemSupplierMapping) {
		getRfqItemSupplierMappings().add(rfqItemSupplierMapping);
		rfqItemSupplierMapping.setSupplierDetail(this);

		return rfqItemSupplierMapping;
	}

	public RfqItemSupplierMapping removeRfqItemSupplierMapping(RfqItemSupplierMapping rfqItemSupplierMapping) {
		getRfqItemSupplierMappings().remove(rfqItemSupplierMapping);
		rfqItemSupplierMapping.setSupplierDetail(null);

		return rfqItemSupplierMapping;
	}

	public List<RfqSupplierMapping> getRfqSupplierMappings() {
		return this.rfqSupplierMappings;
	}

	public void setRfqSupplierMappings(List<RfqSupplierMapping> rfqSupplierMappings) {
		this.rfqSupplierMappings = rfqSupplierMappings;
	}

	public RfqSupplierMapping addRfqSupplierMapping(RfqSupplierMapping rfqSupplierMapping) {
		getRfqSupplierMappings().add(rfqSupplierMapping);
		rfqSupplierMapping.setSupplierDetail(this);

		return rfqSupplierMapping;
	}

	public RfqSupplierMapping removeRfqSupplierMapping(RfqSupplierMapping rfqSupplierMapping) {
		getRfqSupplierMappings().remove(rfqSupplierMapping);
		rfqSupplierMapping.setSupplierDetail(null);

		return rfqSupplierMapping;
	}

	public List<SupplierAttachment> getSupplierAttachments() {
		return this.supplierAttachments;
	}

	public void setSupplierAttachments(List<SupplierAttachment> supplierAttachments) {
		this.supplierAttachments = supplierAttachments;
	}

	public SupplierAttachment addSupplierAttachment(SupplierAttachment supplierAttachment) {
		getSupplierAttachments().add(supplierAttachment);
		supplierAttachment.setSupplierDetail(this);

		return supplierAttachment;
	}

	public SupplierAttachment removeSupplierAttachment(SupplierAttachment supplierAttachment) {
		getSupplierAttachments().remove(supplierAttachment);
		supplierAttachment.setSupplierDetail(null);

		return supplierAttachment;
	}

	public List<SupplierCompanyTurnOver> getSupplierCompanyTurnOvers() {
		return this.supplierCompanyTurnOvers;
	}

	public void setSupplierCompanyTurnOvers(List<SupplierCompanyTurnOver> supplierCompanyTurnOvers) {
		this.supplierCompanyTurnOvers = supplierCompanyTurnOvers;
	}

	public SupplierCompanyTurnOver addSupplierCompanyTurnOver(SupplierCompanyTurnOver supplierCompanyTurnOver) {
		getSupplierCompanyTurnOvers().add(supplierCompanyTurnOver);
		supplierCompanyTurnOver.setSupplierDetail(this);

		return supplierCompanyTurnOver;
	}

	public SupplierCompanyTurnOver removeSupplierCompanyTurnOver(SupplierCompanyTurnOver supplierCompanyTurnOver) {
		getSupplierCompanyTurnOvers().remove(supplierCompanyTurnOver);
		supplierCompanyTurnOver.setSupplierDetail(null);

		return supplierCompanyTurnOver;
	}

	public SupplierCustomerRefContact getSupplierCustomerRefContact() {
		return this.supplierCustomerRefContact;
	}

	public void setSupplierCustomerRefContact(SupplierCustomerRefContact supplierCustomerRefContact) {
		this.supplierCustomerRefContact = supplierCustomerRefContact;
	}

	public List<SupplierItemCategoryMap> getSupplierItemCategoryMaps() {
		return this.supplierItemCategoryMaps;
	}

	public void setSupplierItemCategoryMaps(List<SupplierItemCategoryMap> supplierItemCategoryMaps) {
		this.supplierItemCategoryMaps = supplierItemCategoryMaps;
	}

	public SupplierItemCategoryMap addSupplierItemCategoryMap(SupplierItemCategoryMap supplierItemCategoryMap) {
		getSupplierItemCategoryMaps().add(supplierItemCategoryMap);
		supplierItemCategoryMap.setSupplierDetail(this);

		return supplierItemCategoryMap;
	}

	public SupplierItemCategoryMap removeSupplierItemCategoryMap(SupplierItemCategoryMap supplierItemCategoryMap) {
		getSupplierItemCategoryMaps().remove(supplierItemCategoryMap);
		supplierItemCategoryMap.setSupplierDetail(null);

		return supplierItemCategoryMap;
	}

	public List<UserDepartmentRoleMap> getUserDepartmentRoleMaps() {
		return this.userDepartmentRoleMaps;
	}

	public void setUserDepartmentRoleMaps(List<UserDepartmentRoleMap> userDepartmentRoleMaps) {
		this.userDepartmentRoleMaps = userDepartmentRoleMaps;
	}

	public UserDepartmentRoleMap addUserDepartmentRoleMap(UserDepartmentRoleMap userDepartmentRoleMap) {
		getUserDepartmentRoleMaps().add(userDepartmentRoleMap);
		userDepartmentRoleMap.setSupplierDetail(this);

		return userDepartmentRoleMap;
	}

	public UserDepartmentRoleMap removeUserDepartmentRoleMap(UserDepartmentRoleMap userDepartmentRoleMap) {
		getUserDepartmentRoleMaps().remove(userDepartmentRoleMap);
		userDepartmentRoleMap.setSupplierDetail(null);

		return userDepartmentRoleMap;
	}

}