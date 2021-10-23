package collectionFramework.HashSet;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        Set< String> simpleSet = new HashSet<>();
        simpleSet.add("Shasank");
        simpleSet.add("Sumitra");
        simpleSet.add("Swochanda");
        simpleSet.add("Ashutosh");
        simpleSet.add("Pranish");
        simpleSet.add("Surya");


        // Write a Java program to iterate through all elements in a hash list
        simpleSet.stream().forEach(s -> System.out.println(s + "1"));

        //Write a Java program to get the number of elements in a hash set.
        System.out.println(simpleSet.size());

        //Write a Java program to empty a hash set.
       // simpleSet.removeAll(simpleSet);
        System.out.println(simpleSet);

        //Write a Java program to test if a hash set is empty or not.
       System.out.println( simpleSet.isEmpty() ? "Yes , it's empty" :  "No it's not empty") ;

       //Write a Java program to clone a hash set to another hash set.
        HashSet<String> newSet = new HashSet<>(simpleSet);
        System.out.println(newSet);

        HashSet<String> newSet1 = new HashSet<>();
        newSet1 = (HashSet<String>) newSet.clone();
        System.out.println(newSet1);

        // Compare two hash set

        System.out.println( newSet.containsAll(newSet1) ? "Yes it contains " : "No, it doesn't" ) ;

        // compare two sets and retain elements which are the same on both sets.


        HashSet< String> simpleSet1 = new HashSet<>();
        simpleSet1.add("Shasank");
        simpleSet1.add("Sumitra");
        simpleSet1.add("Swochanda");
        simpleSet1.add("Ashutosh");
        simpleSet1.add("Kanchhi");
        simpleSet1.add("Som");

        simpleSet.retainAll(simpleSet1);  // Simple set1 - simpleSet
        System.out.println(simpleSet + "Simple Set");
        System.out.println(simpleSet1 + "Simple Set 1");

        //Write a Java program to remove all of the elements from a hash set.
        simpleSet1.removeAll(simpleSet1);
        System.out.println(simpleSet1 + "Simple Set 1");

    }
}
