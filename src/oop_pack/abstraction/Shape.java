package oop_pack.abstraction;

import java.util.Scanner;

public abstract class Shape {
    Scanner scanner = new Scanner(System.in);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    String color;
    double area;
    double perimeter;

    abstract void calculatePerimeter();

    abstract void calculateArea();

    //The concrete methods in abstract class  here is not necessary to be overriden
    final void displayArea() {
        System.out.println("Area = " + area);
    }

    final void displayPerimeter() {
        System.out.println("perimeter = " + perimeter);
    }
}

