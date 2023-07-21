package com.havefunwith.modules.demos.solidPractice;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(20);
//        NoShape noShape = new NoShape();
        Shape noShape = new NoShape(); // not substitutable for base/parent class
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
//        List<Object> shapes = List.of(circle, square, cube);
        List<Shape> shapes = List.of(noShape, circle, square, cube);
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
//        System.out.println(areaCalculator.json(shapes));
//        System.out.println(areaCalculator.csv(shapes));

        /*
            SOLID Principles
            - Single Responsability
            Each class should have only one sole purpose, and not be filled with excessive
            functionality.

            - Open Closed
            Classes should be open for extension and closed for modification.

            In other words, you should not have to rewrite an existing class for implementing new
            features. Extend classes by the use of interfaces.

            - Liskov Substitution **
            This means that every subclass or derived class should be substitutable for their base
            class.

            - Interface Segregation
            Interfaces should not force classes to implement what they can't do.

            Large interfaces should be divided into small ones.

            - Dependency Inversion
            Components should depend on abstractions, not on concretions.


        */
    }
}
