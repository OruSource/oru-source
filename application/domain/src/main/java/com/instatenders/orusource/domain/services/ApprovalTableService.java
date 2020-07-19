package com.instatenders.orusource.domain.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.instatenders.orusource.domain.config.entities.DimApprovalType;
import com.instatenders.orusource.domain.config.repositories.ApprovalTypeRepository;
import com.instatenders.orusource.domain.service.entities.SupplierCustomerRefContact;
import com.instatenders.orusource.domain.service.repositories.SupplierCustomerRefContactRepository;
import com.instatenders.orusource.domain.services.model.ApprovalType;
import com.instatenders.orusource.domain.services.model.CustomerContact;

//TODO test impl:Remove this class and add appropriately during implementation
@Service
public class ApprovalTableService {
    @Autowired
    private ApprovalTypeRepository approvalTypeRepository;

    @Autowired
    private SupplierCustomerRefContactRepository supplierCustomerRefContactRepository;

    @Transactional(transactionManager="configTransactionManager")
    public List<ApprovalType> getApprovalType()
    {
        List<DimApprovalType> dimApprovalTypes = approvalTypeRepository.findAll();
        List<ApprovalType> approvalTypes = new ArrayList<>();
        ApprovalType approvalType = null;
        for (DimApprovalType dimApprovalType: dimApprovalTypes) {
            approvalType = new ApprovalType(dimApprovalType.getApprovalType(),
                    dimApprovalType.getApprovalTypeDescription());
            approvalTypes.add(approvalType);
        }
        return approvalTypes;
    }

    @Transactional(transactionManager="serviceTransactionManager")
    public List<CustomerContact> getCustomerRefContact()
    {
        List<SupplierCustomerRefContact> supplierCustomerRefContacts = supplierCustomerRefContactRepository.findAll();
        List<CustomerContact> customerContacts = new ArrayList<>();
        CustomerContact customerContact = null;
        for (SupplierCustomerRefContact supplierCustomerRefContact: supplierCustomerRefContacts) {
            customerContact = new CustomerContact(supplierCustomerRefContact.getSupplierCustomerRefContactId(),
                    supplierCustomerRefContact.getEmailAddress(),
                    supplierCustomerRefContact.getFirstName(),
                    supplierCustomerRefContact.getLandlineNumber(),
                    supplierCustomerRefContact.getLandlineStdCode(),
                    supplierCustomerRefContact.getLastName(),
                    supplierCustomerRefContact.getMobileNumber(),
                    supplierCustomerRefContact.getSalutation());
            customerContacts.add(customerContact);
        }
        return customerContacts;
    }
}
