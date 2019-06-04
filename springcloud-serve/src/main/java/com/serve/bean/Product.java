package com.xiaoqi.bean;

/**
 * Created by aq on 2018/11/22.
 */
public class Product {

    private Integer productId;
    private String productName;
    private Integer productPiece;

    public Product(Integer productId, String productName, Integer productPiece) {
        this.productId = productId;
        this.productName = productName;
        this.productPiece = productPiece;
    }

    public Product() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPiece() {
        return productPiece;
    }

    public void setProductPiece(Integer productPiece) {
        this.productPiece = productPiece;
    }
}
