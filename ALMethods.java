//19N31A05F4
import java.util.ArrayList;
public class ALMethods
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
System.out.println("elements in the list by using addAll(index) are:"+aList1);

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

//boolean contains(Object element):
ArrayList aList5=new ArrayList();
aList5.add(2);
aList5.add(4);
aList5.add(6);
boolean flag1=aList5.contains(2);
if(flag1==true)
{
 System.out.println("aList contains element 2");
}
else
{
 System.out.println("aList doesn't contains element 2");
}
boolean flag2=aList5.contains(9);
if(flag2==true)
{
 System.out.println("aList contains element 9");
}
else
{
 System.out.println("aList doesn't contains element 9");
}

//void ensureCapacity(int minCapacity):
ArrayList aList6=new ArrayList(3);
aList6.add(7);
aList6.add(11);
aList6.add(13);
aList6.ensureCapacity(20);
System.out.println("Array List Number="+aList6);

//Object get(int index):
ArrayList<Integer>aList7=new ArrayList<Integer>();
aList7.add(4);
aList7.add(8);
aList7.add(12);
System.out.println("Array List Number="+aList7);
int value=aList7.get(1);
System.out.println("Element Retrieved at index 1 i.e;2nd position="+value);

//int indexOf(Object o):
ArrayList aList8=new ArrayList();
aList8.add("Learning");
aList8.add("ISSIMPLE");
System.out.println("Array List String="+aList8);
int value1=aList8.indexOf("Learning");
System.out.println("Index of Learning is:"+value1);
System.out.println("AT is not present so it will print index as -1");
int value2=aList8.indexOf("AT");
System.out.println("Index of AT="+value2);

//int lastIndexOf(Object o);
ArrayList aList9=new ArrayList();
aList9.add("D");
aList9.add("I");
aList9.add("L");
aList9.add("E");
aList9.add("E");
aList9.add("P");
System.out.println("list is:"+aList9);
int index1=aList9.lastIndexOf("E");
System.out.println("index of Last E in list:"+index1);

//Object remove(int index):
ArrayList aList10=new ArrayList();
aList10.add("LEARNING");
aList10.add("JAVA");
aList10.add("ISSIMPLE");
System.out.println("Array list is:"+aList10);
aList10.remove(2);
System.out.println("After Removing Element at index 2 ArrayList is:"+aList10);

/*
import java.util.ArrayList;
public class ALMethods19
{
public static void main(String[] args) 
{
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(3);
        aList.add(5);
        aList.add(9);
        aList.add(11);
        aList.add(15);
        aList.add(16);

        System.out.println("The Arraylist:" + aList);
        aList.removeRange(1,3);
        System.out.println("Removing Element From Index 1 to Index 2 using removeRange(1,3)");
        System.out.println("The Arraylist after using removeRange:" + aList);
}
}   */


//Object set(int index, Object element):

ArrayList<Integer> aList11 = new ArrayList<Integer>();
        aList11.add(4);
        aList11.add(8);
        aList11.add(12);
        aList11.add(16);
        aList11.add(20);
        aList11.add(24);
        System.out.println("The ArrayList:" + aList11);
        aList11.set(2,13);
        System.out.println("The ArrayList after setting 13 value at index 2:" + aList11);

// int size():
ArrayList<Integer> aList12 = new ArrayList<Integer>();
        aList12.add(1);
        aList12.add(2);
        aList12.add(3);
        aList12.add(4);
        aList12.add(5);
        aList12.add(6);
        System.out.println("Size of Arraylist is :" + aList12.size());

// Object[] toArray():
ArrayList<Integer> aList13 = new ArrayList<Integer>();
        aList13.add(2);
        aList13.add(4);
        aList13.add(6);
        aList13.add(8);
        System.out.println("ArrayList= "+aList13);
        Object[] object = aList13.toArray();
        for(int i=0;i<object.length;i++)
	{
        System.out.println("Value at index "+i+" of Array coverted from ArrayList= "+object[i]);
	}

// void trimToSize():

ArrayList<Integer> aList14 = new ArrayList<Integer>(10);
        aList14.add(1);
        aList14.add(2);
        aList14.add(3);
        aList14.add(4);
        aList14.trimToSize();
        System.out.println("Printing an ArrayList after using trimToSize method "+aList14);

// Boolean isEmpty(): 
ArrayList<String> aList15 = new ArrayList<String>(5);
        aList15.add("A");
        aList15.add("B");
        aList15.add("C");
        boolean flag3 = aList15.isEmpty();
        if(flag3==true)
	{
            System.out.println("ArrayList is Empty");
        }
        else
	{
            System.out.println("ArrayList is not Empty");
        }
        System.out.println("Using clear() method to empty ArrayList");
        aList15.clear();    
        boolean flag4 = aList15.isEmpty();
        if(flag4==true)
	{
            System.out.println("ArrayList is Empty");
        }

        else
	{
            System.out.println("ArrayList is not Empty");
        }

//Boolean remove(Object o):
ArrayList<String> aList16 = new ArrayList<String>(5);
        aList16.add("A");
        aList16.add("B");
        aList16.add("C");
        aList16.add("D");
        aList16.add("E");
        aList16.add("C");
        System.out.println("Elements in Arraylist= "+ aList16);
        boolean flag5= aList16.remove("C");
        System.out.println("ArrayList After Removing  Element C= "+aList16);
 }
}




