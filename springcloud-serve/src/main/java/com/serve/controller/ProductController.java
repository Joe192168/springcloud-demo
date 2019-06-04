package com.serve.controller;

import com.serve.bean.Product;
import com.serve.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aq on 2018/11/21.
 */
@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/modifyProductPiece")
    public String modifyProductPiece(@RequestBody Product product) {
        try {
            productService.modifyProductPiece(product);
            return "sucess";
        } catch (Exception ex) {
            return "error";
        }
    }

    @RequestMapping("/modifyProductPiece2")
    public String modifyProductPiece2() {
        try {
            Product product=new Product();
            product.setProductId(1);
            productService.modifyProductPiece(product);
            return "sucess";
        } catch (Exception ex) {
            return "error";
        }
    }

}
