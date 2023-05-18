package com.havefunwith.combinedExercices.miniProjectSandbox.playground.person;

import com.havefunwith.combinedExercices.miniProjectSandbox.playground.enums.Gender;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.address.Address;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.automobile.Car;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.pet.Pet;

import java.util.Arrays;

public class Person {

    private String firstName;
    private int age;
    private Gender gender;
    private Address address;
    private Pet[] pets;
    private Car[] cars;

    public Person(String firstName, int age, Gender gender, Address address, Pet[] pets, Car[] cars) {
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.pets = pets;
        this.cars = cars;
    }

    public Person(Pet[] pets, Car[] cars) {
        this.pets = pets;
        this.cars = cars;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address=" + address +
                ", pets=" + Arrays.toString(pets) +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
