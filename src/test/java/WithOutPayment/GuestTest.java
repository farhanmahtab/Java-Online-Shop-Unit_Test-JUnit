package WithOutPayment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import shop.Admin;
import shop.Guest;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    static shop.Admin admin;
    static shop.Guest guest;

    @BeforeAll
    static void init(){
        admin = new Admin("Admin");
        guest = new Guest();

        admin.addProducts("Coca-Cola","Beverage" ,35);
        admin.addProducts("Pepsi" ,"Beverage" ,30);

    }

    @Test
    void viewProducts() {
        assertEquals(2, guest.viewProducts(admin).size());
        assertEquals("Pepsi", guest.viewProducts(admin).get(1).name);
    }

    @Test
    void getRegistered() {
        guest.getRegistered("Guest1");
        assertEquals("Mahi", guest.getRegistered("Mahi").name);
    }
}