package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the dim_item_sub_category database table.
 * 
 */
@Entity
@Table(name="dim_item_sub_category")
public class DimItemSubCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="item_sub_category_code_prefix")
	private String itemSubCategoryCodePrefix;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="item_sub_category_code")
	private String itemSubCategoryCode;

	@Column(name="item_sub_category_desc")
	private String itemSubCategoryDesc;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to DimItem
	@OneToMany(mappedBy="dimItemSubCategory")
	private List<DimItem> dimItems;

	//bi-directional many-to-one association to DimItemCategory
	@ManyToOne
	private DimItemCategory dimItemCategory;

	public DimItemSubCategory() {
	}

	public String getItemSubCategoryCodePrefix() {
		return this.itemSubCategoryCodePrefix;
	}

	public void setItemSubCategoryCodePrefix(String itemSubCategoryCodePrefix) {
		this.itemSubCategoryCodePrefix = itemSubCategoryCodePrefix;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getItemSubCategoryCode() {
		return this.itemSubCategoryCode;
	}

	public void setItemSubCategoryCode(String itemSubCategoryCode) {
		this.itemSubCategoryCode = itemSubCategoryCode;
	}

	public String getItemSubCategoryDesc() {
		return this.itemSubCategoryDesc;
	}

	public void setItemSubCategoryDesc(String itemSubCategoryDesc) {
		this.itemSubCategoryDesc = itemSubCategoryDesc;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<DimItem> getDimItems() {
		return this.dimItems;
	}

	public void setDimItems(List<DimItem> dimItems) {
		this.dimItems = dimItems;
	}

	public DimItem addDimItem(DimItem dimItem) {
		getDimItems().add(dimItem);
		dimItem.setDimItemSubCategory(this);

		return dimItem;
	}

	public DimItem removeDimItem(DimItem dimItem) {
		getDimItems().remove(dimItem);
		dimItem.setDimItemSubCategory(null);

		return dimItem;
	}

	public DimItemCategory getDimItemCategory() {
		return this.dimItemCategory;
	}

	public void setDimItemCategory(DimItemCategory dimItemCategory) {
		this.dimItemCategory = dimItemCategory;
	}

}