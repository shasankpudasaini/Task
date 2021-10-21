package oop_pack.abstraction;

import java.text.DecimalFormat;

public class Circle extends Shape {
    public double radius;


    @Override
    void calculatePerimeter() {
        setPerimeter(2*Math.PI * radius);

    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedArea = decimalFormat.format(area);
        setArea(Double.parseDouble(formattedArea));

    }
    public void readRadius()
    {
        System.out.println("Enter the radius ");
        radius = scanner.nextDouble();
        System.out.println("Circle data read completed");

    }
}
