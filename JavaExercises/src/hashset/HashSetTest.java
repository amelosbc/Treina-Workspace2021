package hashset;

//Sample01: Set & HashSet part of Util Package
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
  //Sample02: Create a HashSet and hold it in Set Interface
  Set<Product> Products = new HashSet<Product>();

  //Sample 03: Construct Sample Products
  Product p1 = new Product(101, "Pen");
  Product p2 = new Product(102, "Pencil");
  Product p3 = new Product(103, "Rubber");
  Product p4 = new Product(104, "Writing Pad");
  Product p5 = new Product(105, "Clips");
  Product p6 = new Product(106, "Sharpner");

  //Sample 05: Add Products to HashSet
  Products.add(p1);
  Products.add(p2);
  Products.add(p3);
  Products.add(p4);
  Products.add(p5);
  Products.add(p6);
  printProducts(Products);
		
  //Sample 06: Add a Duplicate Product
  Product p7 = new Product(104, "Writing Pad");
  Product p8 = new Product(104, "Name NA");
  boolean ret = Products.add(p7);
  if (!ret)
    System.out.println("Product " + p7 + " Already Exists!");
  ret = Products.add(p8);
  if (!ret)
    System.out.println("Product " + p8 + " Already Exists!");
		
  //Sample 07: Remove a Product
  ret = Products.remove(p3);
  if (!ret)
    System.out.println("Product " + p3 + " Not there");
  ret = Products.remove(p5);
  if (!ret)
    System.out.println("Product " + p5 + " Not there");
  ret = Products.remove(p5);
  if (!ret)
    System.out.println("Product " + p3 + " Not there");
  printProducts(Products);
		
		//Sample 08: Check product Already Exists
		ret = Products.contains(p2);
		ret = Products.contains(p5);
	}

//Sample 04: List the Products
private static void printProducts(Set<Product> Products) {
  System.out.println("Product Details:-");
  for(Product prod: Products){
    System.out.println(prod);
  }
  System.out.println("==================");
}
}
