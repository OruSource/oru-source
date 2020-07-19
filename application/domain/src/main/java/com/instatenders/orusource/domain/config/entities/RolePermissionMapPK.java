package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * The primary key class for the role_permission_map database table.
 * 
 */
@Embeddable
public class RolePermissionMapPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_role_name", insertable=false, updatable=false)
	private String userRoleName;

	@Column(name="permission_code", insertable=false, updatable=false)
	private String permissionCode;

	public RolePermissionMapPK() {
	}
	public String getUserRoleName() {
		return this.userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	public String getPermissionCode() {
		return this.permissionCode;
	}
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RolePermissionMapPK)) {
			return false;
		}
		RolePermissionMapPK castOther = (RolePermissionMapPK)other;
		return 
			this.userRoleName.equals(castOther.userRoleName)
			&& this.permissionCode.equals(castOther.permissionCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userRoleName.hashCode();
		hash = hash * prime + this.permissionCode.hashCode();
		
		return hash;
	}
}