package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the role_permission_map database table.
 * 
 */
@Entity
@Table(name="role_permission_map")
public class RolePermissionMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RolePermissionMapPK id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	@Column(name="updated_by")
	private String updatedBy;

	//bi-directional many-to-one association to DimPlatformUserPermission
	@ManyToOne
	private DimPlatformUserPermission dimPlatformUserPermission;

	//bi-directional many-to-one association to DimPlatformUserRole
	@ManyToOne
	private DimPlatformUserRole dimPlatformUserRole;

	public RolePermissionMap() {
	}

	public RolePermissionMapPK getId() {
		return this.id;
	}

	public void setId(RolePermissionMapPK id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public DimPlatformUserPermission getDimPlatformUserPermission() {
		return this.dimPlatformUserPermission;
	}

	public void setDimPlatformUserPermission(DimPlatformUserPermission dimPlatformUserPermission) {
		this.dimPlatformUserPermission = dimPlatformUserPermission;
	}

	public DimPlatformUserRole getDimPlatformUserRole() {
		return this.dimPlatformUserRole;
	}

	public void setDimPlatformUserRole(DimPlatformUserRole dimPlatformUserRole) {
		this.dimPlatformUserRole = dimPlatformUserRole;
	}

}