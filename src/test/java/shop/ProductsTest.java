package shop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {
    static Products product1;
    static Products product2;
    static Products product3;

    @BeforeAll
    static void init() {
        product1 = new Products("Coca-Cola", "Beverage", 35);
        product2 = new Products("Pepsi", "Beverage", 30);
        product3 = new Products("7up", "Beverage", 30);
    }

    @Test
    void setID() {
        product1.setID(1);
        assertEquals(1, product1.ID);
    }

    @Test
    void setGroup() {
        product2.setGroup("Beverage");
        assertEquals("beverage", product2.group);
    }

    @Test
    void setName() {
        product2.setName("Mojo");
        assertEquals("Beverage",product2.group);
    }

    @Test
    void setPrice() {
        product2.setPrice(40);
        assertEquals(40,product2.price);
    }
}