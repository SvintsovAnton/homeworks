package de.ait.javaio;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JavaReadNewFile {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\MyDirectory\\Book.txt");
        file.createNewFile();
        int counter=0;

        Path path = Paths.get(file.getAbsolutePath());
        List<String> linesInDocument = Files.readAllLines(path, StandardCharsets.UTF_8);
        //linesInDocument.forEach(System.out::println);

        for(String line:linesInDocument){
            if (line.contains("yesterday")){
                counter++;
            }
        }

        System.out.println("---->"+counter);

    }
}
