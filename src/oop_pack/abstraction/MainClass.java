package oop_pack.abstraction;

public class MainClass {
    public static void main(String[] args) {
        // Works with circle

      Shape s = new Circle();  // is legal
       /* Circle circle = new Circle();
        circle.readRadius();
        circle.calculateArea();
        circle.calculatePerimeter();
        */
        //must hide implementations like above but reading the radius is tough.
        // try below
        ((Circle) s).readRadius();
        s.calculateArea();
        s.calculatePerimeter();
        s.displayPerimeter();
        s.displayArea();


        //Work with triangle

        Shape triangle = new Triangle();
        ((Triangle) triangle).readTriangleDate();
        triangle.calculateArea();
        triangle.calculatePerimeter();
        triangle.displayArea();
        triangle.displayPerimeter();

        //Both cicle and triangle is calling same methods , that's why we are achieving data hiding through abstraction

    }
}
