package com.instatenders.orusource.domain.model.configuration;

import org.apache.commons.lang3.builder.ToStringBuilder;

//TODO test impl:Change this class appropriately during implementation
public class ApprovalType {
    private String approvalType;
    private String approvalTypeDescription;

    public ApprovalType(String approvalType, String approvalTypeDescription) {
        this.approvalType = approvalType;
        this.approvalTypeDescription = approvalTypeDescription;
    }

    @Override
    public String toString() {
        ToStringBuilder builder = new ToStringBuilder(this);
        builder.append("approvalType", approvalType);
        builder.append("approvalTypeDescription", approvalTypeDescription);
        return builder.toString();
    }
}
