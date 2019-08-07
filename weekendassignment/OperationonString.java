package weekendassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class OperationonString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final String menu = "1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit" ;
		List<String> list = new ArrayList<>() ;
		while(true) {
			System.out.println(menu);
			int choice = sc.nextInt() ;
			boolean exited = false ;
			switch (choice) {
			case 1:
				System.out.println("Enter item to be inserted");
				list.add(sc.next());
				System.out.println("Inserted successfully");
				break;

			case 2:
				System.out.println("Enter the item to be searched");
				String searchItem = sc.next() ;
				if(list.contains(searchItem))
					System.out.println("Item found in the list");
				else
					System.out.println("Item not found in the list");
				break;
			case 3:
				System.out.println("Enter item to delete:");
				String deleteItem = sc.next() ;
				if(list.contains(deleteItem)) {
					OptionalInt indexToDelete = IntStream.range(0, list.size())
							.filter(index -> deleteItem.equals(list.get(index)))
							.findFirst() ;
					list.remove(indexToDelete.getAsInt());
				} else {
					System.out.println("The item does not exist");
				}
				break;
			case 4:
				list.stream().forEach(string -> System.out.println(string));
				break ;
			case 5:
				exited = true ;
				break;
			default :
				break;
			}
			if(exited)
				break ;
		}
		
	}
	
}
