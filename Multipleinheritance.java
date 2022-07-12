//child class getting sa,me method from more thabn one interface
interface Multipleinhertance
{
    void show();
}
interface My1
{
    void display();

}
// multiple inhertance
interface My1 extends Multipleinhertance
 {
    void display();
 }
 //function overridding
 class child implements My1 Multipleinhertance
 {
    public void show()
    {
        System.out.println("show");
    }
    public void display()
    {
        System.out.println("display");
    }
 }
{
    public static void show() {
        System.out.println("show");
    }
}
public  static void display();
{
    System.out.println("display");
}
public static void main(String s) 
{
    Multipleinhertance m= new child();
    m.show();

    My1 n= new child();
    n.display();   
}
