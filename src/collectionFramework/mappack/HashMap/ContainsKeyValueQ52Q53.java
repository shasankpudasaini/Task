package collectionFramework.mappack.HashMap;

import stream_api_pack.Program;

import java.util.HashMap;

public class ContainsKeyValueQ52Q53 {

    public static void main(String[] args) {
        HashMap<Integer, Program.Employee> simpleMap = new HashMap<>();
        Program.Employee e1 = new Program.Employee("Shasank");
        simpleMap.put(1, e1);
        simpleMap.put(2, new Program.Employee("Swochhanda"));
        simpleMap.put(3, new Program.Employee("Sumitra"));
        simpleMap.put(4, new Program.Employee("Som"));

// for key
        System.out.println( simpleMap.containsKey(3) ? "Yes, it does contain ": "No , it doesn't have it ");


        //for value
        System.out.println(simpleMap.containsValue(e1)? "Yes, it does contain ": "No , it doesn't have it ");
    }
}
