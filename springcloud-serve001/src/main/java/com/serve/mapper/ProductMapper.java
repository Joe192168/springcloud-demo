package com.serve.mapper;

import com.serve.bean.Product;
import org.springframework.stereotype.Repository;

/**
 * Created by aq on 2018/11/21.
 */
@Repository
public interface ProductMapper {

    int modifyProductPiece(Product product);

}
