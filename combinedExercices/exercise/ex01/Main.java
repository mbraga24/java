package com.havefunwith.combinedExercices.exercise.ex01;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String data = """
                        id,first_name,last_name,email,gender
                        1,Fanchette,Williamson,fwilliamson0@github.com,F
                        2,Aleksandr,Matts,amatts1@webs.com,M
                        3,Maurie,Cordero,mcordero2@google.co.jp,M
                        4,Donnajean,Crowson,dcrowson3@google.com.hk,F
                        5,Ricardo,Gofton,rgofton4@nytimes.com,M
                        6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                        7,Marjorie,Blumsom,mblumsom6@joomla.org,F
                        8,Lester,Huyghe,lhuyghe7@jugem.jp,M
                        9,Merrily,Stangoe,mstangoe8@tiny.cc,F
                        10,Reider,Karel,rkarel9@github.io,M
                        11,Dory,Jolliff,djolliffa@wufoo.com,F
                        12,Homerus,Averay,haverayb@skyrock.com,M
                        13,Alyda,Muglestone,amuglestonec@is.gd,F
                        14,Pinchas,Louca,ploucad@google.es,M
                        15,Cherin,Eltringham,celtringhame@parallels.com,F
                        16,Mufi,Rothert,mrothertf@dropbox.com,F
                        17,Jordana,Everex,jeverexg@ucla.edu,F
                        18,Belle,Rother,brotherh@auda.org.au,F
                        19,Clevie,Sifflett,csiffletti@furl.net,M
                        20,Gretchen,Abell,gabellj@1688.com,F
                    """;

        System.out.println("======================================");
        System.out.println("Exercise 1 & 2");
        System.out.println("======================================");
        /*
            ==============
            Exercise 1
            ==============
            Create a file named data.csv under src and write some code to add the
            contents of the string provided above to the file.

            Read the file and turn each row into objects stored in an Array of type Person.

            ==============
            Exercise 2
            ==============
            Create a class that models a person with the following characteristics: firstName, lastName gender and email

            Next create 2 objects. one male and one female using a constructor that has all properties.
         */

        try {
            File file = new File("src" + File.separator  + "com/havefunwith/resources/data.csv");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println(data);
            writer.flush();
            writer.close();

            Scanner scanner = new Scanner(file);
            int lines = countLines(file);
            int count = 0;
            System.out.println("lines :: " + lines);
            Person people[] = new Person[lines];

            scanner.nextLine();
            while (scanner.hasNext()) {
                String record = scanner.nextLine();

                int id = returnId(record);
                String firstName = record.split(",")[1];
                String lastName = record.split(",")[2];
                String email = record.split(",")[3];
                String gender = record.split(",")[4];

                people[count] = new Person(id, firstName, lastName, email, gender);
                count++;
            }
            System.out.println("Array of people: " + Arrays.toString(people));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("======================================");
        System.out.println("Exercise 3");
        System.out.println("======================================");
        /*
            ==============
            Exercise 3
            ==============
            Create a survey questionnaire application that saves users answers to a file.
            Think about the classes and what you might need.
            For example:
            Questionnaire - id, createdAt, List of Questions,
            Question - the question
            Person - name, email, dob

            Use your imagination and go bananas with your implementation.
         */

        // PERSONAL QUESTIONS
        Question pq1 = new Question("What's your name?");
        Question pq2 = new Question("How old are you?");
        Question pq3 = new Question("How are you?");

        // BUSINESS QUESTIONS
        Question bq1 = new Question("What do you do for a living?");
        Question bq2 = new Question("How much money do you make?");
        Question bq3 = new Question("Do you like what you do?");

        Question[] personalQstns = {pq1, pq2, pq3};
        Question[] businessQstns = {bq1, bq2, bq3};

        Questionnaire personalQuestionnaire = new Questionnaire("Personal", personalQstns);
        Questionnaire businessQuestionnaire = new Questionnaire("Business", businessQstns);

        System.out.println(personalQuestionnaire.toString());
        System.out.println(businessQuestionnaire.toString());
    }

    private static int returnId(String record) {
        return Integer.parseInt(record.split(",")[0].split(" ")[4]);
    }

    private static int countLines(File file) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.readLine() != null) lines++;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lines-2;
    }

}
