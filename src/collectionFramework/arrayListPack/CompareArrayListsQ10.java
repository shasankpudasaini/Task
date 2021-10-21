package collectionFramework.arrayListPack;
//Write a Java program to compare two array lists.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareArrayListsQ10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<String> simpleList = new ArrayList<>();
        simpleList.add("Shasank1");
        simpleList.add("Shasank2");
        simpleList.add("Shasank3");
        simpleList.add("Shasank4");
        simpleList.add("Shasank5");
        simpleList.add("Shasank6");
        simpleList.add("Shasank7");

        List<String> gotList = new ArrayList<>();
        gotList.add("Shasank1");
        gotList.add("Shasank2");
        gotList.add("Shasank3");
        gotList.add("Shasank4");
        gotList.add("Shasank5");
        gotList.add("Shasank6");
        gotList.add("Shasank7");
//        String confirmation;
//        int count =1;
//        do{
//            System.out.println("What is element #" + count  + " ?");
//            gotList.add(sc.next());
//
//            System.out.println("Want to add more elements ? ");
//            confirmation = sc.next();
//            count++;
//        }while(confirmation.equalsIgnoreCase("y"));

        System.out.println(gotList);
        System.out.println(" Are the lists same? " + simpleList.contains("Shasank1"));
        System.out.println( simpleList.containsAll(gotList));
        System.out.println(simpleList.equals(gotList));
    }
}
