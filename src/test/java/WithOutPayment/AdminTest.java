package WithOutPayment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import shop.Admin;
import shop.Products;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {
    static shop.Admin admin1;
    static shop.Admin admin2;
    static shop.Products product1;
    static shop.Products product2;
    static shop.Products product3;


    @BeforeAll
    static void init(){
        admin1 = new shop.Admin("admin1");
        admin2 = new Admin("admin2");

        product1 = new shop.Products("Coca-Cola","Beverage" ,35) ;
        product2 = new shop.Products("Pepsi" ,"Beverage" ,30);
        product3 = new Products("7up","Beverage" ,30);


        admin1.addProducts(product1.name, product1.group, product1.price);
        admin1.addProducts(product2.name, product2.group, product2.price);
        admin1.addProducts(product3.name, product3.group, product3.price);
    }
    @Test
    void viewProducts() {
        assertEquals(3, admin1.productItem.size());

        assertEquals("Coca-Cola", admin1.productItem.get(0).name);
        assertEquals("Beverage", admin1.productItem.get(0).group);
        assertEquals(4, admin1.productItem.get(0).ID);
        assertEquals(35, admin1.productItem.get(0).price);
    }

    @Test
    void addProducts() {
        admin2.addProducts(product1.name, product1.group, product1.price);
        assertEquals(1, admin2.productItem.size());

        admin2.addProducts(product2.name, product2.group, product2.price);
        assertEquals(2, admin2.productItem.size());

        admin2.addProducts(product3.name, product3.group, product3.price);
        assertEquals(3, admin2.productItem.size());
    }

    @Test
    void deleteProducts() {
        admin1.deleteProducts(1);
        assertEquals(2, admin1.productItem.size());

        admin1.deleteProducts(0);
        assertEquals(1, admin1.productItem.size());
    }

    @Test
    void updateProduct() {
        admin2.addProducts(product1.name, product1.group, product1.price);
        admin2.addProducts(product2.name, product2.group, product2.price);
        admin2.addProducts(product3.name, product3.group, product3.price);


        admin2.updateProduct(0,"Fruitika", "Juice", 40);
        assertEquals("Fruitika", admin2.productItem.get(0).name);
        assertEquals("Juice", admin2.productItem.get(0).group);
        assertEquals(40, admin2.productItem.get(0).price);
    }
}