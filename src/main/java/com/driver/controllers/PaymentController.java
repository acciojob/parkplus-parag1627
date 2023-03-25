//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.driver.controllers;

import com.driver.model.Payment;
import com.driver.services.impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/payment"})
public class PaymentController {
    @Autowired
    PaymentServiceImpl paymentService;

    public PaymentController() {
    }

    @PostMapping({"/pay"})
    public Payment pay(@RequestParam Integer reservationId, @RequestParam Integer amountSent, @RequestParam String mode) throws Exception {
        Payment payment = this.paymentService.pay(reservationId, amountSent, mode);
        return payment;
    }
}
