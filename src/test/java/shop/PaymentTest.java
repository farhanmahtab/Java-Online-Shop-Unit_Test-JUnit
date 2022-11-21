package shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    void makePyament() {
        Customer customer1 = new Customer("John");
        Products product1 = new Products("7up", "Drinks", 30);
        Products product2 = new Products("Pepsi", "Fruit", 45);

        customer1.addToCart(product1);
        customer1.addToCart(product2);

        assertEquals(75, customer1.payment.makePyament(customer1.cart.sumTotalPrice()));

    }
}