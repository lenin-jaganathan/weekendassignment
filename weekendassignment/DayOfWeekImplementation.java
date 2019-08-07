/**
 * 
 */
package weekendassignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * @author ljaganathan
 *
 */
class DayOfWeek{
	static String getDay(String date){
		String day="";
		SimpleDateFormat dFormat = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat dayName = new SimpleDateFormat("EEEE");
		Date formatDate ;
		
		try {
			formatDate = dFormat.parse(date);
			day =  (dayName.format(formatDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  day;
	}
}

public class DayOfWeekImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println(DayOfWeek.getDay(sc.nextLine()));
	}

}
