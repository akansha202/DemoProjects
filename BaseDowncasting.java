public class BaseDowncasting
 {
    void show(); 
    {
    System.out.println("base");
    }
}
class child extends BaseDowncasting
{
    void show(); 
    {
        System.out.println("child");
    }
    void display()
    {
        System.out.println("display")
    }
}
public static void main( String s)
 {
    BaseDowncasting b= new child()
    b.show()

    child c= (child)b; //DOWNCASTING
 c.display();
}
    

