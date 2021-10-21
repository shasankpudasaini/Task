package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course("12347", "MAthematics", 15000.0));
        courseList.add(new Course("12346", "Physicsa", 15000.0));
        courseList.add(new Course("12344", "java", 15000.0));

        courseList.add(new Course("12343", "Chemistry", 15000.0));

        courseList.add(new Course("12342", "Biology", 15000.0));

        courseList.add(new Course("12341", "Sports", 15000.0));

       List<String> coursenameList =  courseList.stream().map(c -> c.getName()).collect(Collectors.toList());
        coursenameList.stream().forEach((x) ->System.out.println(x));
    }
}



class Course{
    private String cid;
    private String name;
    private Double price;

    public Course(String cid, String name, Double price) {
        this.cid = cid;
        this.name = name;
        this.price = price;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

