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
 * The persistent class for the supplier_quote_header database table.
 * 
 */
@Entity
@Table(name="supplier_quote_header")
public class SupplierQuoteHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="supplier_quote_header_id")
	private String supplierQuoteHeaderId;

	@Column(name="approval_flow")
	private String approvalFlow;

	@Column(name="approval_type")
	private String approvalType;

	@Column(name="attachment_available")
	private String attachmentAvailable;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="proxy_quote")
	private String proxyQuote;

	@Column(name="purchase_currency")
	private String purchaseCurrency;

	@Temporal(TemporalType.DATE)
	@Column(name="quote_create_date")
	private Date quoteCreateDate;

	@Column(name="quote_status")
	private String quoteStatus;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@OneToMany(mappedBy="supplierQuoteHeader")
	private List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps;

	//bi-directional many-to-one association to SupplierQuoteApproverMap
	@OneToMany(mappedBy="supplierQuoteHeader")
	private List<SupplierQuoteApproverMap> supplierQuoteApproverMaps;

	//bi-directional many-to-one association to SupplierQuoteAttachment
	@OneToMany(mappedBy="supplierQuoteHeader")
	private List<SupplierQuoteAttachment> supplierQuoteAttachments;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader1;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader2;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader3;

	//bi-directional many-to-one association to RequestForQuoteHeader
	@ManyToOne
	private RequestForQuoteHeader requestForQuoteHeader;

	//bi-directional many-to-one association to SupplierQuoteRfqItemPriceMap
	@OneToMany(mappedBy="supplierQuoteHeader")
	private List<SupplierQuoteRfqItemPriceMap> supplierQuoteRfqItemPriceMaps;

	//bi-directional many-to-one association to SupplierQuoteRfqPriceMap
	@OneToMany(mappedBy="supplierQuoteHeader")
	private List<SupplierQuoteRfqPriceMap> supplierQuoteRfqPriceMaps;

	//bi-directional many-to-one association to SupplierTermsResponse
	@OneToMany(mappedBy="supplierQuoteHeader")
	private List<SupplierTermsResponse> supplierTermsResponses;

	public SupplierQuoteHeader() {
	}

	public String getSupplierQuoteHeaderId() {
		return this.supplierQuoteHeaderId;
	}

	public void setSupplierQuoteHeaderId(String supplierQuoteHeaderId) {
		this.supplierQuoteHeaderId = supplierQuoteHeaderId;
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

	public String getProxyQuote() {
		return this.proxyQuote;
	}

	public void setProxyQuote(String proxyQuote) {
		this.proxyQuote = proxyQuote;
	}

	public String getPurchaseCurrency() {
		return this.purchaseCurrency;
	}

	public void setPurchaseCurrency(String purchaseCurrency) {
		this.purchaseCurrency = purchaseCurrency;
	}

	public Date getQuoteCreateDate() {
		return this.quoteCreateDate;
	}

	public void setQuoteCreateDate(Date quoteCreateDate) {
		this.quoteCreateDate = quoteCreateDate;
	}

	public String getQuoteStatus() {
		return this.quoteStatus;
	}

	public void setQuoteStatus(String quoteStatus) {
		this.quoteStatus = quoteStatus;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<PurchaseOrderQuoteMap> getPurchaseOrderQuoteMaps() {
		return this.purchaseOrderQuoteMaps;
	}

	public void setPurchaseOrderQuoteMaps(List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps) {
		this.purchaseOrderQuoteMaps = purchaseOrderQuoteMaps;
	}

	public PurchaseOrderQuoteMap addPurchaseOrderQuoteMap(PurchaseOrderQuoteMap purchaseOrderQuoteMap) {
		getPurchaseOrderQuoteMaps().add(purchaseOrderQuoteMap);
		purchaseOrderQuoteMap.setSupplierQuoteHeader(this);

		return purchaseOrderQuoteMap;
	}

	public PurchaseOrderQuoteMap removePurchaseOrderQuoteMap(PurchaseOrderQuoteMap purchaseOrderQuoteMap) {
		getPurchaseOrderQuoteMaps().remove(purchaseOrderQuoteMap);
		purchaseOrderQuoteMap.setSupplierQuoteHeader(null);

		return purchaseOrderQuoteMap;
	}

	public List<SupplierQuoteApproverMap> getSupplierQuoteApproverMaps() {
		return this.supplierQuoteApproverMaps;
	}

	public void setSupplierQuoteApproverMaps(List<SupplierQuoteApproverMap> supplierQuoteApproverMaps) {
		this.supplierQuoteApproverMaps = supplierQuoteApproverMaps;
	}

	public SupplierQuoteApproverMap addSupplierQuoteApproverMap(SupplierQuoteApproverMap supplierQuoteApproverMap) {
		getSupplierQuoteApproverMaps().add(supplierQuoteApproverMap);
		supplierQuoteApproverMap.setSupplierQuoteHeader(this);

		return supplierQuoteApproverMap;
	}

	public SupplierQuoteApproverMap removeSupplierQuoteApproverMap(SupplierQuoteApproverMap supplierQuoteApproverMap) {
		getSupplierQuoteApproverMaps().remove(supplierQuoteApproverMap);
		supplierQuoteApproverMap.setSupplierQuoteHeader(null);

		return supplierQuoteApproverMap;
	}

	public List<SupplierQuoteAttachment> getSupplierQuoteAttachments() {
		return this.supplierQuoteAttachments;
	}

	public void setSupplierQuoteAttachments(List<SupplierQuoteAttachment> supplierQuoteAttachments) {
		this.supplierQuoteAttachments = supplierQuoteAttachments;
	}

	public SupplierQuoteAttachment addSupplierQuoteAttachment(SupplierQuoteAttachment supplierQuoteAttachment) {
		getSupplierQuoteAttachments().add(supplierQuoteAttachment);
		supplierQuoteAttachment.setSupplierQuoteHeader(this);

		return supplierQuoteAttachment;
	}

	public SupplierQuoteAttachment removeSupplierQuoteAttachment(SupplierQuoteAttachment supplierQuoteAttachment) {
		getSupplierQuoteAttachments().remove(supplierQuoteAttachment);
		supplierQuoteAttachment.setSupplierQuoteHeader(null);

		return supplierQuoteAttachment;
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

	public RequestForQuoteHeader getRequestForQuoteHeader() {
		return this.requestForQuoteHeader;
	}

	public void setRequestForQuoteHeader(RequestForQuoteHeader requestForQuoteHeader) {
		this.requestForQuoteHeader = requestForQuoteHeader;
	}

	public List<SupplierQuoteRfqItemPriceMap> getSupplierQuoteRfqItemPriceMaps() {
		return this.supplierQuoteRfqItemPriceMaps;
	}

	public void setSupplierQuoteRfqItemPriceMaps(List<SupplierQuoteRfqItemPriceMap> supplierQuoteRfqItemPriceMaps) {
		this.supplierQuoteRfqItemPriceMaps = supplierQuoteRfqItemPriceMaps;
	}

	public SupplierQuoteRfqItemPriceMap addSupplierQuoteRfqItemPriceMap(SupplierQuoteRfqItemPriceMap supplierQuoteRfqItemPriceMap) {
		getSupplierQuoteRfqItemPriceMaps().add(supplierQuoteRfqItemPriceMap);
		supplierQuoteRfqItemPriceMap.setSupplierQuoteHeader(this);

		return supplierQuoteRfqItemPriceMap;
	}

	public SupplierQuoteRfqItemPriceMap removeSupplierQuoteRfqItemPriceMap(SupplierQuoteRfqItemPriceMap supplierQuoteRfqItemPriceMap) {
		getSupplierQuoteRfqItemPriceMaps().remove(supplierQuoteRfqItemPriceMap);
		supplierQuoteRfqItemPriceMap.setSupplierQuoteHeader(null);

		return supplierQuoteRfqItemPriceMap;
	}

	public List<SupplierQuoteRfqPriceMap> getSupplierQuoteRfqPriceMaps() {
		return this.supplierQuoteRfqPriceMaps;
	}

	public void setSupplierQuoteRfqPriceMaps(List<SupplierQuoteRfqPriceMap> supplierQuoteRfqPriceMaps) {
		this.supplierQuoteRfqPriceMaps = supplierQuoteRfqPriceMaps;
	}

	public SupplierQuoteRfqPriceMap addSupplierQuoteRfqPriceMap(SupplierQuoteRfqPriceMap supplierQuoteRfqPriceMap) {
		getSupplierQuoteRfqPriceMaps().add(supplierQuoteRfqPriceMap);
		supplierQuoteRfqPriceMap.setSupplierQuoteHeader(this);

		return supplierQuoteRfqPriceMap;
	}

	public SupplierQuoteRfqPriceMap removeSupplierQuoteRfqPriceMap(SupplierQuoteRfqPriceMap supplierQuoteRfqPriceMap) {
		getSupplierQuoteRfqPriceMaps().remove(supplierQuoteRfqPriceMap);
		supplierQuoteRfqPriceMap.setSupplierQuoteHeader(null);

		return supplierQuoteRfqPriceMap;
	}

	public List<SupplierTermsResponse> getSupplierTermsResponses() {
		return this.supplierTermsResponses;
	}

	public void setSupplierTermsResponses(List<SupplierTermsResponse> supplierTermsResponses) {
		this.supplierTermsResponses = supplierTermsResponses;
	}

	public SupplierTermsResponse addSupplierTermsRespons(SupplierTermsResponse supplierTermsRespons) {
		getSupplierTermsResponses().add(supplierTermsRespons);
		supplierTermsRespons.setSupplierQuoteHeader(this);

		return supplierTermsRespons;
	}

	public SupplierTermsResponse removeSupplierTermsRespons(SupplierTermsResponse supplierTermsRespons) {
		getSupplierTermsResponses().remove(supplierTermsRespons);
		supplierTermsRespons.setSupplierQuoteHeader(null);

		return supplierTermsRespons;
	}

}