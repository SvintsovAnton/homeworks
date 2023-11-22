package de.ait.javaio;

import java.io.IOException;

public class TestJavaIO {

    //weg zum File
    private static final String PATH = "C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\password.txt";
    //
    private static JavaReadWritePassFile javaReadWritePassFile;
    public static void main(String[] args) {
    //
        javaReadWritePassFile = new JavaReadWritePassFile(PATH);
        try {
            //lesen File durch Methode
            javaReadWritePassFile.readFile();
            javaReadWritePassFile.writeFile("Cohort 33");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
