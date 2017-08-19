package com.bvan.oop.lessons3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        System.out.println("P = " + rectangle.getPerimeter());
        System.out.println("S = " + rectangle.getArea());

        Rectangles rectangles = new Rectangles();
        rectangles.add(rectangle);
        rectangles.add(new Rectangle(2.0, 1.0));

        System.out.println("sum S = " + rectangles.getArea());
    }
}
