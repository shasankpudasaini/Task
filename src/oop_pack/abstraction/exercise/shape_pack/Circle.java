package oop_pack.abstraction.exercise.shape_pack;

public class Circle extends Shape {
     double radius;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double rectangleArea(double length, double bredth) {
        return 0;
    }

    @Override
    double squareArea(double length) {
        return 0;
    }

    @Override
    double circleArea(double radius) {
        this.radius =radius;
        return radius*radius;
    }
}
