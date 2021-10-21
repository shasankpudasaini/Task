package collectionFramework.arrayListPack;

import java.util.ArrayList;
import java.util.List;

public class IterateThroughAllElementsQ4 {
    public static void main(String[] args) {
        List<Double> simpleList = new ArrayList<>();
        simpleList.add(1.9);
        simpleList.add(2.7);
        simpleList.add(3.6);
        simpleList.add(4.3);
        simpleList.add(5.4);
        simpleList.add(6.0);
        simpleList.add(7.5);



       simpleList.stream().forEach(s -> System.out.println(s));

       double extract = simpleList.get(2);
        System.out.println(extract);
    }
}
