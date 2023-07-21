package com.havefunwith.modules.demos.generics;

public class Main {

    public static void main(String[] args) {
        Box<Phone> boxPhone = new Box<>();

        boxPhone.set(new Phone("225-546-4655"));

        System.out.println("boxPhone -- Phone: " + boxPhone.get());

        Box<Letter> boxLetter = new Box<>();

        boxLetter.set(new Letter("John"));

        System.out.println("boxLetter -- Letter: " + boxLetter.get());
    }

}
