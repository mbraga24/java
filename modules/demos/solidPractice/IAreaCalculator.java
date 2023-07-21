package com.havefunwith.modules.demos.solidPractice;

import java.util.List;

public interface IAreaCalculator {
    /*
     * Note:
     * Because all three class: Circle, Square and Cube share the same interface,
     * we can loop through a List of those classes and invoke the methods from the
     * interface they all implement.
     */
    int sum(List<Shape> shapes);
}
