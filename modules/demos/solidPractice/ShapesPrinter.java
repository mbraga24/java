package com.havefunwith.modules.demos.solidPractice;

import java.util.List;

public class ShapesPrinter {

    // Dependent on the concrete class and not the abstraction
    // private AreaCalculator areaCalculator = new AreaCalculator();

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "shapes_sum: %s".formatted(areaCalculator.sum(shapes));
    }

}
