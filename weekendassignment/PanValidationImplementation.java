package weekendassignment;

import java.util.Scanner;

class PanValidation {
	static boolean validatePAN(String pan) {
		if (pan.length() != 8)
			return false;
		return pan.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}");
	}
}

public class PanValidationImplementation {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter PAN : ");
		String firstString = sc.nextLine();
		if (PanValidation.validatePAN(firstString))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
