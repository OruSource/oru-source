package com.instatenders.orusource.domain.entity.configuration;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.instatenders.orusource.domain.entity.configuration.DimPlatformUserPermissions;
import com.instatenders.orusource.domain.entity.configuration.DimPlatformUserRoles;
import com.instatenders.orusource.domain.entity.configuration.RolePermissionMapPK;

@Entity
@Table
public class RolePermissionMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RolePermissionMapPK id;

	@Column
	private String createdBy;

	@Column
	private String updatedBy;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@Column(insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERMISSION_CODE", insertable = false, updatable = false)
	private DimPlatformUserPermissions dimPlatformUserPermissions;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ROLE_NAME", insertable = false, updatable = false)
	private DimPlatformUserRoles dimPlatformUserRoles;

	public RolePermissionMapPK getId() {
		return this.id;
	}

	public void setId(RolePermissionMapPK id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public DimPlatformUserPermissions getDimPlatformUserPermission() {
		return this.dimPlatformUserPermissions;
	}

	public void setDimPlatformUserPermission(DimPlatformUserPermissions dimPlatformUserPermissions) {
		this.dimPlatformUserPermissions = dimPlatformUserPermissions;
	}

	public DimPlatformUserRoles getDimPlatformUserRole() {
		return this.dimPlatformUserRoles;
	}

	public void setDimPlatformUserRole(DimPlatformUserRoles dimPlatformUserRoles) {
		this.dimPlatformUserRoles = dimPlatformUserRoles;
	}
}
