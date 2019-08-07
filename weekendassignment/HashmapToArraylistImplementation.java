/**
 * 
 */
package weekendassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */

class HashmapToArraylist{
	private static ArrayList<String> validNames = new ArrayList<>();

	static ArrayList<String> getName(HashMap<Integer, String> employeeDetails){
		employeeDetails.forEach((k,v)->{
			if(v.matches("[a-z]+[A-Za-z]*([0-9])+([a-zA-Z])*[A-Z]")){
//				System.out.println(v);
				validNames.add(v);
			}
		});
		return validNames;
	}
}
public class HashmapToArraylistImplementation {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		sc.nextLine();
		HashMap<Integer, String> employeeDetails = new HashMap<>();
		for(int i=0;i<n;i++){
			int k = sc.nextInt();
			sc.nextLine();
			employeeDetails.put(k, sc.nextLine());
		}
		ArrayList<String> resultArray = HashmapToArraylist.getName(employeeDetails);
		resultArray.forEach(a->{
			System.out.println(a);
		});
	}

}
