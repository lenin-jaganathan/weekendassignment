package Box30;

import java.util.*;

public class Main {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		Set<Box> set=new HashSet<Box>();
		System.out.println("Enter the number of Box");
		int bcount = sc.nextInt();
		
		for(int i=0;i<bcount;i++){
			System.out.println(" Enter the Box " + (i+1) + " Detail : ");
			System.out.println("Enter Length");
			Double length=sc.nextDouble();
			System.out.println("Enter Width");
			Double width=sc.nextDouble();
			System.out.println("Enter Height");
			Double height = sc.nextDouble();
			Box box = new Box(length,width,height);
			set.add(box);
		}
		
		System.out.println("Unique Boxes in the Set are");
		for(Box box:set){
			System.out.println("Length = " +box.length+ " Width = " +box.width+" Height = " +box.height +" Volume = " + box.volume );
		}	
	}
}
