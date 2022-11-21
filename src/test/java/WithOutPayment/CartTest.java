package WithOutPayment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.Products;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    static shop.Cart cart;
    static shop.Cart cart2;
    static shop.Products product1;
    static shop.Products product2;
    static shop.Products product3;

    @BeforeAll
    static void init(){
        cart = new shop.Cart();
        product1 = new shop.Products("Coca-Cola","Beverage" ,35);
        product2 = new shop.Products("Pepsi" ,"Beverage" ,30);
        product3 = new Products("7up","Beverage" ,30);

        cart.addToCart(product1);
        cart.addToCart(product2);
        cart.addToCart(product2);
    }
    @Test
    void addToCart() {
        assertEquals(3,cart.cartItems.size());
        assertEquals("Coca-Cola",cart.cartItems.get(0).name);
        assertEquals("Beverage",cart.cartItems.get(0).group);
        assertEquals(35,cart.cartItems.get(0).price);
    }

    @Test
    void deleteFromCart() {
        assertEquals(3, cart.cartItems.size());

        cart.deleteFromCart(1);
        assertEquals(2, cart.cartItems.size());
        assertEquals("Coca-Cola", cart.cartItems.get(0).name);
        assertEquals("Beverage", cart.cartItems.get(0).group);
        assertEquals(35, cart.cartItems.get(0).price);
    }

    @Test
    void viewCart() {
        cart2 = new shop.Cart();
        cart2.addToCart(product1);
        cart2.addToCart(product2);
        cart2.addToCart(product3);



        assertEquals(3, cart2.cartItems.size());


        assertEquals("Coca-Cola", cart.cartItems.get(0).name);
        assertEquals("Beverage", cart.cartItems.get(0).group);
        assertEquals(35, cart.cartItems.get(0).price);

        assertEquals("Pepsi", cart.cartItems.get(1).name);
        assertEquals("Beverage", cart.cartItems.get(1).group);
        assertEquals(30, cart.cartItems.get(1).price);

        assertSame(cart2.cartItems, cart2.viewCart());
    }

}