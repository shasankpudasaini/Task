package stream_api_pack;

//Create a list of String with 20 different data and display it using stream API.

import java.util.ArrayList;
import java.util.List;

public class DisplayElementsofListQ2 {

    public static void main(String[] args) {
        Employee e1 = new Employee("a", "Shasank", "9841401395","shasank@gmail.com");
        Employee e2 = new Employee("b", "Raazan", "987654321","raazan@gmail.com");
        Employee e3 = new Employee("c", "Bibek", "3456789676","bibek@gmail.com");
        Employee e4 = new Employee("d", "Shasika", "9841401395","shasika@gmail.com");
        Employee e5 = new Employee("a", "Shasank", "9841401395","shasank@gmail.com");
        Employee e6 = new Employee("b", "Raazan", "987654321","raazan@gmail.com");
        Employee e7 = new Employee("c", "Bibek", "3456789676","bibek@gmail.com");
        Employee e8 = new Employee("d", "Shasika", "9841401395","shasika@gmail.com");
        Employee e9 = new Employee("a", "Shasank", "9841401395","shasank@gmail.com");
        Employee e10 = new Employee("b", "Raazan", "987654321","raazan@gmail.com");
        Employee e11 = new Employee("c", "Bibek", "3456789676","bibek@gmail.com");
        Employee e12 = new Employee("d", "Shasika", "9841401395","shasika@gmail.com");
        Employee e13 = new Employee("a", "Shasank", "9841401395","shasank@gmail.com");
        Employee e14 = new Employee("b", "Raazan", "987654321","raazan@gmail.com");
        Employee e15 = new Employee("c", "Bibek", "3456789676","bibek@gmail.com");
        Employee e16 = new Employee("d", "Shasika", "9841401395","shasika@gmail.com");
        Employee e17 = new Employee("a", "Shasank", "9841401395","shasank@gmail.com");
        Employee e18 = new Employee("b", "Raazan", "987654321","raazan@gmail.com");
        Employee e19 = new Employee("c", "Bibek", "3456789676","bibek@gmail.com");
        Employee e20 = new Employee("d", "Shasika", "9841401395","shasika@gmail.com");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);   employeeList.add(e2);   employeeList.add(e3);   employeeList.add(e4);
        employeeList.add(e5);   employeeList.add(e6);   employeeList.add(e7);   employeeList.add(e8);
        employeeList.add(e9);   employeeList.add(e10);  employeeList.add(e11);  employeeList.add(e12);
        employeeList.add(e13);  employeeList.add(e14);  employeeList.add(e15);  employeeList.add(e16);
        employeeList.add(e17);  employeeList.add(e18);  employeeList.add(e19);  employeeList.add(e20);


        employeeList.stream().forEach(s-> System.out.println(s.toString()));



    }
}
