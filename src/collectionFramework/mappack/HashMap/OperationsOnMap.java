package collectionFramework.mappack.HashMap;

import java.util.*;
import java.util.stream.Collectors;

/*
Write a Java program to count the number of key-value (size) mappings in a map.
Write a Java program to copy all of the mappings from the specified map to another map.
Write a Java program to remove all of the mappings from a map.
Write a Java program to check whether a map contains key-value mappings (empty) or not.d
Write a Java program to get a shallow copy of a HashMap instance.
Write a Java program to test if a map contains a mapping for the specified key.
Write a Java program to test if a map contains a mapping for the specified value.
Write a Java program to create a set view of the mappings contained in a map.
Write a Java program to get the value of a specified key in a map.
Write a Java program to get a set view of the keys contained in this map.
Write a Java program to get a collection view of the values contained in this map.

Write a Java program to associate the specified value with the specified key in a Tree Map.
Write a Java program to copy a Tree Map content to another Tree Map.
Write a Java program to search a key in a Tree Map.
Write a Java program to search a value in a Tree Map.
Write a Java program to get all keys from a given Tree Map.
Write a Java program to delete all elements from a given Tree Map.
Write a Java program to sort keys in Treemap by using comparator
Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
Write a Java program to get a reverse order view of the keys contained in a given map.
Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
Write a Java program to get the greatest key less than or equal to the given key.
Write a Java program to get the portion of a map whose keys are strictly less than a given key.
Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
Write a Java program to get the least key strictly greater than the given keyReturn null if there is no such key.
Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given keyReturn null if there is no such key
Write a Java program to get the greatest key strictly less than the given keyReturn null if there is no such key.
Write a Java program to get a NavigableSet view of the keys contained in a map.
Write a Java program to remove and get a key-value mapping associated with the least key in a map.
Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
Write a Java program to get the portion of a map whose keys range from a given key to another key.
Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
Write a Java program to get a portion of a map whose keys are greater than to a given key.

 */
public class OperationsOnMap {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map1.put(1, "Shasank");
        map1.put(2, "Swochanda");
        map1.put(3, "Sumitra");
        map1.put(4, "Som");
        map1.put(5, "Anushriya");
        map1.put(6, "Ashutosh");
        map1.put(7, "Surya");
        map1.put(8, "Dhir");
        map1.put(9, "Pralad");

        System.out.println("The size of map1 is : "+ map1.size());          //number of key-value pairs
        map2.putAll(map1);                                                  //copy all elements of map1 to map2
        System.out.println("Map 2 : " + map2);
        map2.clear();
        System.out.println("Map 2:"+ map2);                                   //deleting all elements of map2
        System.out.println("IS Map2 empty? " + (map2.isEmpty() ? "You are right": "You are wrong"));  // is a Map empty ?
/*

        HashMap<Integer,String> clonedMap = (HashMap<Integer, String>) map1.clone(); // shallow copy
        System.out.println(clonedMap);
*/
        System.out.println("Which key do you want to search ? ");
        Scanner sc = new Scanner(System.in);                                                        //Check if set contains given key
        System.out.println( map1.containsKey(sc.nextInt())? "It does contain the given key": "It doesnt contain the given key");
        System.out.println("Which value do you want to search ? ");
        System.out.println( map1.containsValue(sc.next())? "It does contain the given value": "It doesnt contain the given value");

        Set set = map1.entrySet();
        System.out.println("Set view of the map" + set);                                //create a set view of map
        System.out.println( "Did we get it ? " + map1.get(4));                          // Get value of item from the key
        System.out.println("Collection view " + map1.values());                         // create collection view of map


    }
}
