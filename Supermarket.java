package shop;

public class Supermarket {
     String prod_name;
     int price;
     public Supermarket(String name,int rate){
        prod_name=name;
        price=rate;
     }
public static void main(String[] args){
    Supermarket item=new Supermarket("milk",30);
    System.out.println(item.prod_name);
    System.out.println(item.price);

}

}
