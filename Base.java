public class Base {
    void show(); //same function
    {
    System.out.println("base");
    }
}
class child extends Base
{
    void show(); //same function
    {
        System.out.println("child");
    }
}
public static void main( String s)
 {
    child c= new child();
    c.show();
}


