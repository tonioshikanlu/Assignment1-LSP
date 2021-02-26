package org.howard.edu.lsp.assignment4.implementation;

import java.util.*;


/**
 * The IntegerSet class implements a custom set with various functions
 * such as adding, removing, union etc. 
 * @author tonioshikanlu
 *@version 1.0
 *@since 2021-02-25
 */
public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();
	/**
	 * This is the constructor.
	 * @param set
	 */
	public IntegerSet(ArrayList set) {
	       this.set = set;
	   }
/**
 * Clears set.
 */
// Clears the internal representation of the set
public void clear() {
	set.clear();
};
/**
 * Returns Set length
 * @return
 */
// Returns the length of the set
public int length() {
	return set.size();
}; // returns the length
/***
 * Returns equality of sets.
 * @param b
 * @return
 */
/*
 * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
*/
public boolean equals(IntegerSet b) {   
	ArrayList<Integer> temp=(ArrayList<Integer>) b.set;
	Collections.sort(set);
    Collections.sort(temp);
    boolean isEqual = set.equals(temp);    
    return isEqual;
}; 
/**
 * Returns containment of value in set.
 * @param value
 * @return
 */
// Returns true if the set contains the value, otherwise false
public boolean contains(int value) {
	boolean isContained = set.contains(value);
	return isContained;
};
/**
 * Returns max element in set.
 * @return
 * @throws IntegerSetException
 */
// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
public int largest() throws IntegerSetException {
	if (set.size() == 0) {
		IntegerSetException e= new IntegerSetException();
        throw e;
	}
	return Collections.max(set);
}; 
/**
 * Returns min element in set.
 * @return
 * @throws IntegerSetException
 */
// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
public int smallest() throws IntegerSetException {
	if (set.size() == 0) {
		IntegerSetException e= new IntegerSetException();
        throw e;
	}
	return Collections.min(set);
};
/**
 * Adds elements to set.
 * @param item
 */
// Adds an item to the set or does nothing it already there	
public void add(int item) {
	if (set.contains(item)) {
		return;
	} else {
		set.add(item);
	}
	
		
}; // adds item to s or does nothing if it is in set
/**
 * Removes element from set.
 * @param item
 */
// Removes an item from the set or does nothing if not there
public void remove(int item) {
	if (set.contains(item)) {
		set.remove(Integer.valueOf(item));
	} else {
		return;
	}
		
};
/**
 * Unionizes two sets.
 * @param intSetb
 */
// Set union
public void union(IntegerSet intSetb) {
	ArrayList<Integer> temp=(ArrayList<Integer>) intSetb.set;
	for (Integer s : temp)
	{
	   if (set.contains(s)){} else {
		   set.add(s);
	   }
	}
   
};
/**
 * Intersects two sets.
 * @param intSetb
 */
// Set intersection
public void intersect(IntegerSet intSetb) {
	ArrayList<Integer> temp=(ArrayList<Integer>) intSetb.set; 
    set.retainAll(temp);
   
}; 
/**
 * Returns difference of two sets.
 * @param intSetb
 */
// Set difference, i.e., s1 –s2
public void diff(IntegerSet intSetb) {
	ArrayList<Integer> temp=(ArrayList<Integer>) intSetb.set; 
    set.removeAll(temp);
   
}; // set difference, i.e. s1 - s2
/**
 * Returns whether or not set is empty.
 * @return
 */
// Returns true if the set is empty, false otherwise
public boolean isEmpty() {
	return set.isEmpty();
}; 
/**
 * Stringifies set.
 */
// Return String representation of your set
public String toString() {
	String listString = "";

	for (Integer s : set)
	{
	    listString += s + "\t";
	}
	return listString;

};	// return String representation of your set

}

