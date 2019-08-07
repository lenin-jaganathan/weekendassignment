/**
 * 
 */
package weekendassignment;

import java.util.Scanner;

/**
 * @author ljaganathan
 *
 */
class Product{
	private long id;
	private String productName;
	private String supplierName;
	/**
	 * @return the id
	 */
	public Product(long id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	Product(long id,String productName){
		this(id);
		this.productName = productName;
		this.supplierName = "Nivas";
	}
	
	Product(long id,String productName, String supplierName){
		this(id);
		this.productName = productName;
		this.supplierName = supplierName;
	}
	
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	public void display(){
		System.out.println("Id : "+this.id);
		System.out.println("Product Name : "+this.productName);
		System.out.println("Supplier Name : "+this.supplierName);
	}
}

public class ConstructorOverloadingImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id:");
		long id = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter product name:");
		String productName = sc.nextLine();
		System.out.println("Is the product supplied by Nivas Suppliers? Type “yes” or “no” (not case sensitive)");
		String res = sc.nextLine();
		System.out.println(res);
		if(res.toLowerCase()=="yes"){
			Product newProduct = new Product(id,productName);
			newProduct.display();
		} else {
			System.out.println("Enter the supplier name");
			Product newProduct = new Product(id,productName,sc.nextLine());
			newProduct.display();
		}
	}

}
