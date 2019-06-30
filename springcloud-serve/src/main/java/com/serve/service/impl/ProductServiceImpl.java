package com.serve.service.impl;


import com.serve.bean.Product;
import com.serve.mapper.ProductMapper;
import com.serve.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.servicecomb.pack.omega.transaction.annotations.Compensable;
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
    @Compensable(timeout=5, compensationMethod="cancel")
    @Transactional
    public String modifyProductPiece(Product product) {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$modifyProductPiece$$$$$$$$$$$$$$$$$");
        int ret = productMapper.modifyProductPiece(product);
        System.out.println("远程调用9000端口，受影响行数："+ret);
        return ret>0?"success":"error";
    }

    @Transactional
    public void cancel(Product product) {
        productMapper.modifyProductPiece(product);
    }
}
