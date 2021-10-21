package oop_pack.abstraction.exercise.marks_pack;

import java.text.DecimalFormat;

public class ThreeSubjects extends Marks {
    private double subject1; private double subject2;    private double subject3;

    public ThreeSubjects(double sub1, double sub2, double sub3 ) {
        this.subject1 = sub1;
        this.subject2 =sub2;
        this.subject3 = sub3;


    }

    @Override
    void getPercentage() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("The percentage of given three subjects is: " +decimalFormat.format(((subject2+ subject1 +subject3 )/300) *100) + "% . ");
    }
}
