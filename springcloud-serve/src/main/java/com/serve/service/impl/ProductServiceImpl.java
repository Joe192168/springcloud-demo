package com.serve.service.impl;


import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.serve.bean.Product;
import com.serve.mapper.ProductMapper;
import com.serve.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by aq on 2018/11/21.
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    @TccTransaction
    @Transactional
    public String modifyProductPiece(Product product) {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$modifyProductPiece$$$$$$$$$$$$$$$$$");
        int ret = productMapper.modifyProductPiece(product);
        System.out.println("远程调用9000端口，受影响行数："+ret);
        return ret>0?"success":"error";
    }
}
