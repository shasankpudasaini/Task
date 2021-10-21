package oop_pack.abstraction.exercise.shape_pack;


public class Area extends Shape {


    @Override
    double rectangleArea(double length, double bredth) {
        double area = length*bredth;
        return area;
    }

    @Override
    double squareArea(double length) {
        double area = length*length;
        return area;
    }

    @Override
    double circleArea(double radius) {
        return radius *radius * Math.PI;
    }
}
