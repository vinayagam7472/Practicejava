public class Shop{

static String shop_name = "arunkumar";
static int shop_no = 24;

String prod_name;
int price;
public static void main(String[] args)
{
    //memory ref of a class
    Shop prouduct1 = new Shop();
    prouduct1.prod_name = "abc";
    prouduct1.price = 100;

    Shop prouduct2 = new Shop();
    prouduct2.prod_name = "xyz";
    prouduct2.price = 1000;

//    Shop prouduct3 = new Shop();
//    Shop prouduct4 = new Shop();

    System.out.println(prouduct2.price);
    System.out.println(prouduct1.price);
}


}

