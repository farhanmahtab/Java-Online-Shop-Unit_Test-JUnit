package WithOutPayment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import shop.Customer;
import shop.Products;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    static shop.Customer customer1;
    static shop.Customer customer2;

    static shop.Products product1;
    static shop.Products product2;

    @BeforeAll
    static void init() {
        customer1 = new shop.Customer("Mahi");
        customer2 = new Customer("Anindo");

        product1 = new shop.Products("Pepsi", "Beverage", 30);
        product2 = new Products("7up", "Beverage", 35);

        customer1.addToCart(product1);
        customer1.addToCart(product2);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void viewCartProducts() {
        assertEquals(2, customer1.cart.cartItems.size());
        assertEquals("Pepsi", customer1.cart.cartItems.get(0).name);
        assertEquals("Beverage", customer1.cart.cartItems.get(0).group);
        assertEquals(30, customer1.cart.cartItems.get(0).price);

        assertSame(customer1.cart.viewCart(), customer1.viewCartProducts());
    }

    @Test
    void addToCart() {
        assertEquals(2, customer1.cart.cartItems.size());
        assertEquals("Pepsi", customer1.cart.cartItems.get(0).name);
        assertEquals("Beverage", customer1.cart.cartItems.get(0).group);
        assertEquals(30, customer1.cart.cartItems.get(0).price);
    }

    @Test
    void deleteFromCart() {
        customer2.addToCart(product1);
        customer2.addToCart(product2);
        assertEquals(2, customer2.cart.cartItems.size());

        customer2.deleteFromCart(1);
        assertEquals(1, customer2.cart.cartItems.size());
    }

}