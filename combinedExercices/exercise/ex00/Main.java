package com.havefunwith.combinedExercices.exercise.ex00;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        /*
            Example Define a class to describe a pet cat with a name property.
            Write a getter for name and use it to print the value in Main.

            public class Cat{

                private String name;

                public Cat(String name){
                    this.name = name
                }

                public String getName(){
                    return this.name
                }
            }

            public class Main {
                public static void main(String[] args){
                    Cat cat = new Cat("Star");
                    String catName = cat.getName();
                    System.out.println(catname);
                }
            }
         */
        Cat cat = new Cat("Moo");
        System.out.println(cat.getName());

        /*
            ==============
            Exercise 1
            ==============

            Create a class to represent a car. The car should have properties representing the
            manufacturer, price, and engine type (eg. petrol, electric, etc).

            ==============
            Exercise 2
            ==============

            Write getters for each of these properties. Test them in Main.

            ==============
            Exercise 3
            ==============

            Write setters for the properties. Test them in Main.

            ==============
            Exercise 4
            ==============

            Modify the engine type property to use an EngineType enum. You'll need to modify the getter
            and setter to reflect the different data type.
         */

        System.out.println("======================================");
        System.out.println("Exercises 1, 2, 3, 4");
        System.out.println("======================================");
//        Car car = new Car("Tesla", new BigDecimal(28945), "Electric"); // old code before implementing Enum for EngineType
//        Car car = new Car("Tesla", new BigDecimal(28945), "Electric"); // old code before implementing Enum for EngineType

        Car tesla = new Car("Tesla", new BigDecimal(28945), EngineType.ELECTRIC);
        System.out.println(tesla.getManufacturer());
        System.out.println(tesla.getEngineType());
        System.out.println(tesla.getPrice());

        tesla.setPrice(new BigDecimal(30450));
        System.out.println("New price :: " + tesla.getPrice());


        System.out.println("======================================");
        System.out.println("Exercise 5");
        System.out.println("======================================");
        /*
            ==============
            Exercise 5
            ==============

            Create a class to represent a car dealership. It should have properties representing
            its name, the maximum number of cars it can have on display and all the cars currently in stock.

            ==============
            Exercise 6
            ==============

            Write a method to count the number of cars in the dealership. It doesn't need to take any parameters
            and should return an int. Write another method to add a car to the dealership. The method should have
            a Car parameter and doesn't need to return anything. Test your method by counting the number of cars,
            adding a new car then counting again to make sure the number has gone up by one.

            Hint: You will need some way of finding the first empty slot in the array to save the Car in. Maybe
            checking each slot in the array in turn would help?
         */

        // CREATE CARS
        Car beetle = new Car("BMW", new BigDecimal(28945), EngineType.ICE);
//        Car jeep = new Car("JEEP", new BigDecimal(35945), EngineType.ICE);
        Car beetle2 = new Car("BMW", new BigDecimal(35687), EngineType.ICE);

        // ADD CARS TO DEALERSHIP
        Dealership dealA = new Dealership("Zap Cars", beetle);
        dealA.setCar(tesla);
        dealA.setCar(beetle2);
//        dealA.setCar(jeep); // to test exceeding number of cars

        // OTHER OPERATIONS
        System.out.println("getCar() -- at position 1 ::" + dealA.getCar(1));
        System.out.println("getCars() :: " + dealA.getCars());
        Util.makingChanges("Name");
        dealA.setName("Zapp Cars");
        System.out.println("getName() :: " + dealA.getName());
        System.out.println(dealA);
        dealA.findCarByManufacturer("BMW");

    }

}
