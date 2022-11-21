package WithOutPayment;

import shop.Products;

import java.util.ArrayList;

public class Cart {

    private int price ;
    private int totalPrice ;

    public ArrayList<shop.Products> cartItems = new ArrayList<shop.Products>();

    public void addToCart(shop.Products products){
        cartItems.add(products);
    }
    public void deleteFromCart(int id){
        cartItems.remove(id) ;
    }

    public ArrayList<shop.Products> viewCart () {
        System.out.println("Items in the Cart : ");
        for (shop.Products products :cartItems){
            System.out.println(products.name + " " +products.group + " " + products.price) ;
        }
        return cartItems;
    }

}