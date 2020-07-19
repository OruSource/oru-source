package com.instatenders.orusource.domain.service.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the platform_user_credentials database table.
 * 
 */
@Entity
@Table(name="platform_user_credentials")
public class PlatformUserCredential implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="platform_user_id")
	private int platformUserId;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	private String password;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	private String username;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader1;

	//bi-directional many-to-one association to PlatformUserHeader
	@ManyToOne
	private PlatformUserHeader platformUserHeader2;

	//bi-directional one-to-one association to PlatformUserHeader
	@OneToOne
	private PlatformUserHeader platformUserHeader3;

	public PlatformUserCredential() {
	}

	public int getPlatformUserId() {
		return this.platformUserId;
	}

	public void setPlatformUserId(int platformUserId) {
		this.platformUserId = platformUserId;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public PlatformUserHeader getPlatformUserHeader1() {
		return this.platformUserHeader1;
	}

	public void setPlatformUserHeader1(PlatformUserHeader platformUserHeader1) {
		this.platformUserHeader1 = platformUserHeader1;
	}

	public PlatformUserHeader getPlatformUserHeader2() {
		return this.platformUserHeader2;
	}

	public void setPlatformUserHeader2(PlatformUserHeader platformUserHeader2) {
		this.platformUserHeader2 = platformUserHeader2;
	}

	public PlatformUserHeader getPlatformUserHeader3() {
		return this.platformUserHeader3;
	}

	public void setPlatformUserHeader3(PlatformUserHeader platformUserHeader3) {
		this.platformUserHeader3 = platformUserHeader3;
	}

}