package com.havefunwith.combinedExercices.exercise.ex01;

import java.util.Arrays;

// READ
// https://www.geeksforgeeks.org/instance-initialization-block-iib-java/
// https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
public class Questionnaire {

    private String title;
    private Question[] listOfQuestions;

    public Questionnaire(String title, Question[] listOfQuestions) {
        this.title = title;
        this.listOfQuestions = listOfQuestions;
    }

    public String retrieveQuestionById(int id) {
        return this.listOfQuestions[id].getQuestion();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Question[] getListOfQuestions() {
        return listOfQuestions;
    }

    public void setListOfQuestions(Question[] listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "title='" + title + '\'' +
                ", listOfQuestions=" + Arrays.toString(listOfQuestions) +
                '}';
    }
}
