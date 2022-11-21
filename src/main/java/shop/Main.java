package shop;

public class Main {
    public static void main(String[] args) {
        Products products1 = new Products("Coca-Cola","Beverage" ,35) ;
        Products products2 = new Products("Pepsi" ,"Beverage" ,30);
        Products products3 = new Products("7up","Beverage" ,30);

        Admin admin = new Admin("admin");
        admin.addProducts(products1.name ,products1.group,products1.price);
        admin.addProducts(products2.name ,products2.group , products2.price);
        admin.addProducts(products3.name , products3.group, products3.price);

        System.out.println("-----------------admin products--------------");
        admin.viewProducts();
        Customer customer = new Customer("Mahi");

        customer.addToCart(products1);
        customer.addToCart(products2);

        System.out.println("--------------Cart-----------------");
        customer.viewCartProducts();

        System.out.println();
        System.out.println("Total Price :"+customer.cart.sumTotalPrice());

        System.out.println("------------------Payment-----------------");
        customer.payment.makePyament(customer.cart.sumTotalPrice()) ;

        System.out.println("------------------View product As Guest-------------");
        Guest guest = new Guest();
        guest.viewProducts(admin);
        guest.getRegistered("Zubaer");
    }
}
