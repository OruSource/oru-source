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
 * The persistent class for the dim_platform_user_permissions database table.
 * 
 */
@Entity
@Table(name="dim_platform_user_permissions")
public class DimPlatformUserPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="permission_code")
	private String permissionCode;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="permission_description")
	private String permissionDescription;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to RolePermissionMap
	@OneToMany(mappedBy="dimPlatformUserPermission")
	private List<RolePermissionMap> rolePermissionMaps;

	public DimPlatformUserPermission() {
	}

	public String getPermissionCode() {
		return this.permissionCode;
	}

	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getPermissionDescription() {
		return this.permissionDescription;
	}

	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<RolePermissionMap> getRolePermissionMaps() {
		return this.rolePermissionMaps;
	}

	public void setRolePermissionMaps(List<RolePermissionMap> rolePermissionMaps) {
		this.rolePermissionMaps = rolePermissionMaps;
	}

	public RolePermissionMap addRolePermissionMap(RolePermissionMap rolePermissionMap) {
		getRolePermissionMaps().add(rolePermissionMap);
		rolePermissionMap.setDimPlatformUserPermission(this);

		return rolePermissionMap;
	}

	public RolePermissionMap removeRolePermissionMap(RolePermissionMap rolePermissionMap) {
		getRolePermissionMaps().remove(rolePermissionMap);
		rolePermissionMap.setDimPlatformUserPermission(null);

		return rolePermissionMap;
	}

}