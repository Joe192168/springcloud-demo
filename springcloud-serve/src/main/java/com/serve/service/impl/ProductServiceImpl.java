package com.serve.service.impl;


import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.serve.bean.Product;
import com.serve.mapper.ProductMapper;
import com.serve.service.ProductService;
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
    @LcnTransaction
    public void modifyProductPiece(Product product) {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$modifyProductPiece$$$$$$$$$$$$$$$$$");
        productMapper.modifyProductPiece(product);

    }
}
