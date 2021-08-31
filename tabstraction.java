//N.DILEEP KUMAR REDDY
//19N31A05F4
//II-CSE-C
abstract class shapes
{
  abstract void draw();
}
class rectangle extends shapes
{
  void draw()
{
  System.out.println("Draw the rectangle");
}
}
class circle extends shapes
{
 void draw()
{
 System.out.println("Draw the circle");
}
}
class tabstraction
{
 public static void main(String args[])
{
 circle obj1=new circle();
 obj1.draw();
 rectangle obj2=new rectangle();
 obj2.draw();
}
} 