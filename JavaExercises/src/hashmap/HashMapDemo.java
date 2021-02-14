package hashmap;

import java.util.*; 
public class HashMapDemo { 
    public static void main(String args[]) 
    { 
        Map<String, Integer> hm 
            = new HashMap<String, Integer>(); 
  
        hm.put("a", new Integer(100)); 
        hm.put("b", new Integer(200)); 
        hm.put("c", new Integer(300)); 
        hm.put("d", new Integer(400)); 
  
        // Traversing through the map 
        for (Map.Entry<String, Integer> me : hm.entrySet()) { 
            System.out.print(me.getKey() + ":"); 
            System.out.println(me.getValue()); 
        } 

//        1. Adding Elements: In order to add an element to the map, we can use the put() method. However, the insertion order is not retained in the hashmap. Internally, for every element, a separate hash is generated and the elements are indexed based on this hash to make it more efficient.
        // Default Initialization of a 
        // Map 
        Map<Integer, String> hm1 = new HashMap<>(); 
  
        // Initialization of a Map 
        // using Generics 
        Map<Integer, String> hm2 
            = new HashMap<Integer, String>(); 
  
        // Inserting the Elements 
        hm1.put(1, "Geeks"); 
        hm1.put(2, "For"); 
        hm1.put(3, "Geeks"); 
  
        hm2.put(new Integer(1), "Geeks"); 
        hm2.put(new Integer(2), "For"); 
        hm2.put(new Integer(3), "Geeks"); 
  
        System.out.println(hm1); 
        System.out.println(hm2); 

        //2. Changing Elements: After adding the elements if we wish to change the element, it can be done by again adding the element with the put() method. Since the elements in the map are indexed using the keys, the value of the key can be changed by simply inserting the updated value for the key for which we wish to change.

        // Initialization of a Map 
        // using Generics 
        Map<Integer, String> hm12
            = new HashMap<Integer, String>(); 
  
        // Inserting the Elements 
        hm12.put(new Integer(1), "Geeks"); 
        hm12.put(new Integer(2), "Geeks"); 
        hm12.put(new Integer(3), "Geeks"); 
  
        System.out.println("Initial Map " + hm12); 
  
        hm12.put(new Integer(2), "For"); 
  
        System.out.println("Updated Map " + hm12); 
     
//3. Removing Element: In order to remove an element from the Map, we can use the remove() method. This method takes the key value and removes the mapping for a key from this map if it is present in the map.

        // Initialization of a Map 
        // using Generics 
        Map<Integer, String> hm11 
            = new HashMap<Integer, String>(); 
  
        // Inserting the Elements 
        hm11.put(new Integer(1), "Geeks"); 
        hm11.put(new Integer(2), "For"); 
        hm11.put(new Integer(3), "Geeks"); 
        hm11.put(new Integer(4), "For"); 
  
        // Initial Map 
        System.out.println(hm11); 
  
        hm11.remove(new Integer(4)); 
  
        // Final Map 
        System.out.println(hm11); 

        //4. Iterating through the Map: There are multiple ways to iterate through the Map. The most famous way is to use a for-each loop and get the keys. The value of the key is found by using the getValue() method.

        // Initialization of a Map 
        // using Generics 
        Map<Integer, String> hm111 
            = new HashMap<Integer, String>(); 
  
        // Inserting the Elements 
        hm111.put(new Integer(1), "Geeks"); 
        hm111.put(new Integer(2), "For"); 
        hm111.put(new Integer(3), "Geeks"); 
  
        for (Map.Entry mapElement : hm111.entrySet()) { 
            int key 
                = (int)mapElement.getKey(); 
  
            // Finding the value 
            String value 
                = (String)mapElement.getValue(); 
  
            System.out.println(key + " : "
                               + value); 
        } 

/*        Characteristics of a Map Interface

        A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and null value like the HashMap and LinkedHashMap, but some do not like the TreeMap.
        The order of a map depends on the specific implementations. For example, TreeMap and LinkedHashMap have predictable order, while HashMap does not.
        There are two interfaces for implementing Map in java. They are, Map and SortedMap, and three classes: HashMap, TreeMap and LinkedHashMap.
*/        
    

    
    } 
}