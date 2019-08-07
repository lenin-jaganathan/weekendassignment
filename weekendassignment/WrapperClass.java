package weekendassignment;

import java.util.Scanner;

public class WrapperClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer bin,oct,hex ;
		String binStr, octStr, hexStr ;
		System.out.println("Enter the binary number");
		bin = Integer.parseInt((binStr=sc.next()), 2);
		System.out.println("Enter the octal number");
		oct = Integer.parseInt((octStr = sc.next()), 8);
		System.out.println("Enter the hexadecimal number");
		hex = Integer.parseInt((hexStr = sc.next()), 16);
		
		System.out.println(String.format("the integer value of binary number %s is %d", binStr, bin));
		System.out.println(String.format("the integer value of octal number %s is %d", octStr, oct));
		System.out.println(String.format("the integer value of hexadecimal number %s is %d", hexStr, hex));
		sc.close();
	}
	
}
