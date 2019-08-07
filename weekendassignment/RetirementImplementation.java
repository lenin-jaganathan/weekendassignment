/**
 * 
 */
package weekendassignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * @author ljaganathan
 *
 */

class Retirement {
	static ArrayList<String> retirementEmployeeList(HashMap<String, String> employee) {
		ArrayList<String> eligibleEmployees = new ArrayList<>();

		LocalDate currentDate = LocalDate.of(2014,1,1);
		
		employee.forEach((k, v) -> {
			String[] dob = v.split("/");
			Period time = Period.between(LocalDate.of(Integer.parseInt(dob[2]),Integer.parseInt(dob[1]),Integer.parseInt(dob[0])), currentDate);
			if(time.getYears()>=60){
				eligibleEmployees.add(k);
			}
		});

		return eligibleEmployees;
	}
}

public class RetirementImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		HashMap<String, String> employee = new HashMap<>();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			employee.put(sc.nextLine(), sc.nextLine());
		}
		ArrayList<String> eligibleEmployees = Retirement.retirementEmployeeList(employee);
		for(String s: eligibleEmployees){
			System.out.println(s);
		}
	}

}
