package com.client.feign.fallback;

import com.client.dto.Product;
import com.client.feign.ProductFeign;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by aq on 2018/11/22.
 */
@Component
public class ProductFeignFallback implements ProductFeign {

    private String returl = "当前访问人数过多";

    @Override
    public String modifyProductPiece(@RequestBody Product product) {
        return returl;
    }

    @Override
    public String modifyProductPiece2() {
        return returl;
    }


}
