package queuelist;

import java.util.ArrayList;
import java.util.Objects;

public class ListQueue {

	public static void main(String[] args) {
		// Sample01: Create ArrayList
		ArrayList<Product> Products = new ArrayList<Product>();

		// Sample 02: Construct Sample Products
		Product p1 = new Product(101, "Pen");
		Product p2 = new Product(102, "Pencil");
		Product p3 = new Product(103, "Rubber");
		Product p4 = new Product(104, "Writing Pad");

		// Sample 03: Add Product to ArrayList
		Products.add(p1);
		Products.add(p2);
		Products.add(p3);
		Products.add(p4);
		// Sample 05: List the Products
		printProducts(Products);

		// Sample 06: Remove a Product
		Products.remove(p2);
		printProducts(Products);
		Products.add(1, p2);

		// Sample 07: Check for Product Existence
		if (Products.contains(p4) == true)
			System.out.println("Writing Pad is in Collection");
		Product rubber = new Product(103, "Rubber");
		if (Products.contains(rubber) == true)
			System.out.println("Rubber is in Collection");

		// Sample 08: Clear the List
		Products.clear();
		if (Products.isEmpty())
			System.out.println("ArraList Cleared");

	}

	// Sample 04: List the Products
	private static void printProducts(ArrayList <Product> Products) {
		for (Product prod : Products) {
			System.out.println("Product Details:-");
			System.out.println(prod);
			System.out.println("==================");
		}
	}
}
