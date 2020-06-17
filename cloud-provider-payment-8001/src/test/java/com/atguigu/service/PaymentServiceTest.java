package com.atguigu.service;

import entity.Payment;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author fangcheng
 * @date 2020-06-05
 */
class PaymentServiceTest {

    @Resource
    private PaymentService paymentService;

    @Test
    public void create(){

    }

    @Test
    public void get(){
        Payment paymentById = paymentService.getPaymentById(1L);
        System.out.println(paymentById);
    }

}