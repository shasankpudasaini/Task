package collectionFramework.linkedListPack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SwapElementsQ18 {

    public static void main(String[] args) {

        LinkedList<String> simpleList = new LinkedList<>();

        simpleList.add("Shasank");
        simpleList.add("Swochanda");
        simpleList.add("Anushriya");
        simpleList.add("Pranish");
        simpleList.add("Ashutosh");
        simpleList.add("Surya");

        System.out.println(simpleList);
//        simpleList.set(2, simpleList.get(5));
//        simpleList.set(5, simpleList.get(2));

        Collections.swap(simpleList,2,5);

        System.out.println(simpleList);
    }
}
