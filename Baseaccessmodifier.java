public class Baseaccessmodifier {
   private void show()  //effect of access modifier
    {
    
   } void show(); 
    {
    System.out.println("base");
    }
}
class child extends Baseaccessmodifier
{
     Public void show(); //effect of access modifier
    {
        System.out.println("child");
    }
}
public static void main( String s)
 {
    child c= new child();
    c.show();
}