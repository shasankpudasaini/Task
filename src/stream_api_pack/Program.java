package stream_api_pack;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        nameList.add("Bibek Sapkota");
        nameList.add("Shasank Pudasaini");
        nameList.add("Bikash Timalsina");
        nameList.add("Suraj Maharjan");
        nameList.add("Sandeep Roka");


    }

    public static class Employee {
       private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
