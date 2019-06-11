package com.client.feign;


import com.client.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by aq on 2018/11/22.
 */
@Component
@FeignClient(name = "springcloudserve")
public interface ProductFeign {

    @RequestMapping("/product/modifyProductPiece")
    String modifyProductPiece(@RequestBody Product product);

    @RequestMapping("/product/modifyProductPiece2")
    String modifyProductPiece2();

}
