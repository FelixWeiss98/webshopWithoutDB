package com.fhss22.webshopwithoutdb.model;

import java.util.ArrayList;
public class Order {
    private long orderID;
    private double orderPrice;
    private ArrayList<Product> productList;

    public Order(long orderID, double orderPrice, ArrayList<Product> productList) {
        this.orderID = orderID;
        this.orderPrice = orderPrice;
        this.productList = productList;
    }

    public Order() {
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
}
