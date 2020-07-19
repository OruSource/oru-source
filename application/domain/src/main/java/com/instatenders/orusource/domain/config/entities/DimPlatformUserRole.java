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
 * The persistent class for the dim_platform_user_roles database table.
 * 
 */
@Entity
@Table(name="dim_platform_user_roles")
public class DimPlatformUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_role_name")
	private String userRoleName;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	@Column(name="user_role_description")
	private String userRoleDescription;

	//bi-directional many-to-one association to RolePermissionMap
	@OneToMany(mappedBy="dimPlatformUserRole")
	private List<RolePermissionMap> rolePermissionMaps;

	public DimPlatformUserRole() {
	}

	public String getUserRoleName() {
		return this.userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getUserRoleDescription() {
		return this.userRoleDescription;
	}

	public void setUserRoleDescription(String userRoleDescription) {
		this.userRoleDescription = userRoleDescription;
	}

	public List<RolePermissionMap> getRolePermissionMaps() {
		return this.rolePermissionMaps;
	}

	public void setRolePermissionMaps(List<RolePermissionMap> rolePermissionMaps) {
		this.rolePermissionMaps = rolePermissionMaps;
	}

	public RolePermissionMap addRolePermissionMap(RolePermissionMap rolePermissionMap) {
		getRolePermissionMaps().add(rolePermissionMap);
		rolePermissionMap.setDimPlatformUserRole(this);

		return rolePermissionMap;
	}

	public RolePermissionMap removeRolePermissionMap(RolePermissionMap rolePermissionMap) {
		getRolePermissionMaps().remove(rolePermissionMap);
		rolePermissionMap.setDimPlatformUserRole(null);

		return rolePermissionMap;
	}

}