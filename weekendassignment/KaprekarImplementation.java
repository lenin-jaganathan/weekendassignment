package weekendassignment;

import java.util.Scanner;

class Kaprekar {
	static int getKaprekarNumber(int n){
		int squareNumeber = n*n;
		String squareString = Integer.toString(squareNumeber);
		int len = squareString.length();
		String[] splitString = new String[2];
		splitString[0]= squareString.substring(0,len/2);
		splitString[1] = squareString.substring(len/2,len);
		int sumNumber = Integer.parseInt(splitString[0]) + Integer.parseInt(splitString[1]);
		
		if(n==sumNumber){
			return 1;
		} else 
			return 0;
	}
}

public class KaprekarImplementation {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		if(Kaprekar.getKaprekarNumber(sc.nextInt())==1){
			System.out.println("Kaprekar Number");
		} else {
			System.out.println("Not A Kaprekar Number");
		}
	}

}
