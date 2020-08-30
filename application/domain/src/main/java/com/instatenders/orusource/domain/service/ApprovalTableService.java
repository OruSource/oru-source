package com.instatenders.orusource.domain.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.instatenders.orusource.domain.model.configuration.ApprovalType;
import com.instatenders.orusource.domain.model.service.CustomerContact;

public interface ApprovalTableService {
    @Transactional(transactionManager="configTransactionManager")
    List<ApprovalType> getApprovalType();

    @Transactional(transactionManager="serviceTransactionManager")
    List<CustomerContact> getCustomerRefContact();
}
