//N.DILEEP KUMAR REDDY
//19N31A05F4
//II-II-CSE-C
class Outer1
{
  static class Inner
{
 void innermethod()
{
  System.out.println("Inner class method");
}
}
void outermethod()
{
  System.out.println("Outer class method");
}
public static void main(String args[])
{
Outer o=new Outer();
o.outermethod();
Inner i=new Inner();
i.innermethod();
}
}