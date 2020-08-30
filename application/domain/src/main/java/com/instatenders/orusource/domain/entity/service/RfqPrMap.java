package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the rfq_pr_map database table.
 * 
 */
@Entity
@Table(name="rfq_pr_map")
public class RfqPrMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rfq_item_line_id")
	private String rfqItemLineId;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="pr_item_allocated_quantity")
	private int prItemAllocatedQuantity;

	@Column(name="pr_item_code")
	private String prItemCode;

	@Column(name="pr_item_code_prefix")
	private String prItemCodePrefix;

	@Column(name="rfq_item_status")
	private String rfqItemStatus;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to PurchaseOrderRfqItemMap
	@OneToMany(mappedBy="rfqPrMap")
	private List<PurchaseOrderRfqItemMap> purchaseOrderRfqItemMaps;

	//bi-directional many-to-one association to RfqItemSupplierMapping
	@OneToMany(mappedBy="rfqPrMap")
	private List<RfqItemSupplierMapping> rfqItemSupplierMappings;

	//bi-directional many-to-one association to PurchaseRequestHeader
	@ManyToOne
	private PurchaseRequestHeader purchaseRequestHeader;

	//bi-directional many-to-one association to PurchaseRequestItem
	@ManyToOne
	private PurchaseRequestItem purchaseRequestItem;

	//bi-directional many-to-one association to RequestForQuoteHeader
	@ManyToOne
	private RequestForQuoteHeader requestForQuoteHeader;

	//bi-directional many-to-one association to RfqSupplierMapping
	@OneToMany(mappedBy="rfqPrMap")
	private List<RfqSupplierMapping> rfqSupplierMappings;

	//bi-directional many-to-one association to SupplierQuoteRfqItemPriceMap
	@OneToMany(mappedBy="rfqPrMap")
	private List<SupplierQuoteRfqItemPriceMap> supplierQuoteRfqItemPriceMaps;

	public RfqPrMap() {
	}

	public String getRfqItemLineId() {
		return this.rfqItemLineId;
	}

	public void setRfqItemLineId(String rfqItemLineId) {
		this.rfqItemLineId = rfqItemLineId;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public int getPrItemAllocatedQuantity() {
		return this.prItemAllocatedQuantity;
	}

	public void setPrItemAllocatedQuantity(int prItemAllocatedQuantity) {
		this.prItemAllocatedQuantity = prItemAllocatedQuantity;
	}

	public String getPrItemCode() {
		return this.prItemCode;
	}

	public void setPrItemCode(String prItemCode) {
		this.prItemCode = prItemCode;
	}

	public String getPrItemCodePrefix() {
		return this.prItemCodePrefix;
	}

	public void setPrItemCodePrefix(String prItemCodePrefix) {
		this.prItemCodePrefix = prItemCodePrefix;
	}

	public String getRfqItemStatus() {
		return this.rfqItemStatus;
	}

	public void setRfqItemStatus(String rfqItemStatus) {
		this.rfqItemStatus = rfqItemStatus;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<PurchaseOrderRfqItemMap> getPurchaseOrderRfqItemMaps() {
		return this.purchaseOrderRfqItemMaps;
	}

	public void setPurchaseOrderRfqItemMaps(List<PurchaseOrderRfqItemMap> purchaseOrderRfqItemMaps) {
		this.purchaseOrderRfqItemMaps = purchaseOrderRfqItemMaps;
	}

	public PurchaseOrderRfqItemMap addPurchaseOrderRfqItemMap(PurchaseOrderRfqItemMap purchaseOrderRfqItemMap) {
		getPurchaseOrderRfqItemMaps().add(purchaseOrderRfqItemMap);
		purchaseOrderRfqItemMap.setRfqPrMap(this);

		return purchaseOrderRfqItemMap;
	}

	public PurchaseOrderRfqItemMap removePurchaseOrderRfqItemMap(PurchaseOrderRfqItemMap purchaseOrderRfqItemMap) {
		getPurchaseOrderRfqItemMaps().remove(purchaseOrderRfqItemMap);
		purchaseOrderRfqItemMap.setRfqPrMap(null);

		return purchaseOrderRfqItemMap;
	}

	public List<RfqItemSupplierMapping> getRfqItemSupplierMappings() {
		return this.rfqItemSupplierMappings;
	}

	public void setRfqItemSupplierMappings(List<RfqItemSupplierMapping> rfqItemSupplierMappings) {
		this.rfqItemSupplierMappings = rfqItemSupplierMappings;
	}

	public RfqItemSupplierMapping addRfqItemSupplierMapping(RfqItemSupplierMapping rfqItemSupplierMapping) {
		getRfqItemSupplierMappings().add(rfqItemSupplierMapping);
		rfqItemSupplierMapping.setRfqPrMap(this);

		return rfqItemSupplierMapping;
	}

	public RfqItemSupplierMapping removeRfqItemSupplierMapping(RfqItemSupplierMapping rfqItemSupplierMapping) {
		getRfqItemSupplierMappings().remove(rfqItemSupplierMapping);
		rfqItemSupplierMapping.setRfqPrMap(null);

		return rfqItemSupplierMapping;
	}

	public PurchaseRequestHeader getPurchaseRequestHeader() {
		return this.purchaseRequestHeader;
	}

	public void setPurchaseRequestHeader(PurchaseRequestHeader purchaseRequestHeader) {
		this.purchaseRequestHeader = purchaseRequestHeader;
	}

	public PurchaseRequestItem getPurchaseRequestItem() {
		return this.purchaseRequestItem;
	}

	public void setPurchaseRequestItem(PurchaseRequestItem purchaseRequestItem) {
		this.purchaseRequestItem = purchaseRequestItem;
	}

	public RequestForQuoteHeader getRequestForQuoteHeader() {
		return this.requestForQuoteHeader;
	}

	public void setRequestForQuoteHeader(RequestForQuoteHeader requestForQuoteHeader) {
		this.requestForQuoteHeader = requestForQuoteHeader;
	}

	public List<RfqSupplierMapping> getRfqSupplierMappings() {
		return this.rfqSupplierMappings;
	}

	public void setRfqSupplierMappings(List<RfqSupplierMapping> rfqSupplierMappings) {
		this.rfqSupplierMappings = rfqSupplierMappings;
	}

	public RfqSupplierMapping addRfqSupplierMapping(RfqSupplierMapping rfqSupplierMapping) {
		getRfqSupplierMappings().add(rfqSupplierMapping);
		rfqSupplierMapping.setRfqPrMap(this);

		return rfqSupplierMapping;
	}

	public RfqSupplierMapping removeRfqSupplierMapping(RfqSupplierMapping rfqSupplierMapping) {
		getRfqSupplierMappings().remove(rfqSupplierMapping);
		rfqSupplierMapping.setRfqPrMap(null);

		return rfqSupplierMapping;
	}

	public List<SupplierQuoteRfqItemPriceMap> getSupplierQuoteRfqItemPriceMaps() {
		return this.supplierQuoteRfqItemPriceMaps;
	}

	public void setSupplierQuoteRfqItemPriceMaps(List<SupplierQuoteRfqItemPriceMap> supplierQuoteRfqItemPriceMaps) {
		this.supplierQuoteRfqItemPriceMaps = supplierQuoteRfqItemPriceMaps;
	}

	public SupplierQuoteRfqItemPriceMap addSupplierQuoteRfqItemPriceMap(SupplierQuoteRfqItemPriceMap supplierQuoteRfqItemPriceMap) {
		getSupplierQuoteRfqItemPriceMaps().add(supplierQuoteRfqItemPriceMap);
		supplierQuoteRfqItemPriceMap.setRfqPrMap(this);

		return supplierQuoteRfqItemPriceMap;
	}

	public SupplierQuoteRfqItemPriceMap removeSupplierQuoteRfqItemPriceMap(SupplierQuoteRfqItemPriceMap supplierQuoteRfqItemPriceMap) {
		getSupplierQuoteRfqItemPriceMaps().remove(supplierQuoteRfqItemPriceMap);
		supplierQuoteRfqItemPriceMap.setRfqPrMap(null);

		return supplierQuoteRfqItemPriceMap;
	}

}