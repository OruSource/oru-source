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
 * The persistent class for the dim_iso_currency database table.
 * 
 */
@Entity
@Table(name="dim_iso_currency")
public class DimIsoCurrency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="iso_currency_code")
	private String isoCurrencyCode;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="iso_currency_desc")
	private String isoCurrencyDesc;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to DimItem
	@OneToMany(mappedBy="dimIsoCurrency")
	private List<DimItem> dimItems;

	public DimIsoCurrency() {
	}

	public String getIsoCurrencyCode() {
		return this.isoCurrencyCode;
	}

	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getIsoCurrencyDesc() {
		return this.isoCurrencyDesc;
	}

	public void setIsoCurrencyDesc(String isoCurrencyDesc) {
		this.isoCurrencyDesc = isoCurrencyDesc;
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
		dimItem.setDimIsoCurrency(this);

		return dimItem;
	}

	public DimItem removeDimItem(DimItem dimItem) {
		getDimItems().remove(dimItem);
		dimItem.setDimIsoCurrency(null);

		return dimItem;
	}

}