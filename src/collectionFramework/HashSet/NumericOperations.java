package collectionFramework.HashSet;

import java.util.Scanner;
import java.util.TreeSet;
/*
Write a Java program to find the numbers less than 7 in a tree set.
Write a Java program to get the element in a tree set which is greater than or equal to the given element.
Write a Java program to get the element in a tree set which is less than or equal to the given element.
Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
Write a Java program to get an element in a tree set which is strictly less than the given element.
Write a Java program to retrieve and remove the first element of a tree set.
Write a Java program to retrieve and remove the last element of a tree set.
Write a Java program to remove a given element from a tree set.
 */

public class NumericOperations {
    public static void main(String[] args) {
        TreeSet<Integer> numberSet = new TreeSet<>();
        numberSet.add(1);
        numberSet.add(3);
        numberSet.add(5);
        numberSet.add(7);
        numberSet.add(9);
        numberSet.add(11);
        numberSet.add(13);
        numberSet.add(15);
        numberSet.add(17);
        numberSet.add(19);
        numberSet.add(21);
        System.out.println("The numbers less than 7 are ");
        for (Integer odd: numberSet) {
            if (odd < 7) {
                System.out.println(odd);                //find the numbers less than 7 in a tree set.
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Less than or equal to which number ? ");
        int input = sc.nextInt();
        System.out.println("The numbers less than or equal to  given number are ");
        for (Integer odd: numberSet) {
            if (odd <= input) {
                System.out.println(odd);                //find the numbers <= than given in a tree set.
            }

        }
            //OR
        System.out.println(numberSet.ceiling(9));
        System.out.println(numberSet.lower(9));

        System.out.println("Greater than or equal to which number ? ");
        int input2 = sc.nextInt();
        System.out.println("The numbers greater than or equal to  given number are ");
        for (Integer odd: numberSet) {
            if (odd <= input2) {
                System.out.println(odd);                //find the numbers >=  than given in a tree set.
            }

        }

                                                                //retrieve and remove the first,last and goven  element of a tree set.
        numberSet.pollFirst();
        numberSet.pollLast();
        System.out.println("Which element do you want to remove ? ");
        numberSet.remove(sc.nextInt());
        System.out.println("The set with first, last and given item removed : ");
        System.out.println(numberSet);

    }
}
