package com.instatenders.orusource.domain.services.model;

//TODO test impl:Remove this class and add appropriately during implementation
public class ApprovalType {
    private String approvalType;
    private String approvalTypeDescription;

    public ApprovalType(String approvalType, String approvalTypeDescription) {
        this.approvalType = approvalType;
        this.approvalTypeDescription = approvalTypeDescription;
    }

    @Override
    public String toString() {
        return "ApprovalType{" + "approvalType='" + approvalType + '\'' + ", approvalTypeDescription='" +
                approvalTypeDescription + '\'' + '}';
    }
}
