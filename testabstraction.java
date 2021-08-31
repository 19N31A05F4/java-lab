abstract class shapes
{
 abstract void draw();
}
class rectangle extends shapes
{
 void draw()
{
System.out.println("draw the rectangle");
}
}
class circle extends shapes
{
 void draw()
{
 System.out.println("draw the circle");
}
}

 class testabstraction
{
 public static void main(String args[])
{
 circle obj1=new circle();
 obj1.draw();
 rectangle obj2=new rectangle();
 obj2.draw();
}
}