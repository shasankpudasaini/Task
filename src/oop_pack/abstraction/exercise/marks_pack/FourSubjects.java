package oop_pack.abstraction.exercise.marks_pack;

import java.text.DecimalFormat;

public class FourSubjects extends Marks{
    private double subject1; private double subject2;    private double subject3; private double subject4;

    public FourSubjects(double sub1, double sub2, double sub3, double sub4 ) {
        this.subject1 = sub1;
        this.subject2 =sub2;
        this.subject3 = sub3;
        this.subject4 =sub4;

    }

    @Override
    void getPercentage() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("The percentage of given four subjects is: " + decimalFormat.format(((subject2+ subject1 +subject3 +subject4)/400) *100) + "% .");
    }
}
