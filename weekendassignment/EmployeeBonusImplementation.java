package weekendassignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class EmployeeBonus {
	
	public static Map<String,Integer> calculateRevisedSalary(Map<String, String> dobMap, Map<String, Integer> salaryMap) {
		
		Map<String, Integer> revisedSalaryMap = new TreeMap<>() ;
		
		for(Map.Entry<String, String> dobMapEntry: dobMap.entrySet()) {
			
			String empId = dobMapEntry.getKey() ;
			Integer baseSalary = salaryMap.get(empId);
			LocalDate currentDate = LocalDate.parse("01-09-2014", DateTimeFormatter.ofPattern("dd-MM-yyyy")) ;
			LocalDate empDobDate = LocalDate.parse(dobMapEntry.getValue(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			int age = Period.between(empDobDate, currentDate).getYears() ;
			if(age >= 25 && age <= 30) {
				revisedSalaryMap.put(empId, (int)((1.2) * baseSalary )) ;
			} else if (age > 30 && age <= 60) {
				revisedSalaryMap.put(empId, (int)((1.3) * baseSalary)) ;
			}
			if(age < 25 || age > 60) 
				revisedSalaryMap.put(empId, -200) ;
			if(baseSalary < 5000) 
				revisedSalaryMap.put(empId, -100) ;
		}
		
		return revisedSalaryMap ;
		
	}
	
}

public class EmployeeBonusImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfEmployees = sc.nextInt() ;
		Map<String,String> dobMap = new TreeMap<>() ;
		Map<String, Integer> salaryMap = new TreeMap<>() ;
		for(int i=0; i < numberOfEmployees; i++) {
			String empId = sc.next() ;
			String dobString = sc.next() ;
			Integer baseSalary = sc.nextInt() ;
			dobMap.put(empId, dobString);
			salaryMap.put(empId, baseSalary);
		}
		Map<String, Integer> revisedSalaryMap = EmployeeBonus.calculateRevisedSalary(dobMap, salaryMap);
		for(Map.Entry<String, Integer> entry : revisedSalaryMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		sc.close();
		
	}
	
}
