package com.fhss22.webshopwithoutdb.controler;

import com.fhss22.webshopwithoutdb.model.Order;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@RestController
public class OrderController {
    public static ArrayList<Order> orders1;
    public static ArrayList<Order> orders2;

    public void fillOrderArrayList(){
        orders1 = new ArrayList<>();
        orders2 = new ArrayList<>();
        orders1.add(new Order(1,2, null));
        orders1.add(new Order(2,7, null));
        orders2.add(new Order(3,9, null));
        orders2.add(new Order(4,40, null));
    }

    @PostConstruct
    public void checkOrders(){
        if (orders1  == null && orders2 == null){
            fillOrderArrayList();
        }
    }
}
