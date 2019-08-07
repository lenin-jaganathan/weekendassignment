/**
 * 
 */
package weekendassignment;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */

class MasteringHashmap {
	static int sum = 0;
	static int getAverageOfOdd(HashMap<Integer, Integer> keyVal, int n) {
		keyVal.forEach((key, value) -> {
			if (key % 2 == 0)
				sum += value;
		});
		return sum / n;
	}
}

public class MasteringHashmapImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		HashMap<Integer, Integer> keyVal = new HashMap<>();
		for (int i = 0; i < n; i++) {
			keyVal.put(sc.nextInt(), sc.nextInt());
		}
		 System.out.println("Average is : " +MasteringHashmap.getAverageOfOdd(keyVal, n));;
	}

}
