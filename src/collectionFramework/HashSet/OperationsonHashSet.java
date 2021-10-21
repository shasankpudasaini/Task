package collectionFramework.HashSet;

import java.util.*;
/*
append element, iterate, get number of elements , empty a hash set
Write a Java program to append the specified element to the end of a hash set.
 Write a Java program to iterate through all elements in a hash list
Write a Java program to get the number of elements in a hash set.
Write a Java program to empty a hash set.
Write a Java program to test if a hash set is empty or not.
Write a Java program to clone a hash set to another hash set.
Write a Java program to convert a hash set to an array.
Write a Java program to convert a hash set to a tree set.
Write a Java program to convert a hash set to a List/ArrayList.
Write a Java program to compare two hash set.
Write a Java program to compare two sets and retain elements which are the same on both sets.
Write a Java program to remove all of the elements from a hash set.

 */

public class OperationsonHashSet {
    public static void main(String[] args) {
      HashSet<String> capitalSet = new HashSet<>();
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

      System.out.println(capitalSet);
      System.out.println(" Want ot add some cities here ? Type y for yes and n for no ");
      String descision = sc.next();
      while (descision.equalsIgnoreCase("Y")) {
        System.out.println(" Type your city name: ");
        capitalSet.add(sc.next());

        System.out.println(" Do you want to add another one ? Type y for yes and n for no ");
        descision = sc.next();
      }
      System.out.println("End of while loop");
      System.out.println("-------------------------------------------------------------");
      iterateThroughElements(capitalSet);
      System.out.println("End of iterate through elements Method ");
      System.out.println("-------------------------------------------------------------");
      System.out.println("There are " + capitalSet.size() + " number of cities in this collection. "); //to get the number of elements in a hash set.
      System.out.println("Did you empty the collection ? ");
      System.out.println("-------------------------------------------------------------");
      /*
      if (capitalSet.removeAll(capitalSet)) {                          //Empty the collection
        System.out.println("Done Boss!");
      };
      System.out.println(capitalSet);
      System.out.println("Let's check your work! ");
      if (capitalSet.isEmpty()) {                                     //check if hashset is empty
        System.out.println("It's empty now!");
       */

      HashSet<String> newcitySet = (HashSet<String>) capitalSet.clone();      // Check (HashSet<String>)
      System.out.println("This is cloned Set: " + newcitySet);              //clone set
      System.out.println("-------------------------------------------------------------");

      Object[]  cityArray = newcitySet.toArray();                           //convert set to array

      System.out.println("This is set converted to Array. " );

      for(Object citynames : cityArray) {                                     //printing elements of array
        System.out.print(citynames);
      }
      System.out.println("-------------------------------------------------------------");

                                                                            // Convert the HashSet to TreeSet
      Set<String> hashSetToTreeSet = new TreeSet<>(capitalSet);

      // Print the TreeSet
      System.out.println("TreeSet: " + hashSetToTreeSet);
      System.out.println("-------------------------------------------------------------");


      List<String> list = new ArrayList<String>(capitalSet);
      // Displaying ArrayList elements
      System.out.println("ArrayList contains: "+ list);
      System.out.println("-------------------------------------------------------------");
      newcitySet.remove("Kathmandu");                                                       //remove element
      System.out.println("is it true that capitalSet and newcitySet are same ?? ");         // compare two set
      System.out.println( "The answer is : " +capitalSet.equals(newcitySet));

      System.out.println("Newcity Set : " + newcitySet);
      System.out.println("Capital Set: " + capitalSet);


      HashSet<String> fantasySet = new HashSet<>();
      fantasySet.add("Arcadia");
      fantasySet.add("Dallas");
      fantasySet.add("Thimpu");

                                                                          //compare two sets and retain elements which are the same on both sets.
    newcitySet.retainAll(fantasySet);
      System.out.println("Newcity set" + newcitySet);

      System.out.println(newcitySet);
    }

    //iterate
    public static void iterateThroughElements(Set<String> h1){

      for(String cityNames: h1) {
        System.out.print(cityNames + " ");
      }

    }



}
