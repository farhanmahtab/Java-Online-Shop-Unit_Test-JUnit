package shop;

import java.util.ArrayList;

public class Admin {

    static int adminCount = 1 ;
    public ArrayList<Products> productItem = new ArrayList<Products>();
    private int ID ;
    private String name ;

    public ArrayList<Products> viewProducts() {
        for (Products products : productItem){
            System.out.println(products.name);
        }
        return productItem;
    }
    public Admin(String name)
    {
        ID = adminCount ;
        this.name =name ;
        adminCount ++ ;
    }
    public void addProducts(String name,String group,int price){
        Products products = new Products(name,group,price);
        productItem.add(products);
    }
    public void deleteProducts(int id){
        productItem.remove(id);
    }
    public void updateProduct(int id,String name ,String group,int price){
        Products products = productItem.get(id);
        products.setName(name);
        products.setGroup(group);
        products.setPrice(price);

    }
}
