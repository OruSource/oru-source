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
 * The persistent class for the request_for_quote_header database table.
 * 
 */
@Entity
@Table(name="request_for_quote_header")
public class RequestForQuoteHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rfq_id")
	private String rfqId;

	@Column(name="approval_flow")
	private String approvalFlow;

	@Column(name="approval_type")
	private String approvalType;

	@Column(name="attachment_available")
	private String attachmentAvailable;

	@Temporal(TemporalType.DATE)
	@Column(name="bid_due_date")
	private Date bidDueDate;

	@Temporal(TemporalType.DATE)
	@Column(name="bid_opening_date")
	private Date bidOpeningDate;

	@Column(name="bid_part_type")
	private String bidPartType;

	@Temporal(TemporalType.DATE)
	@Column(name="bid_start_date")
	private Date bidStartDate;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="earnest_money_deposit")
	private BigDecimal earnestMoneyDeposit;

	@Temporal(TemporalType.DATE)
	@Column(name="rfq_create_date")
	private Date rfqCreateDate;

	@Column(name="rfq_notes")
	private String rfqNotes;

	@Column(name="rfq_status")
	private String rfqStatus;

	@Column(name="tender_fee")
	private BigDecimal tenderFee;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PurchaseOrderQuoteMap
	@OneToMany(mappedBy="requestForQuoteHeader")
	private List<PurchaseOrderQuoteMap> purchaseOrderQuoteMaps;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader1;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader2;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader3;

	//bi-directional many-to-one association to RfqApproverMap
	@OneToMany(mappedBy="requestForQuoteHeader")
	private List<RfqApproverMap> rfqApproverMaps;

	//bi-directional many-to-one association to RfqAttachment
	@OneToMany(mappedBy="requestForQuoteHeader")
	private List<RfqAttachment> rfqAttachments;

	//bi-directional many-to-one association to RfqPrMap
	@OneToMany(mappedBy="requestForQuoteHeader")
	private List<RfqPrMap> rfqPrMaps;

	//bi-directional many-to-one association to RfqTermMap
	@OneToMany(mappedBy="requestForQuoteHeader")
	private List<RfqTermMap> rfqTermMaps;

	//bi-directional many-to-one association to SupplierQuoteHeader
	@OneToMany(mappedBy="requestForQuoteHeader")
	private List<SupplierQuoteHeader> supplierQuoteHeaders;

	public RequestForQuoteHeader() {
	}

	public String getRfqId() {
		return this.rfqId;
	}

	public void setRfqId(String rfqId) {
		this.rfqId = rfqId;
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

	public Date getBidDueDate() {
		return this.bidDueDate;
	}

	public void setBidDueDate(Date bidDueDate) {
		this.bidDueDate = bidDueDate;
	}

	public Date getBidOpeningDate() {
		return this.bidOpeningDate;
	}

	public void setBidOpeningDate(Date bidOpeningDate) {
		this.bidOpeningDate = bidOpeningDate;
	}

	public String getBidPartType() {
		return this.bidPartType;
	}

	public void setBidPartType(String bidPartType) {
		this.bidPartType = bidPartType;
	}

	public Date getBidStartDate() {
		return this.bidStartDate;
	}

	public void setBidStartDate(Date bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public BigDecimal getEarnestMoneyDeposit() {
		return this.earnestMoneyDeposit;
	}

	public void setEarnestMoneyDeposit(BigDecimal earnestMoneyDeposit) {
		this.earnestMoneyDeposit = earnestMoneyDeposit;
	}

	public Date getRfqCreateDate() {
		return this.rfqCreateDate;
	}

	public void setRfqCreateDate(Date rfqCreateDate) {
		this.rfqCreateDate = rfqCreateDate;
	}

	public String getRfqNotes() {
		return this.rfqNotes;
	}

	public void setRfqNotes(String rfqNotes) {
		this.rfqNotes = rfqNotes;
	}

	public String getRfqStatus() {
		return this.rfqStatus;
	}

	public void setRfqStatus(String rfqStatus) {
		this.rfqStatus = rfqStatus;
	}

	public BigDecimal getTenderFee() {
		return this.tenderFee;
	}

	public void setTenderFee(BigDecimal tenderFee) {
		this.tenderFee = tenderFee;
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
		purchaseOrderQuoteMap.setRequestForQuoteHeader(this);

		return purchaseOrderQuoteMap;
	}

	public PurchaseOrderQuoteMap removePurchaseOrderQuoteMap(PurchaseOrderQuoteMap purchaseOrderQuoteMap) {
		getPurchaseOrderQuoteMaps().remove(purchaseOrderQuoteMap);
		purchaseOrderQuoteMap.setRequestForQuoteHeader(null);

		return purchaseOrderQuoteMap;
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

	public List<RfqApproverMap> getRfqApproverMaps() {
		return this.rfqApproverMaps;
	}

	public void setRfqApproverMaps(List<RfqApproverMap> rfqApproverMaps) {
		this.rfqApproverMaps = rfqApproverMaps;
	}

	public RfqApproverMap addRfqApproverMap(RfqApproverMap rfqApproverMap) {
		getRfqApproverMaps().add(rfqApproverMap);
		rfqApproverMap.setRequestForQuoteHeader(this);

		return rfqApproverMap;
	}

	public RfqApproverMap removeRfqApproverMap(RfqApproverMap rfqApproverMap) {
		getRfqApproverMaps().remove(rfqApproverMap);
		rfqApproverMap.setRequestForQuoteHeader(null);

		return rfqApproverMap;
	}

	public List<RfqAttachment> getRfqAttachments() {
		return this.rfqAttachments;
	}

	public void setRfqAttachments(List<RfqAttachment> rfqAttachments) {
		this.rfqAttachments = rfqAttachments;
	}

	public RfqAttachment addRfqAttachment(RfqAttachment rfqAttachment) {
		getRfqAttachments().add(rfqAttachment);
		rfqAttachment.setRequestForQuoteHeader(this);

		return rfqAttachment;
	}

	public RfqAttachment removeRfqAttachment(RfqAttachment rfqAttachment) {
		getRfqAttachments().remove(rfqAttachment);
		rfqAttachment.setRequestForQuoteHeader(null);

		return rfqAttachment;
	}

	public List<RfqPrMap> getRfqPrMaps() {
		return this.rfqPrMaps;
	}

	public void setRfqPrMaps(List<RfqPrMap> rfqPrMaps) {
		this.rfqPrMaps = rfqPrMaps;
	}

	public RfqPrMap addRfqPrMap(RfqPrMap rfqPrMap) {
		getRfqPrMaps().add(rfqPrMap);
		rfqPrMap.setRequestForQuoteHeader(this);

		return rfqPrMap;
	}

	public RfqPrMap removeRfqPrMap(RfqPrMap rfqPrMap) {
		getRfqPrMaps().remove(rfqPrMap);
		rfqPrMap.setRequestForQuoteHeader(null);

		return rfqPrMap;
	}

	public List<RfqTermMap> getRfqTermMaps() {
		return this.rfqTermMaps;
	}

	public void setRfqTermMaps(List<RfqTermMap> rfqTermMaps) {
		this.rfqTermMaps = rfqTermMaps;
	}

	public RfqTermMap addRfqTermMap(RfqTermMap rfqTermMap) {
		getRfqTermMaps().add(rfqTermMap);
		rfqTermMap.setRequestForQuoteHeader(this);

		return rfqTermMap;
	}

	public RfqTermMap removeRfqTermMap(RfqTermMap rfqTermMap) {
		getRfqTermMaps().remove(rfqTermMap);
		rfqTermMap.setRequestForQuoteHeader(null);

		return rfqTermMap;
	}

	public List<SupplierQuoteHeader> getSupplierQuoteHeaders() {
		return this.supplierQuoteHeaders;
	}

	public void setSupplierQuoteHeaders(List<SupplierQuoteHeader> supplierQuoteHeaders) {
		this.supplierQuoteHeaders = supplierQuoteHeaders;
	}

	public SupplierQuoteHeader addSupplierQuoteHeader(SupplierQuoteHeader supplierQuoteHeader) {
		getSupplierQuoteHeaders().add(supplierQuoteHeader);
		supplierQuoteHeader.setRequestForQuoteHeader(this);

		return supplierQuoteHeader;
	}

	public SupplierQuoteHeader removeSupplierQuoteHeader(SupplierQuoteHeader supplierQuoteHeader) {
		getSupplierQuoteHeaders().remove(supplierQuoteHeader);
		supplierQuoteHeader.setRequestForQuoteHeader(null);

		return supplierQuoteHeader;
	}

}