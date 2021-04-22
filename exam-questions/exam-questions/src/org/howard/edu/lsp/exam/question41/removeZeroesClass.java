package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class removeZeroesClass {
	public removeZeroesClass(ArrayList<Integer> numbers)
   {
		this.numbers = numbers;
	}

public ArrayList<Integer> removeZeroes()
   {
	ArrayList<Integer>finalArray  = new ArrayList<Integer>();
	for (int i = 0; i < numbers.size(); i++) {
        if ((Integer) numbers.get(i) != 0) {
        	finalArray.add((Integer) numbers.get(i));
        }
    }
	return finalArray;
   }

ArrayList<Integer> numbers;
}