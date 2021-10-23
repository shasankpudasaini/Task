package collectionFramework.mappack.HashMap;

import java.util.HashMap;

public class CopyAllMappingsQ48 {
    public static void main(String[] args) {


        HashMap<Integer, String> simpleMap = new HashMap<>();
        simpleMap.put(1, "Shasank");
        simpleMap.put(2, "Swochanda");
        simpleMap.put(3, "Pranish");
        simpleMap.put(4, "Anushriya");
        simpleMap.put(5, "Ashutosh");
        simpleMap.put(6, "Sumitra");


        HashMap<Integer, String> simpleMap2 = new HashMap<>(simpleMap);

     simpleMap2.put(7,"Bikash");            //if you put the existing key , then it will replace
//        simpleMap.putAll(simpleMap2);
        System.out.println(simpleMap + " = Simple Map 1");
        System.out.println(simpleMap2 + " = Simple Map 2");
    }
}
