package com.bosonit.batchJpa.listener;

import com.bosonit.batchJpa.domain.CreditCard;
import lombok.extern.log4j.Log4j2;
import org.springframework.batch.core.ItemReadListener;

@Log4j2
public class CreditCardIItemReaderListener implements ItemReadListener<CreditCard> {



    @Override
    public void beforeRead() {
        log.info("beforeRead");
    }

    @Override
    public void afterRead(CreditCard creditCard) {
        log.info("afterRead: " + creditCard.toString());
    }

    @Override
    public void onReadError(Exception e) {
        log.info("onReadError");
    }
}
