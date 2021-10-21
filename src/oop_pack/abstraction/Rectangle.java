package oop_pack.abstraction;

public class Rectangle extends Shape {
    private double length;
    private double bredth;

    public static void main(String[] args) {
    }

    @Override
    void calculatePerimeter() {
        double perimeter  = 2*(length *bredth);

    }

    @Override
    void calculateArea() {
        double area = length * bredth;

    }

    public void readRectangleDate() {
        System.out.println("Enter length ");
        length = scanner.nextDouble();
        System.out.println("Enter bredth ");
        bredth = scanner.nextDouble();
    }
}
