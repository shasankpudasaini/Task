package oop_pack.abstraction.exercise.shape_pack;

public class Square extends Shape {
    private double radius;
    public Square(){

    }

    public Square(double radius){
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
        this.radius = radius;
        return radius*radius;
    }

    @Override
    double circleArea(double radius) {
        return 0;
    }
}
