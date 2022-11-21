package WithOutPayment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import shop.Admin;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    static shop.Admin admin;

    @BeforeAll
    static void init(){
        admin = new Admin("Admin");

        admin.addProducts("Pepsi" ,"Beverage" ,30);
        admin.addProducts("7up","Beverage" ,30);


    }

    @Test
    void main() {
        assertEquals(2, admin.productItem.size());

        assertEquals("7up", admin.productItem.get(1).name);
        assertEquals("Beverage", admin.productItem.get(1).group);
        assertEquals(1, admin.productItem.get(0).ID);
        assertEquals(30, admin.productItem.get(1).price);
    }
}