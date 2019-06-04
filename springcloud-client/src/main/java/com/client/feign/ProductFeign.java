package com.xiaoqi.feign;

import com.xiaoqi.dto.Product;
import com.xiaoqi.feign.fallback.ProductFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by aq on 2018/11/22.
 */
@Component
@FeignClient(name = "product-service", fallback = ProductFeignFallback.class)
public interface ProductFeign {

    @RequestMapping("/product/modifyProductPiece")
    String modifyProductPiece(@RequestBody Product product);

    @RequestMapping("/product/modifyProductPiece2")
    String modifyProductPiece2();

}
