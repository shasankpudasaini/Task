package collectionFramework.arrayListPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyArraylist12 {

    public static void main(String[] args) {
        List<String> simpleList = new ArrayList<>();
        simpleList.add("Shasank1");
        simpleList.add("Shasank2");
        simpleList.add("Shasank3");
        simpleList.add("Shasank4");
        simpleList.add("Shasank5");
        simpleList.add("Shasank6");
        simpleList.add("Shasank7");
        System.out.println("Before: " + simpleList);
        simpleList.removeAll(simpleList);
        System.out.println("After: " + simpleList);
    }
}
