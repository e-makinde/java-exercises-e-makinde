package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class App {
    public static void fileReaderMethod() {
        String fileName = "/Users/esthermakinde/dev/cbf/java-exercises-e-makinde/exercises/input-output/src/main/java/com/cbfacademy/exercise.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }
    }
    public static void fileWriterMethod(){
        String writerFile = "/Users/esthermakinde/dev/cbf/java-exercises-e-makinde/exercises/input-output/src/main/resources/exercise2.txt";
        String fileName = "/Users/esthermakinde/dev/cbf/java-exercises-e-makinde/exercises/input-output/src/main/java/com/cbfacademy/exercise.txt";
        try (
        FileOutputStream fileOutputStream = new FileOutputStream(writerFile);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        PrintWriter writer = new PrintWriter(outputStreamWriter);
        BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.printf(line);
            }
            outputStreamWriter.close();
        }  catch (IOException e) {
            System.out.println("File writing exception: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        fileReaderMethod();
        fileWriterMethod();
    }
}






