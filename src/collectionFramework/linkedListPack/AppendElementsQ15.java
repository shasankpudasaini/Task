package collectionFramework.linkedListPack;

import java.util.LinkedList;
import java.util.List;

public class AppendElementsQ15 {
    public static void main(String[] args) {


    List<String> simpleList = new LinkedList<>();
        System.out.println("Previously: "+ simpleList);
    simpleList.add("Shasank");
    simpleList.add("Swochanda");
    simpleList.add("Anushriya");
    simpleList.add("Pranish");
    simpleList.add("Ashutosh");
    simpleList.add("Surya");
        System.out.println("Updated: " + simpleList);
    }
}
