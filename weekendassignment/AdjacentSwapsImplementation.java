package weekendassignment;

import java.util.Scanner;

class AdjacentSwaps{
	static String swapPairs(String firstString){
		String resultString= "";
		if(firstString.length()%2==0){
			for(int i=0;i<firstString.length();i=i+2){
				resultString+=firstString.charAt(i+1);
				resultString+=firstString.charAt(i);
			}
		} else {
			for(int i=0;i<firstString.length()-1;i=i+2){
				resultString+=firstString.charAt(i+1);
				resultString+=firstString.charAt(i);
			}
			resultString += firstString.charAt(firstString.length()-1);
		}
		return resultString;
	}
}

public class AdjacentSwapsImplementation {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String firstString = sc.nextLine();
		System.out.println(AdjacentSwaps.swapPairs(firstString));
	}

}
