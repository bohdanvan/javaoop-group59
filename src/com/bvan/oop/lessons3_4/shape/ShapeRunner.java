package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Shape shape = new Rectangle(10.0, 20.0);
        printInfo(shape);

        if (shape instanceof Circle) { // BAD STYLE
            Circle circle = (Circle) shape;
            System.out.println(circle.getRadius());
        }
    }

    private static void printInfo(Shape shape) {
        System.out.println("P = " + shape.getPerimeter());
        System.out.println("S = " + shape.getArea());
    }

}
