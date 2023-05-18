package com.havefunwith.combinedExercices.miniProjectSandbox.playground.person;

import java.util.Objects;

public class PersonService {

    public Boolean addPerson(Person person) {
        if (Objects.isNull(person.getFirstName()) || person.getFirstName().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        return true;
    }

}
