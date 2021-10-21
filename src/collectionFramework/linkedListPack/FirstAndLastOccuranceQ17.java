package collectionFramework.linkedListPack;

import java.util.Collections;
import java.util.LinkedList;
//Write a Java program to get the first and last occurrence of the specified elements in a linked list.


public class FirstAndLastOccuranceQ17 {
    public static void main(String[] args) {
        LinkedList<String> simpleList = new LinkedList<>();

        simpleList.add("Shasank");
        simpleList.add("Swochanda");
        simpleList.add("Anushriya");
        simpleList.add("Pranish");
        simpleList.add("Ashutosh");
        simpleList.add("Surya");

        int index = simpleList.lastIndexOf("Shasank");
        System.out.println(index);
        // swap two elements
        Collections.swap(simpleList, 0,2);
        System.out.println(simpleList);
    }
}
