class Copyconstructor
{
    int x;
     int y;
}
Copyconstructor (int x , int y)
{
    this.x=x;
    this.y=y
    
}
Copyconstructor (Copyconstructor z)
{
    this.x=x.z;
    this.y=y.z;
    z=null;
}
void show()
{
    System.out.println(x);
    System.out.println(x);
}
public static void main(String s) {
    Copyconstructor c=new Copyconstructor(10,20);
    c.show()

    Copyconstructor c1=new Copyconstructor(c);
    c1.show()
System.out.println(c.x);
}