/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */

class MaxvowelWord {
	static String storeMaxVowelWord(String sentence) {
		int vowelMaxCount = 0;
		int vowelCount = 0;
		String[] sentenceSplit = sentence.split(" ");
		String word = "";
		for (String words : sentenceSplit) {
			vowelCount=0;
			for (char ch : words.toCharArray()) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				}
			}
			if(vowelCount > vowelMaxCount){
				vowelMaxCount = vowelCount;
				word = words;
			}
		}
		return word;
	}
}

public class MaxVowelWordImplementation {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		System.out.println(MaxvowelWord.storeMaxVowelWord(sc.nextLine()));
	}

}
