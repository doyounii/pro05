package com.shop.service;

import com.shop.mapper.PayMapper;
import com.shop.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService{
    @Autowired
    private PayMapper payMapper;

    @Override
    public int payInsert() {
        return payMapper.payInsert();
    }
}
