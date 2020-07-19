package com.instatenders.orusource.domain.config.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the dim_activity database table.
 */
@Entity
@Table(name = "dim_activity")
public class DimActivity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "activity_code")
    private String activityCode;

    @Column(name = "activity_description")
    private String activityDescription;

    @Column(name = "activity_name")
    private String activityName;

    @Column(name = "create_timestamp")
    private Timestamp createTimestamp;

    @Column(name = "update_timestamp")
    private Timestamp updateTimestamp;

    public DimActivity() {
    }

    public String getActivityCode() {
        return this.activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getActivityDescription() {
        return this.activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public String getActivityName() {
        return this.activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
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

}