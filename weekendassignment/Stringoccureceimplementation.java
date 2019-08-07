package weekendassignment;

import java.util.Scanner;

class Stringoccurence {
	static int countNoOfWords(String firstString, String secondString) {
		String resultString = "";
		int count = 0;
		
		String[] firstStringArray = firstString.split(" ");
		String secondWord = secondString.split(" ")[1];
		for(int i=0;i<firstStringArray.length;i++){
			if(firstStringArray[i].equals(secondWord)){
				count++;
			}
		}
		return count;
	}
}

public class Stringoccureceimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String firstString = sc.nextLine();
		System.out.println("Enter string 2: ");
		String secondString = sc.nextLine();
		System.out.println(Stringoccurence.countNoOfWords(firstString, secondString));
	}

}
