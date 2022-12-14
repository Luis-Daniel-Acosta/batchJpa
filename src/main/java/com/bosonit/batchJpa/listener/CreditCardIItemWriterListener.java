package com.bosonit.batchJpa.listener;

import com.bosonit.batchJpa.domain.CreditCardRisk;
import lombok.extern.log4j.Log4j2;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

@Log4j2
public class CreditCardIItemWriterListener  implements ItemWriteListener<CreditCardRisk> {



    @Override
    public void beforeWrite(List<? extends CreditCardRisk> list) {
        log.info("beforeWrite");
    }


    @Override
    public void afterWrite(List<? extends CreditCardRisk> list) {
        for (CreditCardRisk creditCardRisk : list) {
            log.info("afterWrite :" + creditCardRisk.toString());
        }
    }

    @Override
    public void onWriteError(Exception e, List<? extends CreditCardRisk> list) {
        log.info("onWriteError");
    }
}
