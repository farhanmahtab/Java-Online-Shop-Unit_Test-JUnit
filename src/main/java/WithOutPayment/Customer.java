package WithOutPayment;

import shop.Cart;
import shop.Payment;
import shop.Products;

import java.util.ArrayList;

public class Customer {

    static int customerCount = 1 ;
    private int customerID ;
    public String name ;

    public shop.Cart cart ;
    public Payment payment ;

    public Customer(String name){
        customerID = customerCount ;
        this.name = name ;
        customerCount ++ ;
        cart = new Cart() ;
        payment = new Payment();
    }

    public ArrayList<shop.Products> viewCartProducts(){
        return cart.viewCart();
    }
    public void addToCart(Products products){
        cart.addToCart(products);
    }
    public void deleteFromCart(int ID){
        cart.deleteFromCart(ID);
    }
}

