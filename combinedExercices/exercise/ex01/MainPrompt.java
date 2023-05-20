package com.havefunwith.combinedExercices.exercise.ex01;

import java.io.*;
import java.util.Scanner;

public class MainPrompt {

    public static void main(String[] args) {

        Question pq1 = new Question("What's your name?");
        Question pq2 = new Question("How old are you?");
        Question pq3 = new Question("How are you?");

        Question[] personalQstns = {pq1, pq2, pq3};
        Questionnaire personalQuestionnaire = new Questionnaire("Personal", personalQstns);

        Question bq1 = new Question("What do you do for a living?");
        Question bq2 = new Question("How much money do you make?");
        Question bq3 = new Question("Do you like what you do?");

        Question[] businessQstns = {bq1, bq2, bq3};
        Questionnaire businessQuestionnaire = new Questionnaire("Business", businessQstns);

        Scanner console = new Scanner(System.in);

        saveAnswersToAFile(personalQuestionnaire, console);
        saveAnswersToAFile(businessQuestionnaire, console);
        System.out.println("===================================");
        System.out.println("Thank you for answering our survey.");
    }

    private static void saveAnswersToAFile(Questionnaire questionnaire, Scanner console) {
        int totalQstns = questionnaire.getListOfQuestions().length;
        String answer;
        try {
            File file = new File("src" + File.separator + "user" + questionnaire.getTitle() + "Answer.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fileWriter);

            writer.println(questionnaire.getTitle() + " Questions/Answers");
            for (int i = 0; i < totalQstns; i++) {
                System.out.println(questionnaire.retrieveQuestionById(i));
                answer = console.nextLine();
                writer.println(i + 1 + ") " + questionnaire.retrieveQuestionById(i));
                writer.println("==> " + answer);
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void saveQuestionsToAFile(String answer, File file) {
    }



}
