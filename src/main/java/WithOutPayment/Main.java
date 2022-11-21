package WithOutPayment;

import shop.Admin;
import shop.Customer;
import shop.Guest;
import shop.Products;

public class Main {
    public static void main(String[] args) {
        shop.Products products1 = new shop.Products("Coca-Cola","Beverage" ,35) ;
        shop.Products products2 = new shop.Products("Pepsi" ,"Beverage" ,30);
        shop.Products products3 = new Products("7up","Beverage" ,30);

        shop.Admin admin = new Admin("admin");
        admin.addProducts(products1.name ,products1.group,products1.price);
        admin.addProducts(products2.name ,products2.group , products2.price);
        admin.addProducts(products3.name , products3.group, products3.price);

        System.out.println("-----------------admin products--------------");
        admin.viewProducts();
        shop.Customer customer = new Customer("Mahi");

        customer.addToCart(products1);
        customer.addToCart(products2);

        System.out.println("--------------Cart-----------------");
        customer.viewCartProducts();

        System.out.println();
        //System.out.println("Total Price :"+customer.cart.sumTotalPrice());

//        System.out.println("------------------Payment-----------------");
//        customer.payment.makePyament(customer.cart.sumTotalPrice()) ;

        System.out.println("------------------View product As Guest-------------");
        shop.Guest guest = new Guest();
        guest.viewProducts(admin);
        guest.getRegistered("Zubaer");
    }
}
