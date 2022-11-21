package shop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    static Cart cart;
    static Cart cart2;
    static Products product1;
    static Products product2;
    static Products product3;

    @BeforeAll
    static void init(){
        cart = new Cart();
        product1 = new Products("Coca-Cola","Beverage" ,35);
        product2 = new Products("Pepsi" ,"Beverage" ,30);
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
        assertEquals("Apple", cart.cartItems.get(0).name);
        assertEquals("Fruit", cart.cartItems.get(0).group);
        assertEquals(10, cart.cartItems.get(0).price);
    }

    @Test
    void viewCart() {
        cart2 = new Cart();
        cart2.addToCart(product1);
        cart2.addToCart(product2);
        cart2.addToCart(product3);



        assertEquals(3, cart2.cartItems.size());


        assertEquals("Apple", cart2.cartItems.get(0).name);
        assertEquals("Fruit", cart2.cartItems.get(0).group);
        assertEquals(10, cart2.cartItems.get(0).price);

        assertEquals("Banana", cart2.cartItems.get(2).name);
        assertEquals("Fruit", cart2.cartItems.get(2).group);
        assertEquals(20, cart2.cartItems.get(2).price);

        assertSame(cart2.cartItems, cart2.viewCart());
    }

    @Test
    void sumTotalPrice() {
        assertEquals(30, cart.sumTotalPrice());
    }
    @Test
    void makePayment(){
        cart2 = new Cart();
        cart2.addToCart(product1);
        cart2.addToCart(product2);
        assertEquals(25, cart2.sumTotalPrice());
    }
}