package collectionFramework.arrayListPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write a program to join two arrayLists
public class JoinTwoArrayListQ11 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<String> simpleList = new ArrayList<>();
        simpleList.add("Shasank1");
        simpleList.add("Shasank2");
        simpleList.add("Shasank3");
        simpleList.add("Shasank4");
        simpleList.add("Shasank5");
        simpleList.add("Shasank6");
        simpleList.add("Shasank7");

        List<String> gotList = new ArrayList<>();
        String confirmation;
        int count = 1;
        do {
            System.out.println("What is element #" + count + " ?");
            gotList.add(sc.next());

            System.out.println("Want to add more elements ? ");
            confirmation = sc.next();
            count++;
        } while (confirmation.equalsIgnoreCase("y"));

        System.out.println(gotList);
      simpleList.addAll(gotList);
        System.out.println(simpleList);
    }
}
