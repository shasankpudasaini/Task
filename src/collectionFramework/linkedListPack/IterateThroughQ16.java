package collectionFramework.linkedListPack;

import java.util.LinkedList;
import java.util.List;

public class IterateThroughQ16{
    public static void main(String[] args) {


        List<String> simpleList = new LinkedList<>();

        simpleList.add("Shasank");
        simpleList.add("Swochanda");
        simpleList.add("Anushriya");
        simpleList.add("Pranish");
        simpleList.add("Ashutosh");
        simpleList.add("Surya");
        List<String> simList = new LinkedList<>();

        for(String names: simpleList) {
            System.out.println(names + " Pudasaini");
            simList.add(names);
        }
        System.out.println(simList);
    }
}
