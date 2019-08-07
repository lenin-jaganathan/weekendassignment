package weekendassignment;

import java.util.Scanner;

class ProfitorLoss {
	
	public static float computeProfitPercentage(int x, int y, int z) {
		float costPrice = (float) (y / 12.0) ;
		float profit = z - costPrice ;
		float profitPercentage = profit / costPrice * 100 ;
		return profitPercentage ;
	}
	
}

public class ProfirorLossImplementation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int x, y, z ;
		System.out.println("Enter the number of dozens of toys purchased");
		x = sc.nextInt() ;
		System.out.println("Enter the price per dozen");
		y = sc.nextInt() ;
		System.out.println("Enter the selling price of 1 toy");
		z = sc.nextInt() ;
		
		float profitPercentage = ProfitorLoss.computeProfitPercentage(x, y, z);
		System.out.println("Sam's profit percentage is "+String.format("%.2f", profitPercentage));
		sc.close();
	}
	
}
