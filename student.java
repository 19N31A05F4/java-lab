class student
{
 static int id;
 static String name;
 static float fee;
 
 student(int i,String n)
{
 id=i;
 name=n;
}
student(int i,String n,float a)
{
  id=i;
  name=n;
  fee=a;
}
public void print(int id,String name)
{
  System.out.println(id+" "+name);
}
public void print(int id,String name,float fee)
{
  System.out.println(id+" "+name+" "+fee);
}

public static void main(String args[])
{
  student s1=new student(id,name);
  student s2=new student(id,name,fee);
  s1.print(1,"anji");
  s2.print(2,"rakesh",52000);
}
}