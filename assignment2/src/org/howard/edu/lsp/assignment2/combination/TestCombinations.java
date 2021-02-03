package org.howard.edu.lsp.assignment2.combination;
import java.util.*; 

/**
* The TestCombination class implements an application that
* takes in an array and a target sum. It then returns sets 
* of the indexes of the numbers that add up to the target sum.
*
* The calculate method takes in the inputs and returns the resultant sets.
* The recurse method uses recursion to develop the set of numbers adding up to 
* the target sum.
* 
* @author  Oluwatoni Oshikanlu
* @version 1.0
* @since   2021-02-01
*/
public class TestCombinations {
	/**
	 * The calculate method returns the final solution of sets.
	 * @param array
	 * @param target_sum
	 * @return solution
	 */
	public static ArrayList<ArrayList<Integer>> calculate(int[] array , int target_sum) {
		
		ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<>();
		recurse(array , target_sum, temp, solution, 0);
		return solution;     
    }
	/**
	 * The recurse method uses recursion to calculate the index of the numbers 
	 * in the set by subtracting them from the target sum until it reaches 0.
	 * @param array
	 * @param target_sum
	 * @param temp
	 * @param solution
	 * @param index
	 */
	static void recurse(int[] array , int target_sum, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> solution, int index ) {
			
			if (target_sum == 0) {
				solution.add(new ArrayList<>(temp));
				return;
			} else if ( target_sum < 0) {
				return;
			} else{ 
		        for(int i = index; i < array.length; i++){
		            temp.add(i);
		            recurse(array, target_sum - array[i], temp, solution, i+1);
		            temp.remove(temp.size() - 1);
		        }
		    } 
	    }
}
