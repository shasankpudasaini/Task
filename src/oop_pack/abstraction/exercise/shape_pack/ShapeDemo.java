package oop_pack.abstraction.exercise.shape_pack;

import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle();

        Rectangle[] objarray = {r1,r2,r3,r4};
        for(int i = 0; i < objarray.length  ; i++) {
            System.out.print("Enter the length of Rectangle #" +(i +1)+ " :");
            objarray[i].length = sc.nextDouble();
            System.out.print("Enter the bredth of Rectangle #" +(i+1) + " :");
            objarray[i].bredth = sc.nextDouble();
            objarray[i] = new Rectangle(objarray[i].length , objarray[i].bredth);

            System.out.println("The area of rectangle" + i + " is " + r1.rectangleArea(objarray[i].length , objarray[i].bredth));
            System.out.println("End of this Iteration");


        }

        System.out.println("==========================");
        System.out.println("========Circles===============" );
        Circle c1 = new Circle();
        Circle  c2 = new Circle();
        Circle c3 = new Circle();

        Circle[] objarray2 = {c1,c2,c3};
        for(int i = 0; i < objarray2.length  ; i++) {
            System.out.print("Enter the radius of Circle #" +(i +1)+ " :");
            objarray2[i] = new Circle(sc.nextDouble());

            System.out.println("The area of circle " + i + " is " + objarray2[i].circleArea(objarray2[i].radius));
            System.out.println("End of this Iteration");
        }

        System.out.println("==========================");
        System.out.println("========Circles===============" );
        Square s1 = new Square();
        Square  s2 = new Square();
        Square s3 = new Square();

        Square[] objarray3 = {s1,s2,s3};
        for(int i = 0; i < objarray2.length  ; i++) {
            System.out.print("Enter the length of Square #" +(i +1)+ " :");
            objarray3[i] = new Square(sc.nextDouble());

            System.out.println("The area of square # " + i + " is " + objarray3[i].squareArea(objarray3[i].getRadius()));
            System.out.println("End of this Iteration");
        }




        /*

        System.out.println(s1.rectangleArea(3,4));
        System.out.println(s1.circleArea(4));
        System.out.println( s1.squareArea(5));
        */

    }

}
