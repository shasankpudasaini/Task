package collectionFramework.arrayListPack;
//Write a Java program to create a new array list, add some colors (string) and print out the collection.
import java.util.ArrayList;
import java.util.List;

public class ColorArrayListQ2 {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red") ;
         colorList.add("Green" ) ;
         colorList.add("Yellow");
         colorList.add("Blue");
         colorList.add("Purple");

        System.out.println(colorList);

        colorList.stream().forEach(s -> System.out.println(s));

    }
}
