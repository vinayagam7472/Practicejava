public class Trail
{
    static int num=21;
     void shop(){
        System.out.println("biscuit");
    }
    public static void main(String[] args) {
        Trail item=new Trail();
        item.shop();
        
        System.err.println(Trail.num);
    }
}