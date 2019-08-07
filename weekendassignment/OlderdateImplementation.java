package weekendassignment;

import java.util.Scanner;

class OlderDate {
	static String findOldDate(String firstDate, String secondDate) {
		String olderDate = "";
		String[] firstDateArray = firstDate.split("-");
		String[] secondDateArray = secondDate.split("-");
		if (Integer.parseInt(firstDateArray[2]) > Integer.parseInt(secondDateArray[2])) {
			return secondDateArray[0] + "/" + secondDateArray[1] + "/" + secondDateArray[2];
		} else if (Integer.parseInt(firstDateArray[2]) < Integer.parseInt(secondDateArray[2])) {
			return firstDateArray[0] + "/" + firstDateArray[1] + "/" + firstDateArray[2];
		} else if (Integer.parseInt(firstDateArray[1]) > Integer.parseInt(secondDateArray[1])) {
			return secondDateArray[0] + "/" + secondDateArray[1] + "/" + secondDateArray[2];
		} else if (Integer.parseInt(firstDateArray[1]) < Integer.parseInt(secondDateArray[1])) {
			return firstDateArray[0] + "/" + firstDateArray[1] + "/" + firstDateArray[2];
		} else if (Integer.parseInt(firstDateArray[0]) > Integer.parseInt(secondDateArray[0])) {
			return secondDateArray[0] + "/" + secondDateArray[1] + "/" + secondDateArray[2];
		} else
			return firstDateArray[0] + "/" + firstDateArray[1] + "/" + firstDateArray[2];

	}
}

public class OlderdateImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println(OlderDate.findOldDate(sc.nextLine(), sc.nextLine()));
	}

}
