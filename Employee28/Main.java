package Employee28;

import java.util.*;

public class Main {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Employee> arr=new ArrayList<Employee>();
		
		System.out.println("Enter the number of Employees");
		
		int ecount = sc.nextInt();
		
		for(int i=0;i<ecount;i++){
			System.out.println(" Enter Employee " + (i+1) + " Details : ");
			System.out.println("Enter the Firstname");
			String fname=sc.next();
			System.out.println("Enter the Lastname");
			String lname=sc.next();
			System.out.println("Enter the Mobile");
			long mobile = sc.nextLong();
			System.out.println("Enter the Email");
			String email = sc.next();
			System.out.println("Enter the Address");
			String address= sc.next();
			
          Employee emp = new Employee(fname,lname,mobile,email,address);
          arr.add(emp);
			
		}
		
		Collections.sort(arr,new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.fname.compareTo(o2.fname);
			}
			
			
		});
		
		
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		
		for(Employee emp: arr ){
		
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",emp.fname,emp.lname,emp.mobilenumber,emp.email,emp.address);
		
		}
	}
	
}
