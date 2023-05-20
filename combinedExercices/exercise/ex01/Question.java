package com.havefunwith.combinedExercices.exercise.ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question {

    // these static variables are unique to the class.
    private static final String PATTERN = "E, MMM/dd/yyyy -- HH:mm:ss z";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN);
    private static int count = 0;

    // these are instance variables unique to each instance.
    private int id;
    private String question;
    private String createAt;

    public Question() {}

    public Question(String question) {
        this.question = question;
        this.createAt = simpleDateFormat.format(new Date());
        setId(count++); // increment count and set the new ID
    }

    public String getCreateAt() {
        return createAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }
}
