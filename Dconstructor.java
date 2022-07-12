/* default contructor
class Dconstructor
{
  int x;
  int y;
  }
Dconstructor()
{
  x=10;
  y=20;
  }
void show()
{
  System.out.println();
  System.out.println();
  }
public static void main(string s)
{
  Dconstructor d=new Dconstructor();
  d.show();
  Dconstructor d1=new Dconstructor();
  d1.show();
}*/ 
// parametarised constructor

class Pconstructor
{
  int x;
  int y;
  }
Pconstructor(int x , int y)
{
  this.x=x;
  this.y=y;
  }
void show()
{
  System.out.println();
  System.out.println();
  }
public static void main(string s)
{
  Pconstructor d=new Pconstructor(10,20);
  d.show();
  Pconstructor d1=new Pconstructor(100,200);
  d1.show();
}
