//N.DILEEP KUMAR REDDY
//19N31A05F4
//II-II-CSEC
class Outer
{
 class Inner
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
  Outer.Inner i=new Outer().new Inner();
  i.innermethod();
}
}