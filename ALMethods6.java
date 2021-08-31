//19N31A05F4
import java.util.ArrayList;
public class ALMethods6
{
public static void main(String args[])
{
//boolean add( object o):
ArrayList aList=new ArrayList();
aList.add(5);
aList.add(10);
aList.add(15);
aList.add("A");
aList.add("B");
aList.add("C");
System.out.println("elements in the list by using add() are:"+aList);

//void add(int index,Object element):
aList.add(6,20);
aList.add(7,"D");
System.out.println("elements in the list by using add(index) are:"+aList);

//boolean addAll(Collection c):
ArrayList aList1=new ArrayList();
aList1.add(3);
aList1.add(6);
aList1.add("P");
aList1.add("Q");
System.out.println("elements in the list1 are:"+aList1);
ArrayList aList2=new ArrayList();
aList2.add(9);
aList2.add("R");
System.out.println("elements in the list2 are:"+aList2);
aList1.addAll(aList2);
System.out.println("elements after using addAll() are:"+aList1);

//boolean addAll(int index,Collection c):
aList1.addAll(1,aList2);
System.out.println("elemnts in the list by using addAll(index) are:"+aList1);

//void clear():
ArrayList aList3=new ArrayList();
aList3.add(1);
aList3.add(2);
aList3.add("E");
aList3.add("F");
System.out.println("elemnts in the list are:"+aList3);
System.out.println("size of the list before using clear() is:"+aList3.size());
aList3.clear();
System.out.println("elements in the list after using clear():"+aList3);
System.out.println("size of the list after using clear() is:"+aList3.size());

//Object clone():
ArrayList aList4=new ArrayList();
aList4.add("X");
aList4.add("Y");
aList4.add("Z");
ArrayList aListCopy=(ArrayList)aList4.clone();
System.out.println("list of copied elements from aList4 are:"+aListCopy);
}
}

