package hashset;

//Java program to demonstrate TreeSet 
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();

		// Elements are added using add() method
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");

		// Duplicates will not get insert
		ts1.add("C");

		// Elements get stored in default natural
		// Sorting Order(Ascending)
		System.out.println(ts1);

		/* sessao para outro teste */
		TreeSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("Geek");
		ts.add("For");
		ts.add("Geeks");

		System.out.println(ts);

		/* Outro exemplo */
		// 2. Accessing the Elements: After adding the elements,
		// if we wish to access the elements, we can use inbuilt methods
		// like contains(), first(), last(), etc.

		// Java code to demonstrate
		// the working of TreeSet

		TreeSet<String> ts11 = new TreeSet<String>();

		// Elements are added using add() method
		ts11.add("Geek");
		ts11.add("For");
		ts11.add("Geeks");

		System.out.println("Tree Set is " + ts11);

		String check = "Geeks";

		// Check if the above string exists in
		// the treeset or not
		System.out.println("Contains " + check + " " + ts11.contains(check));

		// Print the first element in
		// the TreeSet
		System.out.println("First Value " + ts11.first());

		// Print the last element in
		// the TreeSet
		System.out.println("Last Value " + ts11.last());

		String val = "Geek";

		// Find the values just greater
		// and smaller than the above string
		System.out.println("Higher " + ts11.higher(val));
		System.out.println("Lower " + ts11.lower(val));

//		3. Removing the Values: The values can be removed from the TreeSet using the remove() method. There are various other methods which are used to remove the first value or the last value.
		TreeSet<String> ts111 = new TreeSet<String>();

		// Elements are added using add() method
		ts111.add("Geek");
		ts111.add("For");
		ts111.add("Geeks");
		ts111.add("A");
		ts111.add("B");
		ts111.add("Z");

		System.out.println("Initial TreeSet " + ts111);

		// Removing the element b
		ts111.remove("B");

		System.out.println("After removing element " + ts111);

		// Removing the first element
		ts111.pollFirst();

		System.out.println("After removing first " + ts111);

		// Removing the last element
		ts111.pollLast();

		System.out.println("After removing last " + ts111);

//		4. Iterating through the TreeSet: There are various ways to iterate through the TreeSet. The most famous one is to use the enhanced for loop.
		TreeSet<String> tsts = new TreeSet<String>();

		// Elements are added using add() method
		tsts.add("Geek");
		tsts.add("For");
		tsts.add("Geeks");
		tsts.add("A");
		tsts.add("B");
		tsts.add("Z");

		// Iterating though the TreeSet
		for (String value : tsts)
			System.out.print(value + ", ");
		System.out.println();

	}
}