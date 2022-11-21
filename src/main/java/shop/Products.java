package shop;

public class Products {

    static int productCount = 1 ;
    public int ID ;
    public int price ;
    public String name ;
    public String  group ;

    public Products(String name,String group,int price){
        ID = productCount ;
        this.name = name ;
        this.group = group ;
        this.price = price ;
        productCount ++ ;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
