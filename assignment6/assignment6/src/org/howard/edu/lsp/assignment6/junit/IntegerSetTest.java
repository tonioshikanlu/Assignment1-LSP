package org.howard.edu.lsp.assignment6.junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.lsp.assignment6.implementation.*;
import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	
	@Test
	@DisplayName("Test cases for length")
	public void testLength() {
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(1);
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
		
		assertEquals("error in length()",  7, set1.length());
		assertEquals("error in length()",  9, set2.length());
		assertEquals("error in length()",  7, set3.length());
		assertEquals("error in length()",  0, set4.length());
		assertNotEquals("error in length()",  20, set4.length());
	}
	
	@Test
	@DisplayName("Test cases for toString")
	public void testToString() {
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(1);
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	
		assertNotEquals("error in toString()",  "1 2 3 4 5 6 7 8 9", set2.toString());
		assertNotEquals("error in toString()",  "", set3.toString());
		assertEquals("error in toString()",  "", set4.toString());
	}
	
	@Test
	@DisplayName("Test cases for equals")
	public void testEquals() {
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(1);
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	
		assertEquals("error in equals()",  true, set1.equals(set3));
		assertEquals("error in equals()",  false, set3.equals(set2));
		assertEquals("error in equals()",  true, set3.equals(set1));
		assertEquals("error in equals()",  false, set4.equals(set3));

	}
	
	@Test
	@DisplayName("Test cases for largest")
	public void testLargest() throws IntegerSetException {
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(1);
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	
		assertEquals("error in largest()",  7, set1.largest());
		assertEquals("error in largest()",  9, set2.largest());
		assertEquals("error in largest()",  7, set3.largest());
		Exception exception = assertThrows(Exception.class, () -> set4.largest());
		
	}
	
	@Test
	@DisplayName("Test cases for smallest")
	public void testSmallest() throws IntegerSetException {
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(1);
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	
		assertEquals("error in smallest()",  1, set1.smallest());
		assertEquals("error in smallest()",  1, set2.smallest());
		assertEquals("error in smallest()",  1, set3.smallest());
		Exception exception = assertThrows(Exception.class, () -> set4.smallest());
		
	}
	
	@Test
	@DisplayName("Test cases for isEmpty")
	public void testIsEmpty() {
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(1);
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	
		assertEquals("error in isEmpty()",  false, set1.isEmpty());
		assertEquals("error in isEmpty()",  false, set2.isEmpty());
		assertEquals("error in isEmpty()",  false, set3.isEmpty());
		assertEquals("error in isEmpty()",  true, set4.isEmpty());
		
	}
	
	@Test
	@DisplayName("Test cases for contains")
	public void testContains() {
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(1);
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	
		assertEquals("error in contains()",  false, set1.contains(11));
		assertEquals("error in contains()",  true, set2.contains(1));
		assertEquals("error in contains()",  true, set3.contains(2));
		assertEquals("error in contains()",  false, set4.contains(10));
		
	}
	
	@Test
	@DisplayName("Test cases for add")
	public void testAdd() {
		
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
		
		set2.add(1);
		set3.add(2);
		    	
		assertEquals("error in add()",  false, set1.contains(1));
		assertEquals("error in add()",  true, set2.contains(1));
		assertEquals("error in add()",  true, set3.contains(2));
		assertEquals("error in add()",  false, set4.contains(10));
		
	}
	
	@Test
	@DisplayName("Test cases for remove")
	public void testRemove() {
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		int1.add(8);
		int1.add(9);
		IntegerSet set1 = new IntegerSet(int1);
    	set1.remove(1);
		    	
		assertEquals("error in remove()",  false, set1.contains(1));
		
	}
	
	@Test
	@DisplayName("Test cases for clear")
	public void testClear() {
		
		ArrayList int1 = new ArrayList<Integer>();
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	set2.clear();
		set4.clear();
		assertEquals("error in clear()",  true, set2.isEmpty());
		assertEquals("error in clear()",  true, set4.isEmpty());
	}
	
	@Test
	@DisplayName("Test cases for union")
	public void testUnion() {
		
		ArrayList int1 = new ArrayList<Integer>();
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	
    	set3.union(set2);
    	set4.union(set1);

    	assertEquals("error in union()",  "1\t2\t3\t4\t5\t6\t7\t8\t9\t", set3.toString());
    	assertEquals("error in union()",  "", set4.toString());
	}
	
	@Test
	@DisplayName("Test cases for intersect")
	public void testIntersect() {
		
		ArrayList int1 = new ArrayList<Integer>();
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	
    	set3.intersect(set2);
    	set4.intersect(set1);

    	assertEquals("error in intersect()",  "2\t3\t4\t5\t6\t7\t", set3.toString());
    	assertEquals("error in intersect()",  "", set4.toString());
	}
	
	@Test
	@DisplayName("Test cases for diff")
	public void testDiff() {
		
		ArrayList int1 = new ArrayList<Integer>();
		IntegerSet set1 = new IntegerSet(int1);
		
		ArrayList int2 = new ArrayList<Integer>();
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(6);
		int2.add(7);
		int2.add(8);
		int2.add(9);
		IntegerSet set2 = new IntegerSet(int2);
		
		ArrayList int3 = new ArrayList<Integer>();
		int3.add(1);
		int3.add(2);
		int3.add(3);
		int3.add(4);
		int3.add(5);
		int3.add(6);
		int3.add(7);
		IntegerSet set3 = new IntegerSet(int3);
		
		ArrayList int4 = new ArrayList<Integer>();
		IntegerSet set4 = new IntegerSet(int4);
    	
    	set2.diff(set3);
    	set4.diff(set1);

    	assertEquals("error in diff()",  "8\t9\t", set2.toString());
    	assertEquals("error in diff()",  "", set4.toString());
	}

}
