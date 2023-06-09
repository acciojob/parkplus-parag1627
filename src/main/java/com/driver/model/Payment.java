////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by FernFlower decompiler)
////
//
//package com.driver.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Payment {
//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.IDENTITY
//    )
//    private int id;
//    private boolean paymentCompleted;
//    private PaymentMode paymentMode;
//    @OneToOne
//    @JoinColumn
//    private Reservation reservation;
//
//    public Payment() {
//    }
//
//    public Payment(int id, Boolean paymentCompleted, PaymentMode paymentMode, Reservation reservation) {
//        this.id = id;
//        this.paymentCompleted = paymentCompleted;
//        this.paymentMode = paymentMode;
//        this.reservation = reservation;
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Boolean getPaymentCompleted() {
//        return this.paymentCompleted;
//    }
//
//    public void setPaymentCompleted(boolean paymentCompleted) {
//        this.paymentCompleted = paymentCompleted;
//    }
//
//    public PaymentMode getPaymentMode() {
//        return this.paymentMode;
//    }
//
//    public void setPaymentMode(PaymentMode paymentMode) {
//        this.paymentMode = paymentMode;
//    }
//
//    public Reservation getReservation() {
//        return this.reservation;
//    }
//
//    public void setReservation(Reservation reservation) {
//        this.reservation = reservation;
//    }
//}


package com.driver.model;

import javax.persistence.*;

@Entity
public class Payment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean paymentCompleted;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @OneToOne
    @JoinColumn
    private Reservation reservation;

    public Payment() {
    }

    public Payment(int id, boolean paymentCompleted, PaymentMode paymentMode, Reservation reservation) {
        this.id = id;
        this.paymentCompleted = paymentCompleted;
        this.paymentMode = paymentMode;
        this.reservation = reservation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPaymentCompleted() {
        return paymentCompleted;
    }

    public void setPaymentCompleted(boolean paymentCompleted) {
        this.paymentCompleted = paymentCompleted;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
