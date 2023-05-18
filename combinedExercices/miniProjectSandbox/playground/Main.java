package com.havefunwith.combinedExercices.miniProjectSandbox.playground;

import com.havefunwith.combinedExercices.miniProjectSandbox.playground.automobile.CarService;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.enums.*;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.address.Address;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.automobile.Car;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.garage.GarageService;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.person.Person;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.person.PersonService;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.pet.Pet;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        /*
            ==============
            Exercise
            ==============
            Create Person and Address class with its attributes.
         */

        Address address = new Address("Somewhere over the rainbow Street 123", "apt 1010", "609344", Country.UNITEDSTATES);
        Pet bubble = new Pet("Bubble", PetType.DOG);
        Pet pod = new Pet("Pod", PetType.CAT);

        Car beetle = new Car(CarBrand.VOLKSWAGEN, new BigDecimal(20995));
        Car beetle2 = new Car(CarBrand.VOLKSWAGEN, new BigDecimal(15999));

        Car bmw = new Car(CarBrand.BMW, new BigDecimal(20995));
        Car tesla = new Car(CarBrand.TESLA, new BigDecimal(15999));

        Pet pets[] = {bubble, pod};
        Car marlonCars[] = {beetle, beetle2};
        Car mickelCars[] = {bmw, tesla};
        Person noName = new Person("", 25, Gender.MALE, address, pets, marlonCars);
        Person marlon = new Person("marlon", 25, Gender.MALE, address, pets, marlonCars);
        Person mickel = new Person("mickel", 30, Gender.MALE, address, pets, mickelCars);
//        System.out.println("Person :: " + marlon);

        /*
            ==============
            Experiment - Playground :))
            ==============
         */
        GarageService garageService = new GarageService();
        PersonService personService = new PersonService();
        CarService carService = new CarService();
        Person rod = new Person(pets, marlonCars);

//        personService.addPerson(rod); // throws illegal exception
//        personService.addPerson(noName); // throws illegal exception

        garageService.addCarToGarage(marlonCars, marlon);
//        garageService.addCarToGarage(mickelCars, mickel);

        System.out.println(carService.addCar(bmw));

        System.out.println(carService.findAllCars());


    }
}
