package collectionFramework.mappack.HashMap;

import java.util.HashMap;

public class SizeOfMapQ47 {
    public static void main(String[] args) {
        HashMap<Integer, String > simpleMap = new HashMap<>();
        simpleMap.put(1, "Shasank");
        simpleMap.put(2, "Swochanda");
        simpleMap.put(3, "Pranish");
        simpleMap.put(4, "Anushriya");
        simpleMap.put(5, "Ashutosh");
        simpleMap.put(6, "Sumitra");

        System.out.println("Size of the given map is : " +  simpleMap.size());
    }
}
