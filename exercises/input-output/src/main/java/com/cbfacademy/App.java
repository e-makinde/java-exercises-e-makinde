package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class App {
    

    public static void fileReaderMethod() {
        String filePath = "/Users/esthermakinde/dev/cbf/java-exercises-e-makinde/exercises/input-output/src/main/resources/exercise.txt";
        // Using the "try with resources" block in the follow methods. Resources must be defined in the rounded brackets after "try". Resources put here are ones that will be automaticallly closed once the try block has been completed.
        // Resource to be autoclosed is a stream of strings containing the lines being read from the src file.
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }
    }




    public static void fileWriterMethod(){
        String writerFile = "/Users/esthermakinde/dev/cbf/java-exercises-e-makinde/exercises/input-output/src/main/resources/exercise2.txt";
        String fileName = "/Users/esthermakinde/dev/cbf/java-exercises-e-makinde/exercises/input-output/src/main/resources/exercise.txt";

        // Getting the path for both the src file and the writing file.
        Path writerPath = Paths.get(writerFile); 
        Path readerPath = Paths.get(fileName);

        // Copy the file from src file and write in a new file
        try {
            Files.copy(readerPath, writerPath);
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }
    }



    public static void main(String[] args) {
        fileReaderMethod();
        fileWriterMethod();
    }
}






