package com.fhss22.webshopwithoutdb.controler;

import com.fhss22.webshopwithoutdb.model.Product;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
@RestController
public class ProductController {
    public static ArrayList<Product> products1;

    public static ArrayList<Product> products2;

    public static ArrayList<Product> products3;

    public static ArrayList<Product> products4;

    public void fillProductArrayList(){
        products1 = new ArrayList<>();
        products2 = new ArrayList<>();
        products3 = new ArrayList<>();
        products4 = new ArrayList<>();
        products1.add(new Product(1,10,"apple",0.90));
        products1.add(new Product(2,10,"banana",2.50));
        products2.add(new Product(3,10,"potatoes",1.45));
        products2.add(new Product(4,10,"beer",1.60));
        products3.add(new Product(5,10,"bread",0.90));
        products3.add(new Product(6,10,"pizza",2.50));
        products4.add(new Product(7,10,"fries",1.45));
        products4.add(new Product(8,10,"coke",1.60));
    }

    @PostConstruct
    public void checkProducts(){
        if (products1 == null && products2 == null && products3 == null && products4 == null){
            fillProductArrayList();
        }
    }
}
