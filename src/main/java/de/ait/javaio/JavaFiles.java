package de.ait.javaio;

import java.io.File;
import java.io.IOException;

public class JavaFiles {
    public static void main(String[] args) throws IOException {
        File fileOne = new File("fileOne.txt");
        fileOne.mkdir();
        String path = fileOne.getPath();
        String pathAbsolut = fileOne.getAbsolutePath();
        System.out.println(pathAbsolut);
        System.out.println(path);
        System.out.println(fileOne.createNewFile());
        System.out.println(fileOne.getName());
        System.out.println(fileOne.isAbsolute());
        System.out.println(fileOne.canRead());
        System.out.println(fileOne.canWrite());
        System.out.println(fileOne.exists());
        System.out.println(fileOne.isHidden());
        System.out.println(fileOne.length());

        System.out.println("==================");


        File fileTwo = new File("C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\fileTwo.txt");
        String pathTwo = fileTwo.getPath();
        String pathAbsolutTwo = fileTwo.getAbsolutePath();
        System.out.println(pathTwo);
        System.out.println(pathAbsolutTwo);
        System.out.println(fileTwo.createNewFile());
        System.out.println(fileTwo.isAbsolute());
    }
}
