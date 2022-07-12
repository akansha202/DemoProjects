public class A()
 {
A()    
}
{
Super();
System.out.println("A");
}
class B extends A{
    B()    
}
{
Super();
System.out.println("B");
}
class C extends B{
    C()  
}
{
Super();
System.out.println("B");
}
C (int x)
{
    Super();
    System.out.println(x);
}
public static void main() {
    new C();
    new C(10);
}