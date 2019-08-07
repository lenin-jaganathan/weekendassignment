/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */
class MaximumDifference {
	static int findMaxDistance(int [] array){
		int maxIndex = 0;
		int adjacentDiff = 0;
		for(int i=0;i<array.length-1;i++){
			if(array[i+1]-array[i]>adjacentDiff){
				maxIndex = (array[i]>array[i+1]) ? i : i+1;
			}
		}
		
		return maxIndex;
	}
}

public class MaximumDifferenceImplementation {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
		}
		System.out.println(MaximumDifference.findMaxDistance(array));
	}

}
