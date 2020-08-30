package com.instatenders.orusource.domain.model.service;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ToStringBuilder;

//TODO test impl:Change this class appropriately during implementation
public class CustomerContact {
    private BigDecimal supplierCustomerRefContactId;
    private String emailAddress;
    private String firstName;
    private String landlineNumber;
    private String landlineStdCode;
    private String lastName;
    private String mobileNumber;
    private String salutation;

    public CustomerContact(BigDecimal supplierCustomerRefContactId, String emailAddress, String firstName,
            String landlineNumber, String landlineStdCode, String lastName, String mobileNumber, String salutation) {
        this.supplierCustomerRefContactId = supplierCustomerRefContactId;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.landlineNumber = landlineNumber;
        this.landlineStdCode = landlineStdCode;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.salutation = salutation;
    }

    @Override
    public String toString() {
        ToStringBuilder builder = new ToStringBuilder(this);
        builder.append("supplierCustomerRefContactId", supplierCustomerRefContactId);
        builder.append("salutation", salutation);
        builder.append("firstName", firstName);
        builder.append("lastName", lastName);
        builder.append("emailAddress", emailAddress);
        builder.append("mobileNumber", mobileNumber);
        builder.append("landlineStdCode", landlineStdCode);
        builder.append("landlineNumber", landlineNumber);
        return builder.toString();
    }
}
