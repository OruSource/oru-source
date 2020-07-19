package com.instatenders.orusource.domain.services.model;

//TODO test impl:Remove this class and add appropriately during implementation
public class CustomerContact {
    private int supplierCustomerRefContactId;
    private String emailAddress;
    private String firstName;
    private String landlineNumber;
    private String landlineStdCode;
    private String lastName;
    private String mobileNumber;
    private String salutation;

    public CustomerContact(int supplierCustomerRefContactId, String emailAddress, String firstName,
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
        return "CustomerContact{" + "supplierCustomerRefContactId=" + supplierCustomerRefContactId +
                ", emailAddress='" + emailAddress + '\'' + ", firstName='" + firstName + '\'' + ", landlineNumber='" +
                landlineNumber + '\'' + ", landlineStdCode='" + landlineStdCode + '\'' + ", lastName='" + lastName +
                '\'' + ", mobileNumber='" + mobileNumber + '\'' + ", salutation='" + salutation + '\'' + '}';
    }
}
