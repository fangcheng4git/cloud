package com.atguigu.springcloud.controller;

import com.atguigu.service.PaymentService;
import entity.CommonResult;
import entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fangcheng
 * @date 2020-06-05
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<?> create(Payment payment) {
        int i = paymentService.create(payment);
        if(i > 0){
            return new CommonResult(2000, "插入成功", null);
        }else{
            return new CommonResult(5000, "插入失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        return new CommonResult(2000,"操作成功" + serverPort,paymentById);
    }
}
