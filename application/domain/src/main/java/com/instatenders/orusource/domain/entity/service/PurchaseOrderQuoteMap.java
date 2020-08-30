package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
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
 * The persistent class for the purchase_order_quote_map database table.
 * 
 */
@Entity
@Table(name="purchase_order_quote_map")
public class PurchaseOrderQuoteMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="purchase_order_quote_map_id")
	private String purchaseOrderQuoteMapId;

	@Column(name="approval_flow")
	private String approvalFlow;

	@Column(name="approval_type")
	private String approvalType;

	@Column(name="attachment_available")
	private String attachmentAvailable;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="purchase_currency")
	private String purchaseCurrency;

	@Temporal(TemporalType.DATE)
	@Column(name="purchase_order_create_date")
	private Date purchaseOrderCreateDate;

	@Column(name="purchase_order_number")
	private String purchaseOrderNumber;

	@Column(name="purchase_order_status")
	private String purchaseOrderStatus;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PurchaseOrderApproverMap
	@OneToMany(mappedBy="purchaseOrderQuoteMap")
	private List<PurchaseOrderApproverMap> purchaseOrderApproverMaps;

	//bi-directional many-to-one association to PurchaseOrderAttachment
	@OneToMany(mappedBy="purchaseOrderQuoteMap")
	private List<PurchaseOrderAttachment> purchaseOrderAttachments;

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

	//bi-directional many-to-one association to SupplierDetail
	@ManyToOne
	private SupplierDetail supplierDetail;

	//bi-directional many-to-one association to SupplierQuoteHeader
	@ManyToOne
	private SupplierQuoteHeader supplierQuoteHeader;

	//bi-directional many-to-one association to PurchaseOrderQuotePriceMap
	@OneToMany(mappedBy="purchaseOrderQuoteMap")
	private List<PurchaseOrderQuotePriceMap> purchaseOrderQuotePriceMaps;

	//bi-directional many-to-one association to PurchaseOrderRfqItemMap
	@OneToMany(mappedBy="purchaseOrderQuoteMap")
	private List<PurchaseOrderRfqItemMap> purchaseOrderRfqItemMaps;

	//bi-directional many-to-one association to PurchaseOrderTerm
	@OneToMany(mappedBy="purchaseOrderQuoteMap")
	private List<PurchaseOrderTerm> purchaseOrderTerms;

	public PurchaseOrderQuoteMap() {
	}

	public String getPurchaseOrderQuoteMapId() {
		return this.purchaseOrderQuoteMapId;
	}

	public void setPurchaseOrderQuoteMapId(String purchaseOrderQuoteMapId) {
		this.purchaseOrderQuoteMapId = purchaseOrderQuoteMapId;
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

	public String getPurchaseCurrency() {
		return this.purchaseCurrency;
	}

	public void setPurchaseCurrency(String purchaseCurrency) {
		this.purchaseCurrency = purchaseCurrency;
	}

	public Date getPurchaseOrderCreateDate() {
		return this.purchaseOrderCreateDate;
	}

	public void setPurchaseOrderCreateDate(Date purchaseOrderCreateDate) {
		this.purchaseOrderCreateDate = purchaseOrderCreateDate;
	}

	public String getPurchaseOrderNumber() {
		return this.purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public String getPurchaseOrderStatus() {
		return this.purchaseOrderStatus;
	}

	public void setPurchaseOrderStatus(String purchaseOrderStatus) {
		this.purchaseOrderStatus = purchaseOrderStatus;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<PurchaseOrderApproverMap> getPurchaseOrderApproverMaps() {
		return this.purchaseOrderApproverMaps;
	}

	public void setPurchaseOrderApproverMaps(List<PurchaseOrderApproverMap> purchaseOrderApproverMaps) {
		this.purchaseOrderApproverMaps = purchaseOrderApproverMaps;
	}

	public PurchaseOrderApproverMap addPurchaseOrderApproverMap(PurchaseOrderApproverMap purchaseOrderApproverMap) {
		getPurchaseOrderApproverMaps().add(purchaseOrderApproverMap);
		purchaseOrderApproverMap.setPurchaseOrderQuoteMap(this);

		return purchaseOrderApproverMap;
	}

	public PurchaseOrderApproverMap removePurchaseOrderApproverMap(PurchaseOrderApproverMap purchaseOrderApproverMap) {
		getPurchaseOrderApproverMaps().remove(purchaseOrderApproverMap);
		purchaseOrderApproverMap.setPurchaseOrderQuoteMap(null);

		return purchaseOrderApproverMap;
	}

	public List<PurchaseOrderAttachment> getPurchaseOrderAttachments() {
		return this.purchaseOrderAttachments;
	}

	public void setPurchaseOrderAttachments(List<PurchaseOrderAttachment> purchaseOrderAttachments) {
		this.purchaseOrderAttachments = purchaseOrderAttachments;
	}

	public PurchaseOrderAttachment addPurchaseOrderAttachment(PurchaseOrderAttachment purchaseOrderAttachment) {
		getPurchaseOrderAttachments().add(purchaseOrderAttachment);
		purchaseOrderAttachment.setPurchaseOrderQuoteMap(this);

		return purchaseOrderAttachment;
	}

	public PurchaseOrderAttachment removePurchaseOrderAttachment(PurchaseOrderAttachment purchaseOrderAttachment) {
		getPurchaseOrderAttachments().remove(purchaseOrderAttachment);
		purchaseOrderAttachment.setPurchaseOrderQuoteMap(null);

		return purchaseOrderAttachment;
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

	public SupplierDetail getSupplierDetail() {
		return this.supplierDetail;
	}

	public void setSupplierDetail(SupplierDetail supplierDetail) {
		this.supplierDetail = supplierDetail;
	}

	public SupplierQuoteHeader getSupplierQuoteHeader() {
		return this.supplierQuoteHeader;
	}

	public void setSupplierQuoteHeader(SupplierQuoteHeader supplierQuoteHeader) {
		this.supplierQuoteHeader = supplierQuoteHeader;
	}

	public List<PurchaseOrderQuotePriceMap> getPurchaseOrderQuotePriceMaps() {
		return this.purchaseOrderQuotePriceMaps;
	}

	public void setPurchaseOrderQuotePriceMaps(List<PurchaseOrderQuotePriceMap> purchaseOrderQuotePriceMaps) {
		this.purchaseOrderQuotePriceMaps = purchaseOrderQuotePriceMaps;
	}

	public PurchaseOrderQuotePriceMap addPurchaseOrderQuotePriceMap(PurchaseOrderQuotePriceMap purchaseOrderQuotePriceMap) {
		getPurchaseOrderQuotePriceMaps().add(purchaseOrderQuotePriceMap);
		purchaseOrderQuotePriceMap.setPurchaseOrderQuoteMap(this);

		return purchaseOrderQuotePriceMap;
	}

	public PurchaseOrderQuotePriceMap removePurchaseOrderQuotePriceMap(PurchaseOrderQuotePriceMap purchaseOrderQuotePriceMap) {
		getPurchaseOrderQuotePriceMaps().remove(purchaseOrderQuotePriceMap);
		purchaseOrderQuotePriceMap.setPurchaseOrderQuoteMap(null);

		return purchaseOrderQuotePriceMap;
	}

	public List<PurchaseOrderRfqItemMap> getPurchaseOrderRfqItemMaps() {
		return this.purchaseOrderRfqItemMaps;
	}

	public void setPurchaseOrderRfqItemMaps(List<PurchaseOrderRfqItemMap> purchaseOrderRfqItemMaps) {
		this.purchaseOrderRfqItemMaps = purchaseOrderRfqItemMaps;
	}

	public PurchaseOrderRfqItemMap addPurchaseOrderRfqItemMap(PurchaseOrderRfqItemMap purchaseOrderRfqItemMap) {
		getPurchaseOrderRfqItemMaps().add(purchaseOrderRfqItemMap);
		purchaseOrderRfqItemMap.setPurchaseOrderQuoteMap(this);

		return purchaseOrderRfqItemMap;
	}

	public PurchaseOrderRfqItemMap removePurchaseOrderRfqItemMap(PurchaseOrderRfqItemMap purchaseOrderRfqItemMap) {
		getPurchaseOrderRfqItemMaps().remove(purchaseOrderRfqItemMap);
		purchaseOrderRfqItemMap.setPurchaseOrderQuoteMap(null);

		return purchaseOrderRfqItemMap;
	}

	public List<PurchaseOrderTerm> getPurchaseOrderTerms() {
		return this.purchaseOrderTerms;
	}

	public void setPurchaseOrderTerms(List<PurchaseOrderTerm> purchaseOrderTerms) {
		this.purchaseOrderTerms = purchaseOrderTerms;
	}

	public PurchaseOrderTerm addPurchaseOrderTerm(PurchaseOrderTerm purchaseOrderTerm) {
		getPurchaseOrderTerms().add(purchaseOrderTerm);
		purchaseOrderTerm.setPurchaseOrderQuoteMap(this);

		return purchaseOrderTerm;
	}

	public PurchaseOrderTerm removePurchaseOrderTerm(PurchaseOrderTerm purchaseOrderTerm) {
		getPurchaseOrderTerms().remove(purchaseOrderTerm);
		purchaseOrderTerm.setPurchaseOrderQuoteMap(null);

		return purchaseOrderTerm;
	}

}