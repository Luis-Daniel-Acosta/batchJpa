package com.bosonit.batchJpa.repository;

import com.bosonit.batchJpa.domain.CreditCardRisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRiskRespository extends JpaRepository<CreditCardRisk,Long> {
}
