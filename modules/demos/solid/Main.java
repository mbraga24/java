package com.havefunwith.modules.demos.solid;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle, square);
        int sum = areaCalculator.sum(shapes);
        System.out.println("Sum = " + sum);

        /*
            SOLID Principles
            - Single Responsability
            Each class should have only one sole purpose, and not be filled with excessive
            functionality.

            - Open Closed
            Classes should be open for extension and closed for modification.

            In other words, you should not have to rewrite an existing class for implementing new
            features. Extend classes by the use of interfaces.

        */
    }
}
