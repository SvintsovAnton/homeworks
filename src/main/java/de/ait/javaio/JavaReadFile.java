package de.ait.javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\MyDirectory\\Book.txt");
        file.createNewFile();

        //created und initilisation Reader for write file
        FileReader fileReader = new FileReader(file);
        //for string write
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int counter =0;
        String wordToCount = "I";
        String lineInDocument = bufferedReader.readLine();

        //write all info in File, if File empty ->end

        while (lineInDocument != null) {
            System.out.println(lineInDocument);
            lineInDocument = bufferedReader.readLine();
            if (lineInDocument!=null && lineInDocument.contains(wordToCount)){
                counter++;
            }
        }
        System.out.println("Counter ->"+counter);
        }
    }

