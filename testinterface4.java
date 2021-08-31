interface printable
{
void print();
}
interface showable extends printable
{
void show();
}
class testinterface4 implements  showable
{
public void print()
{
System.out.println("hello");
}
public void show()
{
System.out.println("Welcome");
}
public static void main(String args[])
{
testinterface4 obj= new testinterface4();
obj.print();
obj.show();
}
}