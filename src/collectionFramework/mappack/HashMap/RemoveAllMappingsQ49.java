package collectionFramework.mappack.HashMap;

import java.util.HashMap;

//Write a Java program to check whether a map contains key-value mappings (empty) or not.

public class RemoveAllMappingsQ49 {
    public static void main(String[] args) {
        HashMap<Integer, String > simpleMap = new HashMap<>();
        simpleMap.put(1, "Shasank");
        simpleMap.put(2, "Swochanda");
        simpleMap.put(3, "Pranish");
        simpleMap.put(4, "Anushriya");
        simpleMap.put(5, "Ashutosh");
        simpleMap.put(6, "Sumitra");

        System.out.println("Before Removing: " + simpleMap);
        simpleMap.clear();

        System.out.println("After removing" +simpleMap);

    }

}
