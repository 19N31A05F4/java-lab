/19N31A05F4
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

import java.util.ArrayList;
public class ALMethods19
{
public static void main(String[] args) 
{ 
//Object set(int index, Object element):

ArrayList<Integer> aList1 = new ArrayList<Integer>();
        aList1.add(4);
        aList1.add(8);
        aList1.add(12);
        aList1.add(16);
        aList1.add(20);
        aList1.add(24);
        System.out.println("The ArrayList:" + aList1);
        aList1.set(2,13);
        System.out.println("The ArrayList after setting 13 value at index 2:" + aList1);

// int size():
ArrayList<Integer> aList2 = new ArrayList<Integer>();
        aList2.add(1);
        aList2.add(2);
        aList2.add(3);
        aList2.add(4);
        aList2.add(5);
        aList2.add(6);
        System.out.println("Size of Arraylist is :" + aList2.size());

// Object[] toArray():
ArrayList<Integer> aList3 = new ArrayList<Integer>();
        aList3.add(2);
        aList3.add(4);
        aList3.add(6);
        aList3.add(8);
        System.out.println("ArrayList= "+aList3);
        Object[] object = aList3.toArray();
        for(int i=0;i<object.length;i++)
	{
        System.out.println("Value at index "+i+" of Array coverted from ArrayList= "+object[i]);
	}

// void trimToSize():

ArrayList<Integer> aList4 = new ArrayList<Integer>(10);
        aList4.add(1);
        aList4.add(2);
        aList4.add(3);
        aList4.add(4);
        aList4.trimToSize();
        System.out.println("Printing an ArrayList after using trimToSize method "+aList4);

// Boolean isEmpty(): 
ArrayList<String> aList5 = new ArrayList<String>(5);
        aList5.add("A");
        aList5.add("B");
        aList5.add("C");
        boolean flag1 = aList5.isEmpty();
        if(flag1==true)
	{
            System.out.println("ArrayList is Empty");
        }
        else
	{
            System.out.println("ArrayList is not Empty");
        }
        System.out.println("Using clear() method to empty ArrayList");
        aList5.clear();    
        boolean flag2 = aList5.isEmpty();
        if(flag2==true)
	{
            System.out.println("ArrayList is Empty");
        }

        else
	{
            System.out.println("ArrayList is not Empty");
        }

//Boolean remove(Object o):
ArrayList<String> aList6 = new ArrayList<String>(5);
        aList6.add("A");
        aList6.add("B");
        aList6.add("C");
        aList6.add("D");
        aList6.add("E");
        aList6.add("C");
        System.out.println("Elements in Arraylist= "+ aList6);
        boolean flag= aList6.remove("C");
        System.out.println("ArrayList After Removing  Element C= "+aList6);
 }
}
