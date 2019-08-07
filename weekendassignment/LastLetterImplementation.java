/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */

class LastLetter {
	static String getLastLetter(String senetnce) {
		String finalString = "";

		for (int i = 0; i < senetnce.length(); i++) {
			if (senetnce.charAt(i) == ' ' && senetnce.charAt(i - 1) != ' ') {
				finalString += Character.toUpperCase(senetnce.charAt(i - 1)) + "$";
			}
		}
		if (senetnce.charAt(senetnce.length() - 1) != ' ')
			finalString += Character.toUpperCase(senetnce.charAt(senetnce.length() - 1)) + "$";
		return finalString.substring(0,finalString.length()-1);
	}
}

public class LastLetterImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(LastLetter.getLastLetter(sc.nextLine()));
	}

}
