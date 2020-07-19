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
 * The persistent class for the dim_unit_of_measurement database table.
 * 
 */
@Entity
@Table(name="dim_unit_of_measurement")
public class DimUnitOfMeasurement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="uom_name")
	private String uomName;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="uom_description")
	private String uomDescription;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to DimItem
	@OneToMany(mappedBy="dimUnitOfMeasurement")
	private List<DimItem> dimItems;

	public DimUnitOfMeasurement() {
	}

	public String getUomName() {
		return this.uomName;
	}

	public void setUomName(String uomName) {
		this.uomName = uomName;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getUomDescription() {
		return this.uomDescription;
	}

	public void setUomDescription(String uomDescription) {
		this.uomDescription = uomDescription;
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
		dimItem.setDimUnitOfMeasurement(this);

		return dimItem;
	}

	public DimItem removeDimItem(DimItem dimItem) {
		getDimItems().remove(dimItem);
		dimItem.setDimUnitOfMeasurement(null);

		return dimItem;
	}

}