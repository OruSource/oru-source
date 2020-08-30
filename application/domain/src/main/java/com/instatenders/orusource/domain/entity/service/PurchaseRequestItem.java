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
 * The persistent class for the purchase_request_items database table.
 * 
 */
@Entity
@Table(name="purchase_request_items")
public class PurchaseRequestItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pr_item_line_id")
	private String prItemLineId;

	@Column(name="allocated_quantity")
	private int allocatedQuantity;

	@Column(name="balance_quantity")
	private int balanceQuantity;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="item_category_code")
	private String itemCategoryCode;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_code_prefix")
	private String itemCodePrefix;

	@Temporal(TemporalType.DATE)
	@Column(name="item_prev_purchase_date")
	private Date itemPrevPurchaseDate;

	@Column(name="item_prev_supplier")
	private String itemPrevSupplier;

	@Column(name="item_prev_unit_price")
	private BigDecimal itemPrevUnitPrice;

	@Column(name="item_status")
	private String itemStatus;

	@Column(name="item_sub_category_code")
	private String itemSubCategoryCode;

	@Column(name="item_total_price")
	private BigDecimal itemTotalPrice;

	@Column(name="pr_item_quantity")
	private int prItemQuantity;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to CustomerQuotePrItemPriceMap
	@OneToMany(mappedBy="purchaseRequestItem")
	private List<CustomerQuotePrItemPriceMap> customerQuotePrItemPriceMaps;

	//bi-directional many-to-one association to PurchaseRequestHeader
	@ManyToOne
	private PurchaseRequestHeader purchaseRequestHeader;

	//bi-directional many-to-one association to RfqPrMap
	@OneToMany(mappedBy="purchaseRequestItem")
	private List<RfqPrMap> rfqPrMaps;

	public PurchaseRequestItem() {
	}

	public String getPrItemLineId() {
		return this.prItemLineId;
	}

	public void setPrItemLineId(String prItemLineId) {
		this.prItemLineId = prItemLineId;
	}

	public int getAllocatedQuantity() {
		return this.allocatedQuantity;
	}

	public void setAllocatedQuantity(int allocatedQuantity) {
		this.allocatedQuantity = allocatedQuantity;
	}

	public int getBalanceQuantity() {
		return this.balanceQuantity;
	}

	public void setBalanceQuantity(int balanceQuantity) {
		this.balanceQuantity = balanceQuantity;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getItemCategoryCode() {
		return this.itemCategoryCode;
	}

	public void setItemCategoryCode(String itemCategoryCode) {
		this.itemCategoryCode = itemCategoryCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCodePrefix() {
		return this.itemCodePrefix;
	}

	public void setItemCodePrefix(String itemCodePrefix) {
		this.itemCodePrefix = itemCodePrefix;
	}

	public Date getItemPrevPurchaseDate() {
		return this.itemPrevPurchaseDate;
	}

	public void setItemPrevPurchaseDate(Date itemPrevPurchaseDate) {
		this.itemPrevPurchaseDate = itemPrevPurchaseDate;
	}

	public String getItemPrevSupplier() {
		return this.itemPrevSupplier;
	}

	public void setItemPrevSupplier(String itemPrevSupplier) {
		this.itemPrevSupplier = itemPrevSupplier;
	}

	public BigDecimal getItemPrevUnitPrice() {
		return this.itemPrevUnitPrice;
	}

	public void setItemPrevUnitPrice(BigDecimal itemPrevUnitPrice) {
		this.itemPrevUnitPrice = itemPrevUnitPrice;
	}

	public String getItemStatus() {
		return this.itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getItemSubCategoryCode() {
		return this.itemSubCategoryCode;
	}

	public void setItemSubCategoryCode(String itemSubCategoryCode) {
		this.itemSubCategoryCode = itemSubCategoryCode;
	}

	public BigDecimal getItemTotalPrice() {
		return this.itemTotalPrice;
	}

	public void setItemTotalPrice(BigDecimal itemTotalPrice) {
		this.itemTotalPrice = itemTotalPrice;
	}

	public int getPrItemQuantity() {
		return this.prItemQuantity;
	}

	public void setPrItemQuantity(int prItemQuantity) {
		this.prItemQuantity = prItemQuantity;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<CustomerQuotePrItemPriceMap> getCustomerQuotePrItemPriceMaps() {
		return this.customerQuotePrItemPriceMaps;
	}

	public void setCustomerQuotePrItemPriceMaps(List<CustomerQuotePrItemPriceMap> customerQuotePrItemPriceMaps) {
		this.customerQuotePrItemPriceMaps = customerQuotePrItemPriceMaps;
	}

	public CustomerQuotePrItemPriceMap addCustomerQuotePrItemPriceMap(CustomerQuotePrItemPriceMap customerQuotePrItemPriceMap) {
		getCustomerQuotePrItemPriceMaps().add(customerQuotePrItemPriceMap);
		customerQuotePrItemPriceMap.setPurchaseRequestItem(this);

		return customerQuotePrItemPriceMap;
	}

	public CustomerQuotePrItemPriceMap removeCustomerQuotePrItemPriceMap(CustomerQuotePrItemPriceMap customerQuotePrItemPriceMap) {
		getCustomerQuotePrItemPriceMaps().remove(customerQuotePrItemPriceMap);
		customerQuotePrItemPriceMap.setPurchaseRequestItem(null);

		return customerQuotePrItemPriceMap;
	}

	public PurchaseRequestHeader getPurchaseRequestHeader() {
		return this.purchaseRequestHeader;
	}

	public void setPurchaseRequestHeader(PurchaseRequestHeader purchaseRequestHeader) {
		this.purchaseRequestHeader = purchaseRequestHeader;
	}

	public List<RfqPrMap> getRfqPrMaps() {
		return this.rfqPrMaps;
	}

	public void setRfqPrMaps(List<RfqPrMap> rfqPrMaps) {
		this.rfqPrMaps = rfqPrMaps;
	}

	public RfqPrMap addRfqPrMap(RfqPrMap rfqPrMap) {
		getRfqPrMaps().add(rfqPrMap);
		rfqPrMap.setPurchaseRequestItem(this);

		return rfqPrMap;
	}

	public RfqPrMap removeRfqPrMap(RfqPrMap rfqPrMap) {
		getRfqPrMaps().remove(rfqPrMap);
		rfqPrMap.setPurchaseRequestItem(null);

		return rfqPrMap;
	}

}