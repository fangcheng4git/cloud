package com.atguigu.dao;


import entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author fangcheng
 * @date 2020-06-05
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);


    Payment getPaymentById(@Param("id") Long id);

}

