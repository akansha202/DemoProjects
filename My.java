interface My
{
    void show();
}
interface My1
{
    void display();

}
class child My interface My1
{
    public static void show() {
        System.out.println("show");
    }
}
public  static void display();
{
    System.out.println("display");
}
public static void main() 
{
    My m= new child();
    m.show();

    My1 n= new child();
    n.display();   
}