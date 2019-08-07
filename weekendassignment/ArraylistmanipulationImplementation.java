/**
 * 
 */
package weekendassignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */
class ArrayListManipulation{
	static ArrayList<Integer> generateOddEvenList(ArrayList<Integer> firstArray,ArrayList<Integer> secondArray,int n){
		ArrayList<Integer> resultArray = new ArrayList<>(n);
		resultArray.add(secondArray.get(0));
		for(int i=1;i<n;i++){
			if(i%2==0){
				resultArray.add(secondArray.get(i));
			} else {
				resultArray.add(firstArray.get(i));
			}
		}
		return resultArray;
	}
}


public class ArraylistmanipulationImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		ArrayList<Integer> firstArray = new ArrayList<>(n);
		ArrayList<Integer> secondArray = new ArrayList<>(n);
		System.out.println("Enter first array: ");
		for(int i=0;i<n;i++){
			firstArray.add(sc.nextInt());
		}
		System.out.println("Enter second array: ");
		for(int i=0;i<n;i++){
			secondArray.add(sc.nextInt());
		}
		ArrayList<Integer> resultArray = ArrayListManipulation.generateOddEvenList(firstArray,secondArray,n);
		for(int i=0;i<n;i++){
			System.out.print(resultArray.get(i)+" ");
		}
	}

}
