package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapProgram {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
       for(int i =100; i < 1000; i++) {
           integerList.add(i);
       }
//This process was used before java 8.
       for (Integer i : integerList) {
           System.out.print(" " + i);
       }
//After java 8
       integerList.stream().forEach((x) -> System.out.print(x + " "));
       //mappig has made to manipulate the data inside too
        System.out.println();
        List<Integer> updatedList = integerList.stream().map(x -> x + 100).collect(Collectors.toList());
        updatedList.stream().forEach((x) -> System.out.print(x + " "));

    }

}
