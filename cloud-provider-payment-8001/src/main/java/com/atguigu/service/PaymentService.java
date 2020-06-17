package com.atguigu.service;

import entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author fangcheng
 * @date 2020-06-05
 */
public interface PaymentService {

    int create(Payment payment);


    Payment getPaymentById(@Param("id") Long id);
}
