package shop;

import java.util.ArrayList;

public class Cart {

    private int price ;
    private int totalPrice ;

    public ArrayList<Products> cartItems = new ArrayList<Products>();

    public void addToCart(Products products){
        cartItems.add(products);
    }
    public void deleteFromCart(int id){
        cartItems.remove(id) ;
    }

    public ArrayList<Products> viewCart () {
        System.out.println("Items in the Cart : ");
        for (Products products :cartItems){
            System.out.println(products.name + " " +products.group + " " + products.price) ;
        }
        return cartItems;
    }
    public int sumTotalPrice () {
        int sum = 0 ;
        for (Products products : cartItems) sum+=products.price ;

        return sum ;
    }
}
