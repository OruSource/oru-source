package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the purchase_order_approver_map database table.
 */
@Embeddable
public class PurchaseOrderApproverMapPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "purchase_order_quote_map_id", insertable = false, updatable = false)
    private String purchaseOrderQuoteMapId;

    @Column(name = "approver_id", insertable = false, updatable = false)
    private int approverId;

    public PurchaseOrderApproverMapPK() {
    }

    public String getPurchaseOrderQuoteMapId() {
        return this.purchaseOrderQuoteMapId;
    }

    public void setPurchaseOrderQuoteMapId(String purchaseOrderQuoteMapId) {
        this.purchaseOrderQuoteMapId = purchaseOrderQuoteMapId;
    }

    public int getApproverId() {
        return this.approverId;
    }

    public void setApproverId(int approverId) {
        this.approverId = approverId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseOrderApproverMapPK)) {
            return false;
        }
        PurchaseOrderApproverMapPK castOther = (PurchaseOrderApproverMapPK)other;
        return this.purchaseOrderQuoteMapId.equals(castOther.purchaseOrderQuoteMapId) &&
                this.approverId == castOther.approverId;
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.purchaseOrderQuoteMapId.hashCode();
        hash = hash * prime + this.approverId;

        return hash;
    }
}