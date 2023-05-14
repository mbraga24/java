package com.havefunwith.modules.demos.abstractLesson;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        Animal animal = new Animal("Tom"); // instantiating Animal Class -- won't work if class is abstract
//        System.out.println(animal.getName());
//        animal.makeSound(); // not specific for an animal, e.g: dog or cat.

//        Animal tom = new Cat("Tom");
//        System.out.print(tom.getName() + ": ");
//        tom.makeSound();
//
//        Animal bob = new Dog("Bob");
//        System.out.print(bob.getName() + ": ");
//        bob.makeSound();

        System.out.println("\nPHONE REPORT\n\n");

        System.out.println("==========================================");
        System.out.println("Send Data Report");
        System.out.println("==========================================");

        // Send Data Report
        new NumberExtractorReport()
                .prepareAndSendReport("src/com/havefunwith/resources/dataReport/dataReport.txt");

        System.out.println("==========================================");
        System.out.println("Empty File with Header");
        System.out.println("==========================================");

        // Empty File with Header
        new NumberExtractorReport()
                .prepareAndSendReport("src/com/havefunwith/resources/dataReport/headerDataReport.txt");

        System.out.println("==========================================");
        System.out.println("Empty Data Report");
        System.out.println("==========================================");

        // Empty Data Report
        new NumberExtractorReport()
                .prepareAndSendReport("src/com/havefunwith/resources/dataReport/emptyDataReport.txt");

        System.out.println("==========================================");
        System.out.println("No Match Data Report");
        System.out.println("==========================================");

        // No Match Data Report
        new NumberExtractorReport()
                .prepareAndSendReport("src/com/havefunwith/resources/dataReport/noMatchDataReport.txt");

        System.out.println("\nEMAIL REPORT\n\n");

        System.out.println("==========================================");
        System.out.println("Send Data Report");
        System.out.println("==========================================");

        // Send Data Report
        new EmailExtractorReport()
                .prepareAndSendReport("src/com/havefunwith/resources/dataReport/dataReport.txt");

        System.out.println("==========================================");
        System.out.println("Empty File with Header");
        System.out.println("==========================================");

        // Empty File with Header
        new EmailExtractorReport()
                .prepareAndSendReport("src/com/havefunwith/resources/dataReport/headerDataReport.txt");

        System.out.println("==========================================");
        System.out.println("Empty Data Report");
        System.out.println("==========================================");

        // Empty Data Report
        new EmailExtractorReport()
                .prepareAndSendReport("src/com/havefunwith/resources/dataReport/emptyDataReport.txt");

        System.out.println("==========================================");
        System.out.println("No Match Data Report");
        System.out.println("==========================================");

        // No Match Data Report
        new EmailExtractorReport()
                .prepareAndSendReport("src/com/havefunwith/resources/dataReport/noMatchDataReport.txt");

    }
}
