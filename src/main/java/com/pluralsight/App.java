package com.pluralsight;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    static LocalDateTime localDateTime = LocalDateTime.now();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)  {

        System.out.print("What are you doing today: ");
        String action = input.nextLine().trim();
        input.nextLine();
        logAction(action);

        printLogInformation();

    }

    private static void logAction(String action){

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logs.txt", true));
            bufferedWriter.write(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " " + action);

        } catch (IOException e) {
            System.out.println("File Not Found: Please Check The File Name.");
        }
    }

    private static void printLogInformation(){

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("logs.txt"));
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File Not Found: Please Check The File Name.");
        }
    }
}
