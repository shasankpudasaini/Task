package collectionFramework.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSetToArrayQ25 {
    public static void main(String[] args) {
        HashSet< String> simpleSet = new HashSet<>();
        simpleSet.add("Shasank");
        simpleSet.add("Sumitra");
        simpleSet.add("Swochanda");
        simpleSet.add("Ashutosh");
        simpleSet.add("Pranish");
        simpleSet.add("Surya");


//Write a Java program to convert a hash set to an array.
        String[] strArray = new String[simpleSet.size()];
            simpleSet.toArray(strArray);
        System.out.println(strArray);
        for (String s:strArray) {
            System.out.println(s);
        }
// Convert hashSet to a treeset

        TreeSet<String> first = new TreeSet<>(simpleSet);
        System.out.println(first);

// Convert hashSet to a arraylist
        ArrayList<String> first2 = new ArrayList<>(simpleSet);
        System.out.println(first2);


    }

}

