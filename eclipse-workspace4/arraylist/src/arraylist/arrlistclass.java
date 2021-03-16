package arraylist;
import java.io.*;
import java.util.*;
public class arrlistclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> empname=new ArrayList<String>();
       empname.add("Dinesh");
       empname.add("Ajith");
       empname.add("Khaviya");
       empname.add("Ramya");
       empname.add("Magilan");
       System.out.println("The list1 is: "+empname);
      
       ArrayList<Integer> empid=new ArrayList<Integer>();
       empid.add(1);
       empid.add(2);
       empid.add(3);
       empid.add(4);
       empid.add(5);
       System.out.println("The list2 is: "+empid);
      
       empname.remove(4);
      // empid.remove(4);
       System.out.println("The remove particular list1 is: "+empname);
       System.out.println("The  list2 is: "+empid);
      empname.add("Sunil");
      System.out.println("The  name added in list1 is: "+empname);
       System.out.println("The list2 index value is: "+empid.get(2));
      
       ArrayList<Object> detail=new ArrayList<Object>();
       detail.addAll(empname);
      detail.addAll(empid);
       System.out.println("The lastlist add all list is: "+detail);
       detail.removeAll(empid);
       System.out.println("The lastlist remove all list is: "+detail);
      
   //   ArrayList<Integer> empid=new ArrayList<Integer>();
       empid.clear();
       empid.add(6);
       empid.add(7);
       empid.add(8);
       empid.add(9);
       empid.add(10);
       detail.addAll(empid);
       System.out.println("The lastlist is: "+detail);
       
	}

}
