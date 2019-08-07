/**
 * 
 */
package weekendassignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */
class AgeForVoting {
	static boolean findEligibility(String dob) {
		String[] dobArray = dob.split("/");
		LocalDate today = LocalDate.of(2015, 1, 1);
		LocalDate dobDate = LocalDate.of(Integer.parseInt(dobArray[2]), Integer.parseInt(dobArray[1]),
				Integer.parseInt(dobArray[0]));
		Period p = Period.between(dobDate, today);
		if (p.getYears() < 18)
			return false;
		else
			return true;
	}
}

public class AgeForVotingImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		if(AgeForVoting.findEligibility(sc.nextLine())){
			System.out.println("Eligible");
		} else 
			System.out.println("Not Eligible");
	}

}
