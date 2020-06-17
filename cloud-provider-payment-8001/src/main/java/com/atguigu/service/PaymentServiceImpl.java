package com.atguigu.service;

import com.atguigu.dao.PaymentDao;
import entity.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fangcheng
 * @date 2020-06-05
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
