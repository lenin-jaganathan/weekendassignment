package weekendassignment;

import java.util.Hashtable;
import java.util.Scanner;

class Anagram {
	static int getAnagram(String firstString, String secondString) {
		Hashtable<Character, Integer> firstHash = new Hashtable<>();
		Hashtable<Character, Integer> secondHash = new Hashtable<>();
		for (char c : firstString.toCharArray()) {
			if (firstHash.get(c) == null) {
				firstHash.put(c, 1);
			} else
				firstHash.put(c, (firstHash.get(c) + 1));
		}
		for (char c : secondString.toCharArray()) {
			if (secondHash.get(c) == null) {
				secondHash.put(c, 1);
			} else
				secondHash.put(c, (secondHash.get(c) + 1));
		}
		if (firstHash.equals(secondHash))
			return 1;
		else
			return -1;
	}
}

public class AnagramImplementation {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String firstString = sc.nextLine();
		System.out.println("Enter string 2: ");
		String secondString = sc.nextLine();
		if (Anagram.getAnagram(firstString, secondString) == 1)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}

}
