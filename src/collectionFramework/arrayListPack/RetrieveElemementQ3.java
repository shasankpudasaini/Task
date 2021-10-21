package collectionFramework.arrayListPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Write a Java program to retrieve an element (at a specified index) from a given array list.

public class RetrieveElemementQ3 {
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
        int i =0;
        String answer = "y";
         while (answer=="y"|| answer == "Y"){
             System.out.println("Which index  would you get the element of ? ");
             int index = sc.nextInt();
             System.out.println(String.valueOf(simpleList.get(index)));
             System.out.println("Check Another Element ? ");
             String s = sc.next();

             if (s != "y " || s != "Y")
                 answer = "n";
              else
                 answer = "y";
         }



        }
    }

