package com.bosonit.batchJpa.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Data
@Entity
@Table(name="credit_card")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="card_number")
    private Long cardNumber;
    @Column(name="last_pay")
    private Date lastPay;


//    public CreditCard() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getCardNumber() {
//        return cardNumber;
//    }
//
//    public void setCardNumber(Long cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    public Date getLastPay() {
//        return lastPay;
//    }
//
//    public void setLastPay(Date lastPay) {
//        this.lastPay = lastPay;
//    }
//
//    @Override
//    public String toString() {
//        return "CreditCard{" +
//                "id=" + id +
//                ", cardNumber=" + cardNumber +
//                ", lastPay=" + lastPay +
//                '}';
//    }
//
//    public CreditCard(Long id, Long cardNumber, Date lastPay) {
//        this.id = id;
//        this.cardNumber = cardNumber;
//        this.lastPay = lastPay;
//    }
}
