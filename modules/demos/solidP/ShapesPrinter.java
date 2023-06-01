package com.havefunwith.modules.demos.solidP;

import java.util.List;

public class ShapesPrinter {

    public String json(int sum) {
        return "{shapesSum: %s}".formatted(sum);
    }

    public String csv(int sum) {
        return "shapes_sum: %s".formatted(sum);
    }

}
