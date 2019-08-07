/**
 * 
 */
package weekendassignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */

class ArraylistAndSet {
	static ArrayList<Integer> performSetOperations(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray,
			char operator) {
		ArrayList<Integer> resultArray = new ArrayList<>();
		if (operator == '+') {
			resultArray.addAll(firstArray);
			for(int i: secondArray){
				if(!firstArray.contains(i)){
					resultArray.add(i);
				}
			}
		} else if (operator == '*') {
			firstArray.retainAll(secondArray);
			resultArray = firstArray;
		} else if (operator == '-') {
			// ArrayList<Integer> dup_array = new ArrayList<>();
			for (int i : firstArray) {
				if (!secondArray.contains(i)) {
					resultArray.add(i);
				}
			}
		}
		return resultArray;
	}
}

public class ArraylistAndSetImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		ArrayList<Integer> firstArray = new ArrayList<>(n);
		ArrayList<Integer> secondArray = new ArrayList<>(n);
		System.out.println("Enter first array: ");
		for (int i = 0; i < n; i++) {
			firstArray.add(sc.nextInt());
		}
		System.out.println("Enter second array: ");
		for (int i = 0; i < n; i++) {
			secondArray.add(sc.nextInt());
		}
		System.out.println("Set operator ");
		char operator = sc.next().charAt(0);
		ArrayList<Integer> resultArray = ArraylistAndSet.performSetOperations(firstArray, secondArray, operator);
		for (int i : resultArray) {
			System.out.print((i) + " ");
		}
	}

}
