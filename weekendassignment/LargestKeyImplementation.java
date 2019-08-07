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
class LargestKey{
	private static String largestString = "";
	private static int largestKey = 0;
	static String getMaxKeyValue(HashMap<Integer, String> hash){
		
		hash.forEach((k,v)->{
			if(k > largestKey){
				largestString = v;
				largestKey = k;
			}
		});
		
		return largestString;
	}
}

public class LargestKeyImplementation {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		sc.nextLine();
		HashMap<Integer, String> hash = new HashMap<>();
		for(int i=0;i<n;i++){
			int key = sc.nextInt();
			sc.nextLine();
			hash.put(key, sc.nextLine());
		}
		System.out.println(LargestKey.getMaxKeyValue(hash));
	}

}
