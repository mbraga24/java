package com.havefunwith.combinedExercices.miniProjectSandbox.playground.pet;

import com.havefunwith.combinedExercices.miniProjectSandbox.playground.enums.PetType;

public class Pet {

    private String name;
    private PetType type;

    public Pet(String name, PetType type) {
        this.name = name;
        this.type = type;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
