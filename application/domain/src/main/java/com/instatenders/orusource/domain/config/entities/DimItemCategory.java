package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the dim_item_category database table.
 * 
 */
@Entity
@Table(name="dim_item_category")
public class DimItemCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="item_category_code_prefix")
	private String itemCategoryCodePrefix;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="item_category_code")
	private String itemCategoryCode;

	@Column(name="item_category_desc")
	private String itemCategoryDesc;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to DimItemSubCategory
	@OneToMany(mappedBy="dimItemCategory")
	private List<DimItemSubCategory> dimItemSubCategories;

	public DimItemCategory() {
	}

	public String getItemCategoryCodePrefix() {
		return this.itemCategoryCodePrefix;
	}

	public void setItemCategoryCodePrefix(String itemCategoryCodePrefix) {
		this.itemCategoryCodePrefix = itemCategoryCodePrefix;
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

	public String getItemCategoryDesc() {
		return this.itemCategoryDesc;
	}

	public void setItemCategoryDesc(String itemCategoryDesc) {
		this.itemCategoryDesc = itemCategoryDesc;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<DimItemSubCategory> getDimItemSubCategories() {
		return this.dimItemSubCategories;
	}

	public void setDimItemSubCategories(List<DimItemSubCategory> dimItemSubCategories) {
		this.dimItemSubCategories = dimItemSubCategories;
	}

	public DimItemSubCategory addDimItemSubCategory(DimItemSubCategory dimItemSubCategory) {
		getDimItemSubCategories().add(dimItemSubCategory);
		dimItemSubCategory.setDimItemCategory(this);

		return dimItemSubCategory;
	}

	public DimItemSubCategory removeDimItemSubCategory(DimItemSubCategory dimItemSubCategory) {
		getDimItemSubCategories().remove(dimItemSubCategory);
		dimItemSubCategory.setDimItemCategory(null);

		return dimItemSubCategory;
	}

}