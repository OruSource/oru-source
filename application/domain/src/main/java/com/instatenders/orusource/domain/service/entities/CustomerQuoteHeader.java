package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the customer_quote_header database table.
 * 
 */
@Entity
@Table(name="customer_quote_header")
public class CustomerQuoteHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="customer_quote_header_id")
	private String customerQuoteHeaderId;

	@Column(name="approval_flow")
	private String approvalFlow;

	@Column(name="approval_type")
	private String approvalType;

	@Column(name="attachment_available")
	private String attachmentAvailable;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Temporal(TemporalType.DATE)
	@Column(name="customer_quote_create_date")
	private Date customerQuoteCreateDate;

	@Column(name="customer_quote_status")
	private String customerQuoteStatus;

	@Column(name="purchase_currency")
	private String purchaseCurrency;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to CustomerQuoteAttachment
	@OneToMany(mappedBy="customerQuoteHeader")
	private List<CustomerQuoteAttachment> customerQuoteAttachments;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader1;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader2;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader3;

	//bi-directional many-to-one association to PurchaseRequestHeader
	@ManyToOne
	private PurchaseRequestHeader purchaseRequestHeader;

	//bi-directional many-to-one association to CustomerQuotePrItemPriceMap
	@OneToMany(mappedBy="customerQuoteHeader")
	private List<CustomerQuotePrItemPriceMap> customerQuotePrItemPriceMaps;

	//bi-directional many-to-one association to CustomerQuotePrPriceMap
	@OneToMany(mappedBy="customerQuoteHeader")
	private List<CustomerQuotePrPriceMap> customerQuotePrPriceMaps;

	public CustomerQuoteHeader() {
	}

	public String getCustomerQuoteHeaderId() {
		return this.customerQuoteHeaderId;
	}

	public void setCustomerQuoteHeaderId(String customerQuoteHeaderId) {
		this.customerQuoteHeaderId = customerQuoteHeaderId;
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

	public Date getCustomerQuoteCreateDate() {
		return this.customerQuoteCreateDate;
	}

	public void setCustomerQuoteCreateDate(Date customerQuoteCreateDate) {
		this.customerQuoteCreateDate = customerQuoteCreateDate;
	}

	public String getCustomerQuoteStatus() {
		return this.customerQuoteStatus;
	}

	public void setCustomerQuoteStatus(String customerQuoteStatus) {
		this.customerQuoteStatus = customerQuoteStatus;
	}

	public String getPurchaseCurrency() {
		return this.purchaseCurrency;
	}

	public void setPurchaseCurrency(String purchaseCurrency) {
		this.purchaseCurrency = purchaseCurrency;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<CustomerQuoteAttachment> getCustomerQuoteAttachments() {
		return this.customerQuoteAttachments;
	}

	public void setCustomerQuoteAttachments(List<CustomerQuoteAttachment> customerQuoteAttachments) {
		this.customerQuoteAttachments = customerQuoteAttachments;
	}

	public CustomerQuoteAttachment addCustomerQuoteAttachment(CustomerQuoteAttachment customerQuoteAttachment) {
		getCustomerQuoteAttachments().add(customerQuoteAttachment);
		customerQuoteAttachment.setCustomerQuoteHeader(this);

		return customerQuoteAttachment;
	}

	public CustomerQuoteAttachment removeCustomerQuoteAttachment(CustomerQuoteAttachment customerQuoteAttachment) {
		getCustomerQuoteAttachments().remove(customerQuoteAttachment);
		customerQuoteAttachment.setCustomerQuoteHeader(null);

		return customerQuoteAttachment;
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

	public PurchaseRequestHeader getPurchaseRequestHeader() {
		return this.purchaseRequestHeader;
	}

	public void setPurchaseRequestHeader(PurchaseRequestHeader purchaseRequestHeader) {
		this.purchaseRequestHeader = purchaseRequestHeader;
	}

	public List<CustomerQuotePrItemPriceMap> getCustomerQuotePrItemPriceMaps() {
		return this.customerQuotePrItemPriceMaps;
	}

	public void setCustomerQuotePrItemPriceMaps(List<CustomerQuotePrItemPriceMap> customerQuotePrItemPriceMaps) {
		this.customerQuotePrItemPriceMaps = customerQuotePrItemPriceMaps;
	}

	public CustomerQuotePrItemPriceMap addCustomerQuotePrItemPriceMap(CustomerQuotePrItemPriceMap customerQuotePrItemPriceMap) {
		getCustomerQuotePrItemPriceMaps().add(customerQuotePrItemPriceMap);
		customerQuotePrItemPriceMap.setCustomerQuoteHeader(this);

		return customerQuotePrItemPriceMap;
	}

	public CustomerQuotePrItemPriceMap removeCustomerQuotePrItemPriceMap(CustomerQuotePrItemPriceMap customerQuotePrItemPriceMap) {
		getCustomerQuotePrItemPriceMaps().remove(customerQuotePrItemPriceMap);
		customerQuotePrItemPriceMap.setCustomerQuoteHeader(null);

		return customerQuotePrItemPriceMap;
	}

	public List<CustomerQuotePrPriceMap> getCustomerQuotePrPriceMaps() {
		return this.customerQuotePrPriceMaps;
	}

	public void setCustomerQuotePrPriceMaps(List<CustomerQuotePrPriceMap> customerQuotePrPriceMaps) {
		this.customerQuotePrPriceMaps = customerQuotePrPriceMaps;
	}

	public CustomerQuotePrPriceMap addCustomerQuotePrPriceMap(CustomerQuotePrPriceMap customerQuotePrPriceMap) {
		getCustomerQuotePrPriceMaps().add(customerQuotePrPriceMap);
		customerQuotePrPriceMap.setCustomerQuoteHeader(this);

		return customerQuotePrPriceMap;
	}

	public CustomerQuotePrPriceMap removeCustomerQuotePrPriceMap(CustomerQuotePrPriceMap customerQuotePrPriceMap) {
		getCustomerQuotePrPriceMaps().remove(customerQuotePrPriceMap);
		customerQuotePrPriceMap.setCustomerQuoteHeader(null);

		return customerQuotePrPriceMap;
	}

}