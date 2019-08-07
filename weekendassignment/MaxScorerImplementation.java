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

class MaxScorer {
	static String highestScorer(ArrayList<String> studentList) {
		int maxScore = 0;
		String maxStudent = " ";
		for (String student : studentList) {
			String[] studentDetails = student.split("-");
			int score = Integer.parseInt(studentDetails[1]) + Integer.parseInt(studentDetails[2])
					+ Integer.parseInt(studentDetails[3]);
			if(score > maxScore){
				maxScore = score;
				maxStudent = studentDetails[0];
			}
		}

		return maxStudent;
	}
}

public class MaxScorerImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> studentList = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			studentList.add(sc.nextLine());
		}
		System.out.println(MaxScorer.highestScorer(studentList));
	}

}
