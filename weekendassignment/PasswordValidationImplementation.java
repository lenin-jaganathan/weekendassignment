package weekendassignment;

import java.util.Scanner;

class PasswordValidation {
	static boolean validatePassword(String password) {

		return password.matches("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=]).{8,}$");
	}
}

public class PasswordValidationImplementation {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter password : ");
		String firstString = sc.nextLine();
		if (PasswordValidation.validatePassword(firstString))
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
	}

}
