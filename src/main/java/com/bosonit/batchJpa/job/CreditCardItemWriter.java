package com.bosonit.batchJpa.job;

import com.bosonit.batchJpa.domain.CreditCardRisk;
import com.bosonit.batchJpa.repository.CreditCardRiskRespository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CreditCardItemWriter implements ItemWriter<CreditCardRisk> {

    @Autowired
    CreditCardRiskRespository respository;

    @Override
    public void write(List<? extends CreditCardRisk> list) throws Exception {
        respository.saveAll(list);
    }
}
