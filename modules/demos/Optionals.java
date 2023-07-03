package com.havefunwith.modules.demos;

import java.util.Locale;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
//        String brand = null;
        String brand = "Name";

        Optional<String> brandOp = Optional.ofNullable(brand);

        // is it empty ?
        System.out.println(brandOp.isEmpty());

        brandOp.ifPresentOrElse(b -> {
            System.out.println(b.toUpperCase(Locale.ROOT));
        }, () -> {
            System.out.println("Brand is empty!");
        });

        printInUpperCase(Optional.of("name"));
    }

    public static void printInUpperCase(Optional<String> input) {
        System.out.println("method::printInUpperCase");
        input.ifPresent(s -> System.out.println(s.toUpperCase(Locale.ROOT)));
    }

}
