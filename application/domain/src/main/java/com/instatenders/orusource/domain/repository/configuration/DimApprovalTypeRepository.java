package com.instatenders.orusource.domain.repository.configuration;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instatenders.orusource.domain.entity.configuration.DimApprovalType;

public interface DimApprovalTypeRepository extends JpaRepository<DimApprovalType, String>  {
}
