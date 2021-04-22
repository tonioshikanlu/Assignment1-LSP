package org.howard.edu.lsp.exam.question41;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tests {

	@Test
	void test() {
		ArrayList<Integer> numbers = new ArrayList<Integer>() {
            {
                add(1);
                add(0);
                add(2);
                add(0);
                add(0);
                add(2);
            }
        };
		removeZeroesClass class1 = new removeZeroesClass(numbers);
		ArrayList<Integer> expected = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(2);
            }
        };
        
		assertEquals("error in test()",expected ,class1.removeZeroes());
	}

}
