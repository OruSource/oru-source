package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the purchase_request_header database table.
 * 
 */
@Entity
@Table(name="purchase_request_header")
public class PurchaseRequestHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="purchase_request_id")
	private String purchaseRequestId;

	@Column(name="approval_flow")
	private String approvalFlow;

	@Column(name="approval_type")
	private String approvalType;

	@Column(name="attachment_available")
	private String attachmentAvailable;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Temporal(TemporalType.DATE)
	@Column(name="delivery_date")
	private Date deliveryDate;

	@Column(name="purchase_currency")
	private String purchaseCurrency;

	@Temporal(TemporalType.DATE)
	@Column(name="purchase_request_create_date")
	private Date purchaseRequestCreateDate;

	@Column(name="purchase_request_status")
	private String purchaseRequestStatus;

	@Column(name="purchase_request_total_value")
	private BigDecimal purchaseRequestTotalValue;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to CustomerQuoteHeader
	@OneToMany(mappedBy="purchaseRequestHeader")
	private List<CustomerQuoteHeader> customerQuoteHeaders;

	//bi-directional many-to-one association to PurchaseRequestApproverMap
	@OneToMany(mappedBy="purchaseRequestHeader")
	private List<PurchaseRequestApproverMap> purchaseRequestApproverMaps;

	//bi-directional many-to-one association to PurchaseRequestAttachment
	@OneToMany(mappedBy="purchaseRequestHeader")
	private List<PurchaseRequestAttachment> purchaseRequestAttachments;

	//bi-directional many-to-one association to PlatformUserAddress
	@ManyToOne
	private PlatformUserAddress platformUserAddress;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader1;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader2;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader3;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader4;

	//bi-directional many-to-one association to PurchaseRequestItem
	@OneToMany(mappedBy="purchaseRequestHeader")
	private List<PurchaseRequestItem> purchaseRequestItems;

	//bi-directional many-to-one association to PurchaseRequestSupplierMap
	@OneToMany(mappedBy="purchaseRequestHeader")
	private List<PurchaseRequestSupplierMap> purchaseRequestSupplierMaps;

	//bi-directional many-to-one association to RfqPrMap
	@OneToMany(mappedBy="purchaseRequestHeader")
	private List<RfqPrMap> rfqPrMaps;

	public PurchaseRequestHeader() {
	}

	public String getPurchaseRequestId() {
		return this.purchaseRequestId;
	}

	public void setPurchaseRequestId(String purchaseRequestId) {
		this.purchaseRequestId = purchaseRequestId;
	}

	public String getApprovalFlow() {
		return this.approvalFlow;
	}

	public void setApprovalFlow(String approvalFlow) {
		this.approvalFlow = approvalFlow;
	}

	public String getApprovalType() {
		return this.approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
	}

	public String getAttachmentAvailable() {
		return this.attachmentAvailable;
	}

	public void setAttachmentAvailable(String attachmentAvailable) {
		this.attachmentAvailable = attachmentAvailable;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getPurchaseCurrency() {
		return this.purchaseCurrency;
	}

	public void setPurchaseCurrency(String purchaseCurrency) {
		this.purchaseCurrency = purchaseCurrency;
	}

	public Date getPurchaseRequestCreateDate() {
		return this.purchaseRequestCreateDate;
	}

	public void setPurchaseRequestCreateDate(Date purchaseRequestCreateDate) {
		this.purchaseRequestCreateDate = purchaseRequestCreateDate;
	}

	public String getPurchaseRequestStatus() {
		return this.purchaseRequestStatus;
	}

	public void setPurchaseRequestStatus(String purchaseRequestStatus) {
		this.purchaseRequestStatus = purchaseRequestStatus;
	}

	public BigDecimal getPurchaseRequestTotalValue() {
		return this.purchaseRequestTotalValue;
	}

	public void setPurchaseRequestTotalValue(BigDecimal purchaseRequestTotalValue) {
		this.purchaseRequestTotalValue = purchaseRequestTotalValue;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<CustomerQuoteHeader> getCustomerQuoteHeaders() {
		return this.customerQuoteHeaders;
	}

	public void setCustomerQuoteHeaders(List<CustomerQuoteHeader> customerQuoteHeaders) {
		this.customerQuoteHeaders = customerQuoteHeaders;
	}

	public CustomerQuoteHeader addCustomerQuoteHeader(CustomerQuoteHeader customerQuoteHeader) {
		getCustomerQuoteHeaders().add(customerQuoteHeader);
		customerQuoteHeader.setPurchaseRequestHeader(this);

		return customerQuoteHeader;
	}

	public CustomerQuoteHeader removeCustomerQuoteHeader(CustomerQuoteHeader customerQuoteHeader) {
		getCustomerQuoteHeaders().remove(customerQuoteHeader);
		customerQuoteHeader.setPurchaseRequestHeader(null);

		return customerQuoteHeader;
	}

	public List<PurchaseRequestApproverMap> getPurchaseRequestApproverMaps() {
		return this.purchaseRequestApproverMaps;
	}

	public void setPurchaseRequestApproverMaps(List<PurchaseRequestApproverMap> purchaseRequestApproverMaps) {
		this.purchaseRequestApproverMaps = purchaseRequestApproverMaps;
	}

	public PurchaseRequestApproverMap addPurchaseRequestApproverMap(PurchaseRequestApproverMap purchaseRequestApproverMap) {
		getPurchaseRequestApproverMaps().add(purchaseRequestApproverMap);
		purchaseRequestApproverMap.setPurchaseRequestHeader(this);

		return purchaseRequestApproverMap;
	}

	public PurchaseRequestApproverMap removePurchaseRequestApproverMap(PurchaseRequestApproverMap purchaseRequestApproverMap) {
		getPurchaseRequestApproverMaps().remove(purchaseRequestApproverMap);
		purchaseRequestApproverMap.setPurchaseRequestHeader(null);

		return purchaseRequestApproverMap;
	}

	public List<PurchaseRequestAttachment> getPurchaseRequestAttachments() {
		return this.purchaseRequestAttachments;
	}

	public void setPurchaseRequestAttachments(List<PurchaseRequestAttachment> purchaseRequestAttachments) {
		this.purchaseRequestAttachments = purchaseRequestAttachments;
	}

	public PurchaseRequestAttachment addPurchaseRequestAttachment(PurchaseRequestAttachment purchaseRequestAttachment) {
		getPurchaseRequestAttachments().add(purchaseRequestAttachment);
		purchaseRequestAttachment.setPurchaseRequestHeader(this);

		return purchaseRequestAttachment;
	}

	public PurchaseRequestAttachment removePurchaseRequestAttachment(PurchaseRequestAttachment purchaseRequestAttachment) {
		getPurchaseRequestAttachments().remove(purchaseRequestAttachment);
		purchaseRequestAttachment.setPurchaseRequestHeader(null);

		return purchaseRequestAttachment;
	}

	public PlatformUserAddress getPlatformUserAddress() {
		return this.platformUserAddress;
	}

	public void setPlatformUserAddress(PlatformUserAddress platformUserAddress) {
		this.platformUserAddress = platformUserAddress;
	}

	public PlatformUserHeader getPlatformUserHeader1() {
		return this.platformUserHeader1;
	}

	public void setPlatformUserHeader1(PlatformUserHeader platformUserHeader1) {
		this.platformUserHeader1 = platformUserHeader1;
	}

	public PlatformUserHeader getPlatformUserHeader2() {
		return this.platformUserHeader2;
	}

	public void setPlatformUserHeader2(PlatformUserHeader platformUserHeader2) {
		this.platformUserHeader2 = platformUserHeader2;
	}

	public PlatformUserHeader getPlatformUserHeader3() {
		return this.platformUserHeader3;
	}

	public void setPlatformUserHeader3(PlatformUserHeader platformUserHeader3) {
		this.platformUserHeader3 = platformUserHeader3;
	}

	public PlatformUserHeader getPlatformUserHeader4() {
		return this.platformUserHeader4;
	}

	public void setPlatformUserHeader4(PlatformUserHeader platformUserHeader4) {
		this.platformUserHeader4 = platformUserHeader4;
	}

	public List<PurchaseRequestItem> getPurchaseRequestItems() {
		return this.purchaseRequestItems;
	}

	public void setPurchaseRequestItems(List<PurchaseRequestItem> purchaseRequestItems) {
		this.purchaseRequestItems = purchaseRequestItems;
	}

	public PurchaseRequestItem addPurchaseRequestItem(PurchaseRequestItem purchaseRequestItem) {
		getPurchaseRequestItems().add(purchaseRequestItem);
		purchaseRequestItem.setPurchaseRequestHeader(this);

		return purchaseRequestItem;
	}

	public PurchaseRequestItem removePurchaseRequestItem(PurchaseRequestItem purchaseRequestItem) {
		getPurchaseRequestItems().remove(purchaseRequestItem);
		purchaseRequestItem.setPurchaseRequestHeader(null);

		return purchaseRequestItem;
	}

	public List<PurchaseRequestSupplierMap> getPurchaseRequestSupplierMaps() {
		return this.purchaseRequestSupplierMaps;
	}

	public void setPurchaseRequestSupplierMaps(List<PurchaseRequestSupplierMap> purchaseRequestSupplierMaps) {
		this.purchaseRequestSupplierMaps = purchaseRequestSupplierMaps;
	}

	public PurchaseRequestSupplierMap addPurchaseRequestSupplierMap(PurchaseRequestSupplierMap purchaseRequestSupplierMap) {
		getPurchaseRequestSupplierMaps().add(purchaseRequestSupplierMap);
		purchaseRequestSupplierMap.setPurchaseRequestHeader(this);

		return purchaseRequestSupplierMap;
	}

	public PurchaseRequestSupplierMap removePurchaseRequestSupplierMap(PurchaseRequestSupplierMap purchaseRequestSupplierMap) {
		getPurchaseRequestSupplierMaps().remove(purchaseRequestSupplierMap);
		purchaseRequestSupplierMap.setPurchaseRequestHeader(null);

		return purchaseRequestSupplierMap;
	}

	public List<RfqPrMap> getRfqPrMaps() {
		return this.rfqPrMaps;
	}

	public void setRfqPrMaps(List<RfqPrMap> rfqPrMaps) {
		this.rfqPrMaps = rfqPrMaps;
	}

	public RfqPrMap addRfqPrMap(RfqPrMap rfqPrMap) {
		getRfqPrMaps().add(rfqPrMap);
		rfqPrMap.setPurchaseRequestHeader(this);

		return rfqPrMap;
	}

	public RfqPrMap removeRfqPrMap(RfqPrMap rfqPrMap) {
		getRfqPrMaps().remove(rfqPrMap);
		rfqPrMap.setPurchaseRequestHeader(null);

		return rfqPrMap;
	}

}