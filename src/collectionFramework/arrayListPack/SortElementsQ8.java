package collectionFramework.arrayListPack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortElementsQ8 {
    public static void main(String[] args) {
        List<Double> simpleList = new ArrayList<>();
        simpleList.add(1.9);
        simpleList.add(5.4);
        simpleList.add(2.7);
        simpleList.add(3.6);
        simpleList.add(7.5);
        simpleList.add(4.3);
        simpleList.add(6.0);
// This can be achieved easily using APIStream
        List<Double> newList = simpleList.stream().sorted().collect(Collectors.toList());
        System.out.println(newList);

    }
}
