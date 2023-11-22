package de.ait.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsArt {
    public static void main(String[] args) {
        readInput();
    }
    public static void readInput(){
        int [] number ={1,3,5};

        try {
            System.out.println(number[10]);
        }
        catch (ArrayIndexOutOfBoundsException exception){}
        /*
        try {
            FileInputStream fileInputStream = new FileInputStream("Info.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            {}
        }*/
    }
}
