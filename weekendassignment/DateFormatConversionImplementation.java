/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */
class DateFormatConversion {
	static String convertDateFormat(String inputDate) {
		String outputDate = inputDate.replaceAll("/", "-");
		return outputDate;
	}
}

public class DateFormatConversionImplementation {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println(DateFormatConversion.convertDateFormat(sc.nextLine()));
	}
}
