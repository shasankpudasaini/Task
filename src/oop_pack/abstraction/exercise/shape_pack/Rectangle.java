package oop_pack.abstraction.exercise.shape_pack;

public class Rectangle extends Shape{
     double length;
     double bredth;

    public Rectangle(double length, double bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    public Rectangle() {
    }
    @Override
    double rectangleArea(double length, double bredth) {
        return length*bredth;
    }

    @Override
    double squareArea(double length) {
        return 0;
    }

    @Override
    double circleArea(double radius) {
        return 0;
    }


}
