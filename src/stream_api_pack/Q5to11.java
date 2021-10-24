package stream_api_pack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
        5.Create a list of Integers and filter the numbers greater than 50 and less than 100.
        6.Create a list of Integers and filter the even numbers.
        7.Create a list of Integer and filter the odd numbers
        8.Create a list of Integers and filter the positive numbers.
        9.Create a list of Integers and filter the negative numbers.
        10.Create a list of Integers and map it to the square of every element and collect it to set.
        11.Create a list of Integers and sum it using reduce.
 */
public class Q5to11 {
    public static void main(String[] args) {
        Employee e1 = new Employee("a", "Shasank", "9841","shasank@gmail.com");
        Employee e2 = new Employee("b", "Raazan", "98","raazan@gmail.com");
        Employee e3 = new Employee("c", "Bibek", "345","bibek@gmail.com");
        Employee e4 = new Employee("d", "Shasika", "984","shasika@gmail.com");
        Employee e5 = new Employee("a", "Shasank", "98414","shasank@gmail.com");
        Employee e6 = new Employee("b", "Rajan", "98","raazan@gmail.com");
        Employee e7 = new Employee("c", "Bibek", "345","bibek@gmail.com");
        Employee e8 = new Employee("d", "Shasika", "1395","shasika@gmail.com");
        Employee e9 = new Employee("a", "Shasank", "95","shasank@gmail.com");
        Employee e10 = new Employee("b", "Raazan", "921","raazan@gmail.com");
        Employee e11 = new Employee("c", "Biajan", "36","bibek@gmail.com");
        Employee e12 = new Employee("d", "Shasika", "9","shasika@gmail.com");
        Employee e13 = new Employee("a", "Shasank", "95","shasank@gmail.com");
        Employee e14 = new Employee("b", "Raazan", "21","raazan@gmail.com");
        Employee e15 = new Employee("c", "Bajan", "676","bibek@gmail.com");
        Employee e16 = new Employee("d", "Shajan", "995","shasika@gmail.com");
        Employee e17 = new Employee("a", "Shas ank", "95","shasank@gmail.com");
        Employee e18 = new Employee("b", "Raa zan", "321","raazan@gmail.com");
        Employee e19 = new Employee("c", "Bib ek", "6","bibek@gmail.com");
        Employee e20 = new Employee("d", "Sha sika", "98","shasika@gmail.com");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);   employeeList.add(e2);   employeeList.add(e3);   employeeList.add(e4);
        employeeList.add(e5);   employeeList.add(e6);   employeeList.add(e7);   employeeList.add(e8);
        employeeList.add(e9);   employeeList.add(e10);  employeeList.add(e11);  employeeList.add(e12);
        employeeList.add(e13);  employeeList.add(e14);  employeeList.add(e15);  employeeList.add(e16);
        employeeList.add(e17);  employeeList.add(e18);  employeeList.add(e19);  employeeList.add(e20);


        List<String> numberList = new ArrayList<>();
        for (Employee employee : employeeList) {
            numberList.add(employee.getNumber());
        }

        System.out.println(numberList);
        List<Integer> numberList2 = numberList.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(numberList2);

        //5.Create a list of Integers and filter the numbers greater than 50 and less than 100.
            List<Integer> greaterAndLesser = numberList2.stream().filter(integer -> integer> 50 && integer< 100).collect(Collectors.toList());
        System.out.println(greaterAndLesser);

        // 6.Create a list of Integers and filter the even numbers.
        List<Integer> evenNumbers = numberList2.stream().filter(integer -> integer%2 ==0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        // 7.Create a list of Integer and filter the odd numbers
        List<Integer> oddNumbers = numberList2.stream().filter(integer -> integer%2 !=0).collect(Collectors.toList());
        System.out.println(oddNumbers);

        // 8.Create a list of Integers and filter the positive numbers.
        List<Integer> positiveNumbers = numberList2.stream().filter(integer -> integer >0).collect(Collectors.toList());
        System.out.println(positiveNumbers);

        // Create a list of Integers and filter the negative numbers.
        List<Integer> negativeNumbers = numberList2.stream().filter(integer -> integer <0).collect(Collectors.toList());
        System.out.println(negativeNumbers);

        //  10.Create a list of Integers and map it to the square of every element and collect it to set.
        List<Integer> squareList = numberList2.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(squareList);

        //11.Create a list of Integers and sum it using reduce.
        int sum = numberList2.stream().reduce(0, Integer :: sum); // sum =0 ,
        System.out.println(sum);
    }
}
