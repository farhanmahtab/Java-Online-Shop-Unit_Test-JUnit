package shop;

import java.util.ArrayList;

public class Guest {
    public ArrayList<Products> viewProducts(Admin admin){
        return admin.viewProducts();
    }
    public Customer getRegistered(String name){
        Customer customer = new Customer(name);
        System.out.println("Customer registered");
        System.out.println("Customer Name : "+ customer.name);

        return customer ;
    }
}
