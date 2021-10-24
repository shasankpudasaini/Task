package collectionFramework.mappack.HashMap;

import stream_api_pack.Program;

import java.util.HashMap;

public class ContainsKeyValueQ52Q53 {

    public static void main(String[] args) {
        HashMap<Integer, Employee> simpleMap = new HashMap<>();
       Employee e1 = new Employee("Shasank");
        simpleMap.put(1, e1);
        simpleMap.put(2, new Employee("Swochhanda"));
        simpleMap.put(3, new Employee("Sumitra"));
        simpleMap.put(4, new Employee("Som"));

// for key
        System.out.println( simpleMap.containsKey(3) ? "Yes, it does contain ": "No , it doesn't have it ");


        //for value
        System.out.println(simpleMap.containsValue(e1)? "Yes, it does contain ": "No , it doesn't have it ");
    }
}
