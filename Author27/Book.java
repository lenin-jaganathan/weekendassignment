package Author27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Author{
	
	private String name;
	private List<Author> authorList;
	private double price;
	private int qtyInStock = 0; 
	
	public Book(String name, List<Author> authorList, double price) {
		this.name = name;
		this.authorList = authorList;
		this.price = price;
	}
	public Book(String name, List<Author> authorList, double price, int qtyInStock) {
		this.name = name;
		this.authorList = authorList;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Author> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		String names = "";
		for(Author author: authorList) {
			names += author.getName() + " ";
		}
		return name + " authored by " + names + "costs Rs." + price + ":" + (qtyInStock > 0 ? "Available" : "Not Available");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String isAvailable;
		String author;
		String email;
		String gender;
		int authorCount;
		int qtyInStock;
		double price;
		List<Author> authorList = new ArrayList<>();
		Book book;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book name");
		name = sc.nextLine();
		System.out.println("Enter the number of authors");
		authorCount = sc.nextInt();
		for(int i=0; i<authorCount; i++) {
			System.out.println("Enter the author name");
			author = sc.next();
			System.out.println("Enter the author email id");
			email = sc.next();
			System.out.println("Enter the author's gender");
			gender = sc.next();
			authorList.add(new Author(author, email, gender));
		}
		System.out.println("Enter the book price");
		price = sc.nextDouble();
		System.out.println("Is the book currently available? Type “Yes/No” (Not case sensitive)");
		isAvailable = sc.next();
		if(isAvailable.toLowerCase().equalsIgnoreCase("yes")) {
			System.out.println("Enter the number of books available");
			qtyInStock = sc.nextInt();
			book = new Book(name, authorList, price, qtyInStock);
		} else {
			book = new Book(name, authorList, price);
		}
		System.out.println(book);
	}

}
