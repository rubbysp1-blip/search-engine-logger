package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args)  {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logs.txt", true));
        } catch (IOException e) {
            System.out.println("File Not Found: Please Check The File Name.");
        }
    }

    private static void logAction(String action){

    }
}
