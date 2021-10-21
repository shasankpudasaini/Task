package collectionFramework.arrayListPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListQ3 {
    public static void main(String[] args) {
        List<String> simpleList = new ArrayList<>();
        simpleList.add("Shasank1");
        simpleList.add("Shasank2");
        simpleList.add("Shasank3");
        simpleList.add("Shasank4");
        simpleList.add("Shasank5");
        simpleList.add("Shasank6");
        simpleList.add("Shasank7");
        System.out.println("Old List: " + simpleList);

        List<String> newList = new ArrayList<>();
            Collections.reverse(simpleList);
        System.out.println("----------------------------------------------");
        System.out.println("New list" + simpleList);


    }
}
