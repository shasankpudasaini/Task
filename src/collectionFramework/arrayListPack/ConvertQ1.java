package collectionFramework.arrayListPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 1.How would you convert an ArrayList to Array and an Array to ArrayList?
public class ConvertQ1 {
    public static void main(String[] args) {
        /* Ways to Convert array to arrayList
        1.asList(array)
        2.Collections.addAll(list1, array)
        3. for(String text:array) {
            list2.add(text);
        */
        String[] array = {"a", "b", "c", "d", "e"};
        List<String> list = Arrays.asList(array);
        System.out.println(list);
        //Method 2
        List<String> list1 = new ArrayList<String>() ;
        Collections.addAll(list1, array);
        //Method 3
        List<String> list2 = new ArrayList<String>();
        for(String text:array) {
            list2.add(text);
        }

// to convert a list into array
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(10);
        al.add(11);
        al.add(110);
        al.add(1);

        int[] arr = al.stream().mapToInt(i -> i).toArray();
        for (int i : arr
             ) {
            System.out.println(i);

        }
    }
}
