package com.fhss22.webshopwithoutdb.controler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fhss22.webshopwithoutdb.model.Customer;
import com.fhss22.webshopwithoutdb.model.Order;
import com.fhss22.webshopwithoutdb.model.Product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class JsonConverter {
    public static void createJsonProduct(ArrayList<Product> products1,ArrayList<Product> products2,ArrayList<Product> products3,ArrayList<Product> products4){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("C:\\Users\\Felix\\IdeaProjects\\webshopWithoutDB\\src\\main\\java\\com\\fhss22\\webshopwithoutdb\\json\\product1.json"), products1);
            objectMapper.writeValue(new File("C:\\Users\\Felix\\IdeaProjects\\webshopWithoutDB\\src\\main\\java\\com\\fhss22\\webshopwithoutdb\\json\\product2.json"), products2);
            objectMapper.writeValue(new File("C:\\Users\\Felix\\IdeaProjects\\webshopWithoutDB\\src\\main\\java\\com\\fhss22\\webshopwithoutdb\\json\\product3.json"), products3);
            objectMapper.writeValue(new File("C:\\Users\\Felix\\IdeaProjects\\webshopWithoutDB\\src\\main\\java\\com\\fhss22\\webshopwithoutdb\\json\\product4.json"), products4);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void createJsonOrder(ArrayList<Order> orders1, ArrayList<Order> orders2){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("C:\\Users\\Felix\\IdeaProjects\\webshopWithoutDB\\src\\main\\java\\com\\fhss22\\webshopwithoutdb\\json\\order1.json"),orders1);
            objectMapper.writeValue(new File("C:\\Users\\Felix\\IdeaProjects\\webshopWithoutDB\\src\\main\\java\\com\\fhss22\\webshopwithoutdb\\json\\order2.json"),orders2);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void createJsonCustomer(ArrayList<Customer> customers){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("C:\\Users\\Felix\\IdeaProjects\\webshopWithoutDB\\src\\main\\java\\com\\fhss22\\webshopwithoutdb\\json\\customer.json"),customers);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}