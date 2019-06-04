package com.xiaoqi.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.xiaoqi.bean.Product;
import com.xiaoqi.mapper.ProductMapper;
import com.xiaoqi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by aq on 2018/11/21.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    @Transactional
    @TxTransaction(isStart = false)
    public void modifyProductPiece(Product product) {
        productMapper.modifyProductPiece(product);

    }
}
