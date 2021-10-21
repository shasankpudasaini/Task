package collectionFramework.arrayListPack.treeset;

import apple.laf.JRSUIUtils;
import collectionFramework.HashSet.OperationsonHashSet;

import java.util.*;

/*
Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
Write a Java program to iterate through all elements in a tree set.
Write a Java program to add all the elements of a specified tree set to another tree set.
Write a Java program to create a reverse order view of the elements contained in a given tree set.
Write a Java program to get the first and last elements in a tree set.
Write a Java program to get the number of elements in a tree set.
Write a Java program to compare two tree sets.
Write a Java program to find the numbers less than 7 in a tree set.
Write a Java program to get the element in a tree set which is greater than or equal to the given element.
Write a Java program to get the element in a tree set which is less than or equal to the given element.
Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
Write a Java program to get an element in a tree set which is strictly less than the given element.
Write a Java program to retrieve and remove the first element of a tree set.
Write a Java program to retrieve and remove the last element of a tree set.
Write a Java program to remove a given element from a tree set.

 */
public class OperationsOnTreeSet {

    public static void main(String[] args) {
        //  Go to :   https://www.javatpoint.com/java-treeset

        TreeSet<String> capitalSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        capitalSet.add("Kathmandu");
        capitalSet.add("Thimpu");
        capitalSet.add("New Delhi");
        capitalSet.add("Colombo");
        capitalSet.add("Washington DC");
        capitalSet.add("London");
        capitalSet.add("Parice");
        capitalSet.add("Rome");
        capitalSet.add("Beijing");
        capitalSet.add("Tokyo");
        capitalSet.add("Dallas");
        capitalSet.add("Grand Prarie");
        capitalSet.add("Houston");
        capitalSet.add("Arlington");
// A core function of Set is that it can't contain repeated elements
        capitalSet.add("Kathmandu");
        capitalSet.add("Thimpu");
        capitalSet.add("New Delhi");

        iterateThroughElements(capitalSet);
        System.out.println("\n" + "----------------------------------------");
        TreeSet<String> newSet = new TreeSet<>();
        newSet.add("Chabil");
        newSet.add("Boudhha");
        newSet.add("Jorpati");
        newSet.add("Sankhu");
        newSet.add("Arlington");

        iterateThroughElements(newSet);
        System.out.println("\n" + "----------------------------------------");            //add all elements
        capitalSet.addAll(newSet);
        System.out.println("New Capital Set: " + capitalSet);
        System.out.println("Iterated: ");
        Iterator it = capitalSet.descendingIterator();                                  // Reverse order
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println( "First element is : " + capitalSet.first());            //first element
        System.out.println("Last element is : "+ capitalSet.last());                //last element
        System.out.println("Size is " + capitalSet.size());                          //size
        for (String element : capitalSet){
            System.out.println(newSet.contains(element) ? "Yes" : "No" + element);  //compare elements of two tree Set
        }
    }

        public static void iterateThroughElements(Set < String > h1) {


            for (String cityNames : h1) {
                System.out.print(cityNames + " ");//prints in alphabhetical order
            }
        }
    }
