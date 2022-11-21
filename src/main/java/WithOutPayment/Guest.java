package WithOutPayment;

import shop.Admin;
import shop.Customer;
import shop.Products;

import java.util.ArrayList;

public class Guest {
    public ArrayList<Products> viewProducts(Admin admin){
        return admin.viewProducts();
    }
    public shop.Customer getRegistered(String name){
        shop.Customer customer = new Customer(name);
        System.out.println("Customer registered");
        System.out.println("Customer Name : "+ customer.name);

        return customer ;
    }
}