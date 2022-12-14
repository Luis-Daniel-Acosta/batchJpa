package com.bosonit.batchJpa.job;

import com.bosonit.batchJpa.domain.CreditCard;
import com.bosonit.batchJpa.domain.CreditCardRisk;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

//El Processor se encargará de recibir una CreditCard y entregar una CreditCardRisk
public class CreditCardItemProcessor implements ItemProcessor<CreditCard, CreditCardRisk> {
    @Override
    public CreditCardRisk process(CreditCard creditCard) throws Exception {
        LocalDate today = LocalDate.now();
        LocalDate lastDate = creditCard.getLastPay().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long daysBetween = DAYS.between(today, lastDate);

        int risk;
        if (daysBetween >= 20) {
            risk = CreditCardRisk.HIGH;
        } else if (daysBetween > 10) {
            risk = CreditCardRisk.LOW;;
        }else {
            risk = CreditCardRisk.NORMAL;;
        }
        CreditCardRisk creditCardRisk = new CreditCardRisk(creditCard, new Date(), risk);
        return creditCardRisk;
    }
}
