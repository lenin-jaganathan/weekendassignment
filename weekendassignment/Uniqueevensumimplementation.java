package weekendassignment;

import java.util.HashMap;
import java.util.Scanner;

class Uniqueevensum{
	static int addUniqueEven(int[] array,int n){
		int sum = 0;
		for(int i=0;i<n;i++){
			if(array[i]%2==0){
				sum+=array[i];
			}
		}
		return sum;
	}
}

public class Uniqueevensumimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
		}
		int result = Uniqueevensum.addUniqueEven(array, n) ;
		if(result > 0){
			System.out.println(result);
		} else {
			System.out.println("No even numbers");
		}
	}

}
