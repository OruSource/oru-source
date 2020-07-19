package com.instatenders.orusource.domain.config.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instatenders.orusource.domain.config.entities.DimApprovalType;

public interface ApprovalTypeRepository extends JpaRepository<DimApprovalType, String>  {
}
