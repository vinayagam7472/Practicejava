public class Trail
{
    
    String product ;
    int rate;

    Trail(String prod_name,int price){
        product=prod_name;
        rate=price;
        
    }
    public static void main(String[] args) {
        Trail item1=new Trail("chocalate ",10);
        Trail item2=new Trail("biscuit ",100);
        System.out.println(item1.product);
        System.out.println(item1.rate);

        System.out.println(item2.product);
       
    }



    // public static void main (String[] args){
    //     System.out.println();
    // }
}