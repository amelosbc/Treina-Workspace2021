package comparator;

//Java program to demonstrate working of Comparator
//interface more than one field

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

class StudentEx2 {

 // instance member variables
 String Name;
 int Age;

 // parameterized constructor
 public StudentEx2(String Name, Integer Age) {
     this.Name = Name;
     this.Age = Age;
 }

 public String getName() {
     return Name;
 }

 public void setName(String Name) {
     this.Name = Name;
 }

 public Integer getAge() {
     return Age;
 }

 public void setAge(Integer Age) {
     this.Age = Age;
 }

 // overriding toString() method
 @Override
 public String toString() {
     return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
 }

 static class CustomerSortingComparator implements Comparator<StudentEx2> {

     @Override
     public int compare(StudentEx2 customer1, StudentEx2 customer2) {

         // for comparison
         int NameCompare = customer1.getName().compareTo(customer2.getName());
         int AgeCompare = customer1.getAge().compareTo(customer2.getAge());

         // 2-level comparison using if-else block
         if (NameCompare == 0) {
             return ((AgeCompare == 0) ? NameCompare : AgeCompare);
         } else {
             return NameCompare;
         }
     }
 }

 public static void main(String[] args) {

     // create ArrayList to store StudentEx2
     List<StudentEx2> al = new ArrayList<>();

     // create customer objects using constructor initialization
     StudentEx2 obj1 = new StudentEx2("Ajay", 27);
     StudentEx2 obj2 = new StudentEx2("Sneha", 23);
     StudentEx2 obj3 = new StudentEx2("Simran", 37);
     StudentEx2 obj4 = new StudentEx2("Ajay", 22);
     StudentEx2 obj5 = new StudentEx2("Ajay", 29);
     StudentEx2 obj6 = new StudentEx2("Sneha", 22);

     // add customer objects to ArrayList
     al.add(obj1);
     al.add(obj2);
     al.add(obj3);
     al.add(obj4);
     al.add(obj5);
     al.add(obj6);

     // before Sorting arraylist: iterate using Iterator
     Iterator<StudentEx2> custIterator = al.iterator();

     System.out.println("Before Sorting:\n");
     while (custIterator.hasNext()) {
         System.out.println(custIterator.next());
     }

     // sorting using Collections.sort(al, comparator);
     Collections.sort(al, new CustomerSortingComparator());

     // after Sorting arraylist: iterate using enhanced for-loop
     System.out.println("\n\nAfter Sorting:\n");
     for (StudentEx2 customer : al) {
         System.out.println(customer);
     }
 }
}
