package com.instatenders.orusource.domain.repository.service;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instatenders.orusource.domain.entity.service.SupplierCustomerRefContact;

public interface SupplierCustomerRefContactRepository extends JpaRepository<SupplierCustomerRefContact, BigDecimal> {
}
