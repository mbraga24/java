package com.havefunwith.modules.demos.solidPractice;

import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {

    /*
     * Note:
     * Because all three class: Circle, Square and Cube share the same interface,
     * we can loop through a List of those classes and invoke the methods from the
     * interface they all implement.
     */
    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum += shape.area();

//            Object shape = shapes.get(i);
//            if (shape instanceof Square) {
//                sum += Math.pow(((Square) shape).getLength(), 2);
//            }
//            if (shape instanceof Circle) {
//                sum += Math.pow(((Circle) shape).getRadius(), 2);
//            }
//            // NEW CONDITION -- MODIFIES CLASS
//            if (shape instanceof Cube) {
//                sum += ((Cube) shape).getLength()) * ((Cube) shape).getLength())
//            }
        }
        return sum;
    }

//    public String json(List<Object> shapes) {
//        return "{shapeSum: %s}".formatted(sum(shapes));
//    }
//
//    public String csv(List<Object> shapes) {
//        return "shape_sum, %s".formatted(sum(shapes));
//    }
}
