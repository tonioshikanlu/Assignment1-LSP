package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.TestCombinations;
import java.util.*; 

/**
* The Test class implements an application that
* test the functionality and correctness of the 
* Testcombinations program.
* 
* The output method prints out the resultant sets 
* after the input is run on.
*
* @author  Oluwatoni Oshikanlu
* @version 1.0
* @since   2021-02-01
*/
public class Test {
	/**
	 * Main function holding test cases.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		ArrayList<ArrayList<Integer>> solution1 = TestCombinations.calculate(arr1,6);
		output(arr1, solution1, 1, 6);
		
		int[] arr2 = {5,5,15,10};
		ArrayList<ArrayList<Integer>> solution2 = TestCombinations.calculate(arr2,15);
		output(arr2, solution2, 2, 15);
		
		int[] arr3 = {1};
		ArrayList<ArrayList<Integer>> solution3 = TestCombinations.calculate(arr3,1);
		output(arr3, solution3, 3, 1);
		
		int[] arr4 = {};
		ArrayList<ArrayList<Integer>> solution4 = TestCombinations.calculate(arr4,10);
		output(arr4, solution4, 4, 10);
		
		int[] arr5 = {1,2,3,4,5,6,7,8,9};
		ArrayList<ArrayList<Integer>> solution5 = TestCombinations.calculate(arr5,74);
		output(arr5, solution5, 5, 74);
		
		int[] arr6 = {1,1,1,1};
		ArrayList<ArrayList<Integer>> solution6 = TestCombinations.calculate(arr6,4);
		output(arr6, solution6, 6, 4);
		
		int[] arr7 = {10,8,6,4,2,2};
		ArrayList<ArrayList<Integer>> solution7 = TestCombinations.calculate(arr7,12);
		output(arr7, solution7, 7, 12);
		
		int[] arr8 = {1000000000,1000000,1000000,1000,99999};
		ArrayList<ArrayList<Integer>> solution8 = TestCombinations.calculate(arr8,1001000);
		output(arr8, solution8, 8, 1001000);
		
		int[] arr9 = {1,2,3,4,5,6};
		ArrayList<ArrayList<Integer>> solution9 = TestCombinations.calculate(arr9,0);
		output(arr9, solution9, 9, 0);
		
		int[] arr10 = {0,0,0,0,0,0};
		ArrayList<ArrayList<Integer>> solution10 = TestCombinations.calculate(arr10,15);
		output(arr10, solution10, 10, 15);
	}
	/**
	 * Output function prints out resultant sets.
	 * @param array
	 * @param num
	 */
	public static void output(int[] inputarray, ArrayList<ArrayList<Integer>> array, int num, int targetsum) {
		System.out.println("Test " + num);
		System.out.println("Inputs: List: "+Arrays.toString(inputarray)+" , Target Sum: "+ targetsum);
		System.out.println("Answer " + num);
		for (ArrayList<Integer> arr : array) {
			System.out.println(arr);
		}
		System.out.println("\n");
	}
}