package oop_pack.abstraction.exercise;

public class ParentDemo {
    public static void main(String[] args) {
        Parent p1 = new Child1();
        p1.message();
        Parent p2 = new Child2();
        p2.message();
    }
}
