package com.havefunwith.CLI.basics;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Files {

    private static String data_one = """
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
    """;

    private static String data_two = """
        id,first_name,last_name,email,gender
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

    private static String data_three = """
            Hello, world!""";

    public static void main(String[] args) {

        System.out.println("=========== EXERCISE 1 ===========\n");
        /*
            ==============
            Exercise 1
            ==============
            create a file with named data.csv under src with and write some code to
            add the contents of the following string to the file.
         */

        try {
            File file = createNewFile("src" + File.separator  + "dataWrite.csv");
            printToFile(file, data_one, false);

            // let user know file was created
            Thread.sleep(1000);
            System.out.println("File created -1-");
            Thread.sleep(1000);

            // let user know that file was deleted
            if (file.exists()) {
                file.delete();
                if (!file.exists())
                    System.out.println("File deleted -1-");
                Thread.sleep(2000);
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Exception -- Exercise 1 :: " + e.getMessage());
        }

        System.out.println("\n=========== EXERCISE 2 ===========\n");
        /*
            ==============
            Exercise 2
            ==============
            Read back out the contents of the file stored under src/data.csv
         */

        try {
            File file = createNewFile("src" + File.separator  + "dataWriteAndRead.csv");
            printToFile(file, data_one, false);

            // let user know file was created
            Thread.sleep(1000);
            System.out.println("File created. -2-\n");
            Thread.sleep(1000);

            Scanner scanner = new Scanner(file);

            System.out.println("File Content below:");
            Thread.sleep(1000);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println();
            Thread.sleep(2000);

            // let user know that file was deleted
            if (file.exists()) {
                scanner.close();
                file.delete();
                if (!file.exists())
                    System.out.println("File deleted -2-");
                Thread.sleep(2000);
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Exception -- Exercise 2 :: " + e.getMessage());
        }

        System.out.println("\n=========== EXERCISE 3 ===========\n");
         /*
            ==============
            Exercise 3
            ==============
            Print each line from src/data.csv
         */
        try {
            // creating File, FileWriter and PrintWriter without try-with-resources
            File file = new File("src" + File.separator  + "anotherOne.csv");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println(data_two);
            writer.flush();
            writer.close();

            // let user know file was created
            Thread.sleep(1000);
            System.out.println("File created. -3-\n");
            Thread.sleep(1000);

            Scanner scanner = new Scanner(file);

            System.out.println("File Content below:");
            Thread.sleep(1000);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

            System.out.println();
            Thread.sleep(2000);

            // let user know that file was deleted
            if (file.exists()) {
                scanner.close();
                file.delete();
                if (!file.exists())
                    System.out.println("File deleted -3-");
                Thread.sleep(2000);
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Exception -- Exercise 3 :: " + e.getMessage());
        }

        System.out.println("\n=========== EXERCISE 4 ===========\n");
        /*
            ==============
            Exercise 4
            ==============
            Print each line from src/data.csv skipping the header.

            output: id,first_name,last_name,email,gender
         */
          try {
              File file = createNewFile("src" + File.separator  + "yet");
              printToFile(file, data_one, false);

            // let user know file was created
              Thread.sleep(1000);
            System.out.println("File created. -4-\n");
            Thread.sleep(1000);

            Scanner scanner = new Scanner(file);

            System.out.println("File Content below:");
            Thread.sleep(1000);

            // skips the first line (header) - id,first_name,last_name,email,gender
            scanner.nextLine();
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
              System.out.println();
              Thread.sleep(1000);

            // let user know that file was deleted
            if (file.exists()) {
                // close scanner to avoid: "the process cannot access the file because it is being used by another process java"
                scanner.close();
                file.delete();
                if (!file.exists())
                  System.out.println("File deleted -4-");
                Thread.sleep(2000);
            }

          } catch (IOException | InterruptedException e) {
              System.out.println("Exception -- Exercise 4 :: " + e.getMessage());
          }

        System.out.println("\n=========== EXERCISE 5 ===========\n");
        /*
            ==============
            Exercise 5
            ==============
            Append any data to a file over and over until it reaches an X amount of bytes, then
            delete the file.
        */
        try {
            File file = new File("src/appendToFile");
            printToFile(file, data_three, true);

            // let user know file was created
            Thread.sleep(1000);
            System.out.println("File created. -5-\n");
            Thread.sleep(1000);

            Scanner scanner = new Scanner(file);

            System.out.println("File Content below:");
            Thread.sleep(1000);

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println();
            Thread.sleep(1000);

            if (file.exists() && java.nio.file.Files.size(Path.of("src/appendToFile")) == 60) {
                scanner.close();
                file.delete();
                if (!file.exists())
                    System.out.println("File deleted -5-");
                Thread.sleep(2000);
            }

        } catch(IOException | InterruptedException e) {
            System.out.println("Exception -- Exercise 5 :: " + e.getMessage());
        }

    }

    public static File createNewFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    public static void printToFile(File file, String data, boolean append) {
        try(
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
                ) {
            writer.println(data);
        } catch (IOException e) {
            System.out.println("::" + e.getMessage());
        }
    }
}


// https://www.dbi-services.com/blog/java-cannot-delete-file/