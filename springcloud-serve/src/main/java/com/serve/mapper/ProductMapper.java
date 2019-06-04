package com.xiaoqi.mapper;

import com.xiaoqi.bean.Product;
import org.springframework.stereotype.Repository;

/**
 * Created by aq on 2018/11/21.
 */
@Repository
public interface ProductMapper {

    void modifyProductPiece(Product product);

}
