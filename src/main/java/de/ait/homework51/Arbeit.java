package de.ait.homework51;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arbeit {
    public static void main(String[] args) throws IOException {
        File myfile = new File("C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\failik.txt");
        myfile.createNewFile();

        try (FileWriter fileWriter = new FileWriter(myfile)){
            fileWriter.write("app");
        }catch (IOException e){e.printStackTrace();
        }
    }


}
