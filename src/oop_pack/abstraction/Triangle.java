package oop_pack.abstraction;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;


    @Override
    void calculatePerimeter() {
        setPerimeter(side1+ side2 +side3);

    }

    @Override
    void calculateArea() {
        calculatePerimeter();
        double s  = getPerimeter()/2;
        setArea( Math.sqrt(s *((s -side1) * (s-side2) * (s-side3))));

    }
    public void readTriangleDate(){
        System.out.println("Enter side 1 of the triangle: ");
        side1 = scanner.nextDouble();
        System.out.println("Enter side 2 of the triangle: ");
        side2 = scanner.nextDouble();
        System.out.println("Enter side 2 of the triangle: ");
        side3 = scanner.nextDouble();
        System.out.println("Triangle data collection completed ");




    }
}
