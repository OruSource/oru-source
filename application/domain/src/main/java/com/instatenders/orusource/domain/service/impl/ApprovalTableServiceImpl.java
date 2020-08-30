package com.instatenders.orusource.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.instatenders.orusource.domain.entity.configuration.DimApprovalType;
import com.instatenders.orusource.domain.model.configuration.ApprovalType;
import com.instatenders.orusource.domain.model.service.CustomerContact;
import com.instatenders.orusource.domain.repository.configuration.DimApprovalTypeRepository;
import com.instatenders.orusource.domain.repository.service.SupplierCustomerRefContactRepository;
import com.instatenders.orusource.domain.entity.service.SupplierCustomerRefContact;
import com.instatenders.orusource.domain.service.ApprovalTableService;

//TODO test impl:Remove this class and add appropriately during implementation
@Service
public class ApprovalTableServiceImpl implements ApprovalTableService {
    private final DimApprovalTypeRepository dimApprovalTypeRepository;
    private final SupplierCustomerRefContactRepository supplierCustomerRefContactRepository;

    public ApprovalTableServiceImpl(DimApprovalTypeRepository dimApprovalTypeRepository,
            SupplierCustomerRefContactRepository supplierCustomerRefContactRepository) {
        this.dimApprovalTypeRepository = dimApprovalTypeRepository;
        this.supplierCustomerRefContactRepository = supplierCustomerRefContactRepository;
    }

    @Override
    @Transactional(transactionManager="configTransactionManager")
    public List<ApprovalType> getApprovalType()
    {
        List<DimApprovalType> dimApprovalTypes = dimApprovalTypeRepository.findAll();
        List<ApprovalType> approvalTypes = new ArrayList<>();
        ApprovalType approvalType = null;
        for (DimApprovalType dimApprovalType: dimApprovalTypes) {
            approvalType = new ApprovalType(dimApprovalType.getApprovalType(),
                    dimApprovalType.getApprovalTypeDescription());
            approvalTypes.add(approvalType);
        }
        return approvalTypes;
    }

    @Override
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
