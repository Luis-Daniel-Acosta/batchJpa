package com.bosonit.batchJpa.listener;

import com.bosonit.batchJpa.domain.CreditCard;
import com.bosonit.batchJpa.domain.CreditCardRisk;
import lombok.extern.log4j.Log4j2;
import org.springframework.batch.core.ItemProcessListener;

@Log4j2
public class CreditCardItemProcessListener implements ItemProcessListener<CreditCard, CreditCardRisk> {


    @Override
    public void beforeProcess(CreditCard creditCard) {
        log.info("beforeProcess");
    }

    @Override
    public void afterProcess(CreditCard creditCard, CreditCardRisk creditCardRisk) {
        log.info("afterProcess: " + creditCard + " ---> " + creditCardRisk);
    }

    @Override
    public void onProcessError(CreditCard creditCard, Exception e) {
        log.info("onProcessError");
    }
}
