package com.fhss22.webshopwithoutdb.controler;

import com.fhss22.webshopwithoutdb.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

import static com.fhss22.webshopwithoutdb.controler.OrderController.orders1;
import static com.fhss22.webshopwithoutdb.controler.OrderController.orders2;
import static com.fhss22.webshopwithoutdb.controler.ProductController.*;

@RestController
public class CustomerController {
    public static ArrayList<Customer> customers;

    public void fillCustomerArrayList(){
        customers = new ArrayList<>();
        customers.add(new Customer(1,"Felix Weiß",null));
        customers.add(new Customer(2,"Sebastian Schwarz",null));
    }

    @GetMapping("complete")
    public ArrayList<Customer> fillOrdersAndProducts(){
        //Customer Felix gets two Orders
        if(customers.get(0).getOrderList() == null){
            customers.get(0).setOrderList(orders1);
        }

        //Customer Sebastian gets two Orders
        if(customers.get(1).getOrderList() == null){
            customers.get(1).setOrderList(orders2);
        }

        //Felix's two Orders get two Products each
        if(orders1.get(0).getProductList() == null){
            orders1.get(0).setProductList(products1);
        }
        if(orders1.get(1).getProductList() == null){
            orders1.get(1).setProductList(products2);
        }

        //Sebastian's two Orders get two Products each
        if(orders2.get(0).getProductList() == null){
            orders2.get(0).setProductList(products3);
        }
        if(orders2.get(1).getProductList() == null){
            orders2.get(1).setProductList(products4);
        }
        return customers;
    }

    @PostConstruct
    public void checkCustomers(){
        if (customers == null){
            fillCustomerArrayList();
        }
        JsonConverter.createJsonCustomer(customers);
    }
}
