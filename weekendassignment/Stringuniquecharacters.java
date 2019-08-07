package weekendassignment;

import java.util.Scanner;

class UserMainCode{
	static String replacePlus(String firstString,String secondString){
		int[] hashArray = new int[26]; //creating a hash array of 26
		String resultString= "";
		//To ignore case
		String firstStringConverted = firstString.toLowerCase(); 
		String secondStringConverted = secondString.toLowerCase();
		for(char c: secondStringConverted.toCharArray()){
			hashArray[c-97]++; 
		}
		for(int i=0;i<firstString.length();i++){
			if(hashArray[firstStringConverted.charAt(i)-97]==0){
				resultString += "+"; //Adding + for characters with no occurrence
			} else {
				resultString += firstString.charAt(i);
			}
		}
		return resultString;
	}
}

public class Stringuniquecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String firstString = sc.nextLine();
		System.out.println("Enter string 2: ");
		String secondString = sc.nextLine();
		System.out.println(UserMainCode.replacePlus(firstString, secondString));
	}

}
