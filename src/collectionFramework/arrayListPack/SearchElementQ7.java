package collectionFramework.arrayListPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElementQ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> simpleList = new ArrayList<>();
        simpleList.add("Shasank1");
        simpleList.add("Shasank2");
        simpleList.add("Shasank3");
        simpleList.add("Shasank4");
        simpleList.add("Shasank5");
        simpleList.add("Shasank6");
        simpleList.add("Shasank7");
        System.out.println("What would you like to search ? ");
        String userInput = scanner.nextLine();
        if(simpleList.contains(userInput)){
            System.out.println("Item is found in the list. ");}

        else
            System.out.println("Item is not in the list. ");

    }
}
