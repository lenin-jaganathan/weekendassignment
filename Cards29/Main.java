package Cards29;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		String symbol;
		int number;
		int count=0;
		Set<Card> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		while(set.size() != 4) {
			System.out.println("Enter a card :");
			symbol = sc.next();
			number = sc.nextInt();
			set.add(new Card(symbol, number));
			count++;
		}
		System.out.format("Four symbols gathered in %d cards.\nCards in Set are :\n", count);
		set.forEach(action -> System.out.println(action));
	}
}