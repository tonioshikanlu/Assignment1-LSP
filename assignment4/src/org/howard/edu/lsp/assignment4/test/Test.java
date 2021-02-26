
package org.howard.edu.lsp.assignment4.test;

import java.util.*;
import org.howard.edu.lsp.assignment4.implementation.*;
/**
 * Tests the functionality of my code.
 * @author tonioshikanlu
 *
 */
public class Test {
	/**
	 * Main function driving my code.
	 * @param args
	 * @throws IntegerSetException
	 */
   public static void main(String[] args) throws IntegerSetException {
      
ArrayList<Integer> list1= new ArrayList<>();
ArrayList<Integer> list2= new ArrayList<>();
ArrayList<Integer> list3= new ArrayList<>();
ArrayList<Integer> list4= new ArrayList<>();

  
  
IntegerSet set1= new IntegerSet(list1);
IntegerSet set2= new IntegerSet(list2);
IntegerSet set3= new IntegerSet(list3);
IntegerSet set4= new IntegerSet(list4);

  
set1.add(1);
set1.add(2);
set1.add(3);
set1.add(4);
set1.add(5);
set1.add(6);
set1.add(7);
set1.add(7);
  
set2.add(1);
set2.add(2);
set2.add(3);
set2.add(4);
set2.add(5);
set2.add(6);
set2.add(7);
set2.add(8);
set2.add(9);

set3.add(1);
set3.add(2);
set3.add(3);
set3.add(4);
set3.add(5);
set3.add(6);
set3.add(7);
set3.add(7);
  
System.out.println("Set 1 : "+set1.toString());
System.out.println("Set 2 : "+set2.toString());
System.out.println("Set 3 : "+set3.toString());
System.out.println("Set 4 : "+set4.toString());

  
System.out.println("Is Set1 equal to Set2 : "+set1.equals(set2));
System.out.println("Is Set1 equal to Set3 : "+set1.equals(set3));
  
System.out.println("Largest element in set1 : "+set1.largest());
  
System.out.println("Smallest element in set2 : "+set2.smallest());

set1.intersect(set2);
System.out.println("Set 1 after Intersection with Set 2: "+set1.toString());

set1.union(set2);
System.out.println("Set 1 after Union with Set 2: "+set1.toString());

System.out.println("Set 1 length: "+set1.length());

set2.diff(set3);
System.out.println("Set 2 after diff with Set 3: "+set2.toString());

set1.remove(1);
System.out.println("Set 1 after removing 1: "+set1.toString());

System.out.println("Set 1 contains 1: "+set1.contains(1));

System.out.println("Set 1 contains 2: "+set1.contains(2));

set1.clear();
System.out.println("Set 1 after clearing: "+set1.toString());

System.out.println("Set 1 is empty: "+set1.isEmpty());

// Will throw errors for empty list.
System.out.println("Largest element in set4 : "+set4.largest());

     
   }

}