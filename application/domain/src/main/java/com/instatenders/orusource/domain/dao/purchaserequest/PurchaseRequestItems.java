package com.instatenders.orusource.domain.dao.purchaserequest;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="purchase_request_items")
//this table has FK constraint
public class PurchaseRequestItems {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="pr_item_line_id")
	private String PRItemLineID;
	
	@Column(name="purchase_request_id")
	private String PRId;
	
	@Column(name="item_category_code")
	private String itemCategoryCode;

	@Column(name="item_sub_category_code")
	private String itemSubCategoryCode;
	
	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_code_prefix")
	private String itemCodePrefix;
	
	@Column(name="pr_item_quantity")
	private Long PRItemQuantity;
	
	@Column(name="allocated_quantity")
	private Long allocatedQuantity;
	
	@Column(name="balance_quantity")
	private Long balanceQuantity;

	@Column(name="item_prev_unit_price")
	private BigDecimal itemPrevUnitPrice;
	
	@Column(name="item_total_price")
	private BigDecimal itemTotalPrice;

	@Column(name="item_prev_supplier")
	private String itemPrevSupplier;
	
	@Column(name="item_prev_purchase_date")
	private Date itemPrevPurchaseDate;

	@Column(name="item_status")
	private String itemStatus;
	
	@Column(name="create_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimeStamp;
	
	@Column(name="update_timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimeStamp;

	public String getPRItemLineID() {
		return PRItemLineID;
	}

	public void setPRItemLineID(String pRItemLineID) {
		PRItemLineID = pRItemLineID;
	}

	public String getPRId() {
		return PRId;
	}

	public void setPRId(String pRId) {
		PRId = pRId;
	}

	public String getItemCategoryCode() {
		return itemCategoryCode;
	}

	public void setItemCategoryCode(String itemCategoryCode) {
		this.itemCategoryCode = itemCategoryCode;
	}

	public String getItemSubCategoryCode() {
		return itemSubCategoryCode;
	}

	public void setItemSubCategoryCode(String itemSubCategoryCode) {
		this.itemSubCategoryCode = itemSubCategoryCode;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCodePrefix() {
		return itemCodePrefix;
	}

	public void setItemCodePrefix(String itemCodePrefix) {
		this.itemCodePrefix = itemCodePrefix;
	}

	public Long getPRItemQuantity() {
		return PRItemQuantity;
	}

	public void setPRItemQuantity(Long pRItemQuantity) {
		PRItemQuantity = pRItemQuantity;
	}

	public Long getAllocatedQuantity() {
		return allocatedQuantity;
	}

	public void setAllocatedQuantity(Long allocatedQuantity) {
		this.allocatedQuantity = allocatedQuantity;
	}

	public Long getBalanceQuantity() {
		return balanceQuantity;
	}

	public void setBalanceQuantity(Long balanceQuantity) {
		this.balanceQuantity = balanceQuantity;
	}

	public BigDecimal getItemPrevUnitPrice() {
		return itemPrevUnitPrice;
	}

	public void setItemPrevUnitPrice(BigDecimal itemPrevUnitPrice) {
		this.itemPrevUnitPrice = itemPrevUnitPrice;
	}

	public BigDecimal getItemTotalPrice() {
		return itemTotalPrice;
	}

	public void setItemTotalPrice(BigDecimal itemTotalPrice) {
		this.itemTotalPrice = itemTotalPrice;
	}

	public String getItemPrevSupplier() {
		return itemPrevSupplier;
	}

	public void setItemPrevSupplier(String itemPrevSupplier) {
		this.itemPrevSupplier = itemPrevSupplier;
	}

	public Date getItemPrevPurchaseDate() {
		return itemPrevPurchaseDate;
	}

	public void setItemPrevPurchaseDate(Date itemPrevPurchaseDate) {
		this.itemPrevPurchaseDate = itemPrevPurchaseDate;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Date getCreateTimeStamp() {
		return createTimeStamp;
	}

	public void setCreateTimeStamp(Date createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public Date getUpdateTimeStamp() {
		return updateTimeStamp;
	}

	public void setUpdateTimeStamp(Date updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}

	@Override
	public String toString() {
		return "PRItems [PRItemLineID=" + PRItemLineID + ", PRId=" + PRId + ", itemCategoryCode=" + itemCategoryCode
				+ ", itemSubCategoryCode=" + itemSubCategoryCode + ", itemCode=" + itemCode + ", itemCodePrefix="
				+ itemCodePrefix + ", PRItemQuantity=" + PRItemQuantity + ", allocatedQuantity=" + allocatedQuantity
				+ ", balanceQuantity=" + balanceQuantity + ", itemPrevUnitPrice=" + itemPrevUnitPrice
				+ ", itemTotalPrice=" + itemTotalPrice + ", itemPrevSupplier=" + itemPrevSupplier
				+ ", itemPrevPurchaseDate=" + itemPrevPurchaseDate + ", itemStatus=" + itemStatus + ", createTimeStamp="
				+ createTimeStamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
