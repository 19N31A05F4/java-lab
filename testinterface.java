interface Drawable
{
 void draw();
}
class Rectangle implements Drawable
{
 public void draw()
{
 System.out.println("drawing rectangle");
}
}
class Circle implements Drawable
{
public void draw()
{
System.out.println("drawing circle");
}
}
class testinterface
{
public static void main(String args[])
{
Circle c=new Circle();
c.draw();
Rectangle r=new Rectangle();
r.draw();
}
}