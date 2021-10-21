package oop_pack.abstraction.exercise.marks_pack;

public class MarksDemo {
    public static void main(String[] args) {
        Marks threeSubjects = new ThreeSubjects(79,85,91);
        threeSubjects.getPercentage();

        Marks foursubjectss = new FourSubjects(80,88,98,79);
        foursubjectss.getPercentage();
    }
}
