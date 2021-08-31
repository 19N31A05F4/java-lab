//19N31A05F4
import java.util.ArrayList;
public class ALMethods12
{
public static void main(String args[])
{
//boolean contains(Object element):
ArrayList aList=new ArrayList();
aList.add(2);
aList.add(4);
aList.add(6);
boolean flag1=aList.contains(2);
if(flag1==true)
{
 System.out.println("aList contains element 2");
}
else
{
 System.out.println("aList doesn't contains element 2");
}
boolean flag2=aList.contains(9);
if(flag2==true)
{
 System.out.println("aList contains element 9");
}
else
{
 System.out.println("aList doesn't contains element 9");
}

//void ensureCapacity(int minCapacity):
ArrayList aList1=new ArrayList(3);
aList1.add(7);
aList1.add(11);
aList1.add(13);
aList1.ensureCapacity(20);
System.out.println("Array List Number="+aList1);

//Object get(int index):
ArrayList<Integer>aList2=new ArrayList<Integer>();
aList2.add(4);
aList2.add(8);
aList2.add(12);
System.out.println("Array List Number="+aList2);
int value=aList2.get(1);
System.out.println("Element Retrieved at index 1 i.e;2nd position="+value);

//int indexOf(Object o):
ArrayList aList3=new ArrayList();
aList3.add("Learning");
aList3.add("ISSIMPLE");
System.out.println("Array List String="+aList3);
int value1=aList3.indexOf("Learning");
System.out.println("Index of Learning is:"+value1);
System.out.println("AT is not present so it will print index as -1");
int value2=aList3.indexOf("AT");
System.out.println("Index of AT="+value2);

//int lastIndexOf(Object o);
ArrayList aList4=new ArrayList();
aList4.add("D");
aList4.add("I");
aList4.add("L");
aList4.add("E");
aList4.add("E");
aList4.add("P");
System.out.println("list is:"+aList4);
int index1=aList4.lastIndexOf("E");
System.out.println("index of Last E in list:"+index1);

//Object remove(int index):
ArrayList aList5=new ArrayList();
aList5.add("LEARNING");
aList5.add("JAVA");
aList5.add("ISSIMPLE");
System.out.println("Array list is:"+aList5);
aList5.remove(2);
System.out.println("After Removing Element at index 2 ArrayList is:"+aList5);
}
} 

