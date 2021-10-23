package collectionFramework.mappack.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AssociateKeyValueQ46 {
//Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void main(String[] args) {

        HashMap<Integer, String > simpleMap = new HashMap<>();
        simpleMap.put(1, "Shasank");
        simpleMap.put(2, "Swochanda");
        simpleMap.put(3, "Pranish");
        simpleMap.put(4, "Anushriya");
        simpleMap.put(5, "Ashutosh");
        simpleMap.put(6, "Sumitra");

        System.out.println(simpleMap);
        for(Map.Entry x:simpleMap.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());

        }
    }
}
