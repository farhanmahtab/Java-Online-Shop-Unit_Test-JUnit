package shop;

public class Payment {
    public int totalPrice ;

    public Payment()
    {
        totalPrice = 0 ;
    }
    public int makePyament (int totalPrice){
        System.out.println("Total Price : " +totalPrice );
        System.out.println("Payment Done");
        return totalPrice;
    }
}
