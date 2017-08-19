package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.add(new Rectangle(10.0, 20.0)); // 200
        shapes.add(new Circle(10.0)); // 314

        System.out.println(shapes.getArea());
    }
}
