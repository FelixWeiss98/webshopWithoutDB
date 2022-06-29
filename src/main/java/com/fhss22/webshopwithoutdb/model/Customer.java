package com.fhss22.webshopwithoutdb.model;

import java.util.ArrayList;

public class Customer {
    private long customerID;
    private String customerName;
    private ArrayList<Order> orderList;

    public Customer(long customerID, String customerName, ArrayList<Order> orderList) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.orderList = orderList;
    }

    public Customer() {
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
}
