/**
 * 
 */
package weekendassignment;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */
class StringProcessing {
	static int getLastDayofMonth(String date) {
		LocalDate formatDate = LocalDate.of(Integer.parseInt(date.split("-")[2]), Integer.parseInt(date.split("-")[1]), Integer.parseInt(date.split("-")[0]));
		
		return formatDate.lengthOfMonth();
	}
}

public class StringProcessingImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(StringProcessing.getLastDayofMonth(sc.nextLine()));
	}

}
