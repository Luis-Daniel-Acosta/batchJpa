package com.bosonit.batchJpa.job;

import com.bosonit.batchJpa.domain.CreditCard;
import com.bosonit.batchJpa.repository.CreditCardRepository;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
//Definimos el reader que implementará ItemReader y que usará un repositorio de Spring para obtener todas las CreditCard
public class CreditCardItemReader implements ItemReader<CreditCard> {
    @Autowired
    CreditCardRepository respository;

    private Iterator<CreditCard> usersIterator;

    //Con la anotación BeforeStep realizamos una operación de lectura sobre la base de datos previo a iniciar el Reader.
    @BeforeStep
    public void before(StepExecution stepExecution) {
        usersIterator = respository.findAll().iterator();
    }

    @Override//El método read() irá entregando cada ítem de la lista al Processor
    public CreditCard read()  {
        if (usersIterator != null && usersIterator.hasNext()) {
            return usersIterator.next();
        } else {
            return null;
        }
    }
}
