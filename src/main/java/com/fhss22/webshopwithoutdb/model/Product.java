package com.fhss22.webshopwithoutdb.model;

public class Product {
    private long productID;
    private int productQuantity;
    private String productName;
    private double productPrice;

    public Product(long productID, int productQuantity, String productName, double productPrice) {
        this.productID = productID;
        this.productQuantity = productQuantity;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
